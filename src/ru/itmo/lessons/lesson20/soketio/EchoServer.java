package ru.itmo.lessons.lesson20.soketio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    private int port;
    private Connection connection;

    public EchoServer(int port) {
        this.port = port;
    }

    public void start() throws IOException, ClassNotFoundException {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started...");
            while (true) {
                Socket socket = serverSocket.accept(); // ++ connectionsCount
                connection = new Connection(socket);

                long count = 0;
                count = +1;
                //здесь будет переменная каунт-которая будет увеличиваться для команды count
                SimpleMessage message = connection.readMessage();
                printMessage(message);
                //connection.sendMessage(SimpleMessage.getMessage("server", "сообщение получено"));
                if (message.getText().equals("/help")) {
                    connection.sendMessage(SimpleMessage.getMessage("server", "/help; /count; /ping; /exit"));
               }
               if (message.getText().equals("/count")) {
                   connection.sendMessage(SimpleMessage.getMessage("server", "количество подключений " + count));
               } if (!message.getText().equals("/ping")) {
                       connection.sendMessage(SimpleMessage.getMessage("server", "неизвестная команда, введите /help для справки"));
                } else {
                    connection.sendMessage(SimpleMessage.getMessage("server", "сообщение получено"));
                }

            }
        }

    }


    private void printMessage(SimpleMessage message) {
        System.out.println("получено сообщение: " + message);
    }

    public static void main(String[] args) {
        int port = 8091;
        EchoServer messageServer = new EchoServer(port);
        try {
            messageServer.start();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}