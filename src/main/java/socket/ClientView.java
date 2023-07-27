package socket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 聊天室图形化客户端
 */
public class ClientView {

    private Socket socket;
    private JTextArea textArea;
    private JTextField textField;
    private PrintWriter printWriter;

    public ClientView() throws IOException {
        socket = new Socket("localhost",8088);
        OutputStream out = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        printWriter = new PrintWriter(bw, true);
    }

    public void start() {

        JFrame frame = new JFrame("Chat Room");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        textField = new JTextField();
        JButton button = new JButton("Send");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                printWriter.println(text);
                textField.setText("");
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(textField, BorderLayout.CENTER);
        panel.add(button, BorderLayout.EAST);
        frame.add(panel, BorderLayout.SOUTH);

        frame.setVisible(true);

        // 设置完界面后，再启动消息接收线程
        ServerHandler serverHandler = new ServerHandler();
        Thread thread = new Thread(serverHandler);
        thread.start();
    }

    class ServerHandler implements Runnable {

        @Override
        public void run() {
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                String message;
                while ((message = br.readLine()) != null) {
                    textArea.append(message + "\n");
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ClientView client = new ClientView();
        client.start();
    }
}
