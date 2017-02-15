package godofjava.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by KimBangHyun on 2017. 2. 16..
 */
public class SocketServerSample {
    public static void main(String[] args) {
        SocketServerSample sample = new SocketServerSample();
        sample.startServer();

    }

    public void startServer() {
        ServerSocket server = null;
        Socket client = null;
        try {
            // ServerSocket 객체 생성 9999포트 이
            server = new ServerSocket(9999);
            while(true) {
                System.out.println("Server:Waiting for requiest.");
                // 호출 대기. 연결 완료되면 socket 객체 리턴
                client=server.accept();
                System.out.println("Server:Accepted");
                // Socket 클래스에 선언된 getInputStream 메소드 호출 -> 데이터를 받는다(InputSteam 형태
                InputStream stream = client.getInputStream();
                BufferedReader in = new BufferedReader(new InputStreamReader(stream));
                String data = null;
                StringBuilder receivedData = new StringBuilder();
                while((data = in.readLine()) != null) {
                    receivedData.append(data);
                }
                System.out.println("Received data:" + receivedData);
                in.close();
                stream.close();
                client.close();
                if(receivedData.toString().equals("EXIT")) {
                    System.out.println("Stop SocketServer");
                    break;
                }
            System.out.println("--------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(server != null) {
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
