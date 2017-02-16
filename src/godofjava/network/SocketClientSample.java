package godofjava.network;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

/**
 * Create file : ${FILE_NAME}
 * Creater : KimBangHyun
 * Create time : 2017. 2. 16. 오전 8:59
 */
public class SocketClientSample {
    public static void main(String[] args) {
        SocketClientSample sample = new SocketClientSample();
        sample.sendSocketSample();

    }

    private void sendSocketSample() {
        for (int loop=0 ; loop<3 ; loop++) {
            sendSocketData("I liked java at "+ new Date());
        }
        sendSocketData("EXIT");
    }

    private void sendSocketData(String data) {
        Socket socket = null;
        try {
            System.out.println("Client:Connecting");
            socket = new Socket("127.0.0.1",9999);
            System.out.println("Client:connect status="+socket.isConnected());
            Thread.sleep(1000);
            OutputStream stream = socket.getOutputStream();
            BufferedOutputStream out = new BufferedOutputStream(stream);
            byte[] bytes = data.getBytes();
            out.write(bytes);
            System.out.println("Client:Sent data");
            out.close();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        } finally {
            if ( socket!=null ) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
