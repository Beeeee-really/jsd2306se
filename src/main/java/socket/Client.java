package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {


    /*
            java.net.Socket 套接字,英文原译:插座

            Socket封装了TCP协议的通讯细节，使用它就可以
         */
    private Socket socket;

    public Client() {


        /*
            Socket常用的构造器
            Socket(String host,int port)
            该构造器实例化时就是根据指定的路径与服务端链接的过程
            参数1:服务区所在的IP地址
            参数2:运行在服务器上对应的服务器端应用程序的端口号
            IP地址用于找到网络上服务器所在的计算机，端口号用于找到运行在计算机上的应用程序
         */
        try {
            System.out.println("正在连接服务端...");
            socket = new Socket("localhost", 8088);
            System.out.println("与服务端建立连接!");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("名称:");
        String name = scan.next();
//        System.out.println("名称:");
//        String name = scan.next();


        try {
            //启动用于读取消息的线程
            //方法2
//            ServerHandler handler = new ServerHandler();
//            Thread t1 = new Thread(handler);
//            t1.setDaemon(true);
//            t1.start();

            OutputStream out = socket.getOutputStream();

            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);

            BufferedWriter bw = new BufferedWriter(osw);

            PrintWriter pw = new PrintWriter(bw, true);
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

//方法1
            Thread t1 = new Thread() {
                public void run() {
                    while (true) {
                        String line;
                        try {
                            line = bufferedReader.readLine();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(line);
                    }
                }
            };

            t1.start();

            System.out.println(":");
            while (true) {
                String line = scan.nextLine();
                if ("exit".equals(line)) {
                    break;
                }
                pw.println(name  + ":" + line);
//                pw.println(line);


//                line = bufferedReader.readLine();
//                System.out.println(line);


            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Client client = new Client();
        client.start();


    }

    private class ServerHandler implements Runnable {
        public void run() {
            //通过socket获取输入流
            try {
                InputStream inputStream = socket.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                String message;
                while ((message = bufferedReader.readLine()) != null) {
                    System.out.println(message);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

