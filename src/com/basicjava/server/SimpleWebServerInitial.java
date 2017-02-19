package com.basicjava.server;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 2. 20. 오전 8:07
 */
public class SimpleWebServerInitial {
    public static void main(String[] args) {
        SimpleWebServerInitial server = new SimpleWebServerInitial();
        int port = 9000 ;
        server.start(port) ;

    }

    private final int BUFFER_SIZE = 2048 ;

    private void start(int port) {
        // ServerSocket 객체 생성(try 절 밖)
        ServerSocket server = null;

        try {
            // ServerSocket 객체 생성(try 절 안)
            server = new ServerSocket(port);
            while (true) {
                Socket socket = server.accept();
                // Request Read.
                InputStream request = new BufferedInputStream(socket.getInputStream()) ;
                byte[] receivedBytes = new byte[BUFFER_SIZE] ;
                request.read(receivedBytes) ;
                String requestData = new String(receivedBytes).trim() ;
                System.out.println("RequestData=\n"+requestData) ;
                System.out.println("--------------");
                // Make Response data and Response.
                PrintStream response = new PrintStream(socket.getOutputStream()) ;
                response.println("HTTP/1.1 200 OK");
                response.println("Content-type: text/html") ;
                response.println();
                response.println("It is working");
                response.flush();
                response.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (server!=null) {
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
