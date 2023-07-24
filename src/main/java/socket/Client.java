package socket;

import java.io.IOException;
import java.net.Socket;

/**
 * 聊天室客户端
 */
public class Client {
    /*
        java.net.Socket 套接字,英文原译:插座

        Socket封装了TCP协议的通讯细节，使用它就可以
     */
    private Socket socket;

    public Client(){
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
            socket = new Socket("176.46.103.238",8088);
            System.out.println("与服务端建立连接!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void start(){

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

}
