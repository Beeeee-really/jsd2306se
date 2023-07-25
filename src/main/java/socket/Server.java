package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

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
            System.out.println("等待客户端连接...");
            Socket socket = serverSocket.accept();//阻塞
            System.out.println("一个客户端连接了!");
            /*
                Socket重要的方法
                InputStream getInputStream()
                通过Socket获取的方法输入流可以读取远端计算机发送过来的数据
             */
            InputStream in = socket.getInputStream();

            InputStreamReader isr = new InputStreamReader(in);

            BufferedReader br = new BufferedReader(isr);

            String message = br.readLine();
            System.out.println("客户端说:" + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
