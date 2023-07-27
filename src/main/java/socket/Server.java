package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 聊天室服务端
 */
public class Server {
    /*
        java.net.ServerSocket
        ServerSocket是运行在服务端的，主要有两个作用
        1:向系统申请并打开服务端口，客户端可以通过这个端口与服务器建立连接
        2:监听该接口，一旦客户端请求连接就会接受连接同时创建一个Socket对象使用它就可以与客户端交互了
     */
    private ServerSocket serverSocket;

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
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);


                //通过socket获取输出流
                OutputStream out = socket.getOutputStream();//获取输出流
                OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);//
                BufferedWriter bw = new BufferedWriter(osw);//缓冲流
                PrintWriter pw = new PrintWriter(bw,true);


                String message;
                while ((message = br.readLine()) != null) {
//                    System.out.println(host + ":" + message);
                    System.out.println(message);
                    pw.println(message);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
