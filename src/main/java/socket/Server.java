package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * 聊天室服务端
 */
public class Server {

    private ServerSocket serverSocket;

    private List<PrintWriter> allOut = new ArrayList<>();
    /*
        java.net.ServerSocket
        ServerSocket是运行在服务端的，主要有两个作用
        1:向系统申请并打开服务端口，客户端可以通过这个端口与服务器建立连接
        2:监听该接口，一旦客户端请求连接就会接受连接同时创建一个Socket对象使用它就可以与客户端交互了
     */


    public Server() {

        try {
            System.out.println("服务器启动中...");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务器启动成功!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start() {
        try {
            while (true) {
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();//阻塞
                System.out.println("一个客户端连接了!");
                //启动一个线程与该客户端进行交互
                ClientHandler clientHandler = new ClientHandler(socket);
                Thread t = new Thread(clientHandler);
                t.start();

            }
            /*
                Socket重要的方法
                InputStream getInputStream()
                通过Socket获取的方法输入流可以读取远端计算机发送过来的数据
             */

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 该线程是负责与指定的客户进行交互
     */
    private class ClientHandler implements Runnable {
        private Socket socket;
        private String host;//记录该客户端的ip地址信息


        public ClientHandler(Socket socket) {
            this.socket = socket;
            this.host = socket.getInetAddress().getHostAddress();
        }

        public void run() {
            PrintWriter pw = null;
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);


                //通过socket获取输出流
                OutputStream out = socket.getOutputStream();//获取输出流
                OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);//
                BufferedWriter bw = new BufferedWriter(osw);//缓冲流
                pw = new PrintWriter(bw, true);

                //将该客户端的输出流存入共享集合
                /*
                    临界资源通常可以作为同步监视器对象使用，限制多个线程不能同时操作它
                 */
                synchronized (allOut) {
                    allOut.add(pw);
                }
                sendMessage("ip:" + host + "连接了服务器,当前在线人数:" + allOut.size());


                String message;

                while ((message = br.readLine()) != null) {
//                    System.out.println(host + ":" + message);
                    sendMessage(message);
                    //将消息发送至所有客户端
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                //客户端断开连接
                //1.将该客户端的输出流删除
                synchronized (allOut) {
                    allOut.remove(pw);
                }
                sendMessage("ip:" + host + "与服务器断开了连接,当前在线人数:" + allOut.size());
                //2.关闭Socket来释放资源
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        //将消息广播
        private void sendMessage(String message) {
            System.out.println(message);
            //将消息发送至所有客户端
            synchronized (allOut) {//增删互斥
                //因为新循环(迭代器)遍历集合时要求不能通过集合方法增删元素，因此要与增删互斥
                for (PrintWriter o : allOut) {
                    o.println(message);
                }
            }
        }
    }
}
