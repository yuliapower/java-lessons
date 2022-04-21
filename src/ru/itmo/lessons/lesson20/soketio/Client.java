package ru.itmo.lessons.lesson20.soketio;

import java.io.IOException;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Client {

    private int port;
    private String ip;
    private Scanner scanner;

    public Client(int port, String ip) {
        this.port = port;
        this.ip = ip;
        scanner = new Scanner(System.in);
    }


    public void start() throws Exception {
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        String messageText;

        while (true) {
            //exit
            //ping
            System.out.println("Введите сообщение");
            messageText = scanner.nextLine();
            if (messageText.equalsIgnoreCase("/exit")) {
                break;
            }
            sendAndPrintMessage(SimpleMessage.getMessage(name, messageText));
        }
    }

    private void sendAndPrintMessage(SimpleMessage message) throws Exception {
        try (Connection connection = new Connection(getSocket())) { // getSocket Только для того,
            // чтобы посмотреть методы сокета
            connection.sendMessage(message);
            SimpleMessage formServer = connection.readMessage();
         //   System.out.println("ответ от сервера: " + formServer);
            if (message.getText().equals("/ping")) {
                pingMessage(message, formServer);
            } else {
                System.out.println("ответ от сервера: " + formServer);
            }
        }
    }

    private void pingMessage(SimpleMessage message, SimpleMessage formServer) {
        LocalDateTime sendTime = message.getDateTime();
        long sendTimeNano = sendTime.getNano();
        LocalDateTime serverTime = formServer.getDateTime();
        long serverTimeNano = serverTime.getNano();
        long between = serverTimeNano - sendTimeNano;
        System.out.println("ответ от сервера: время за которое сообщение доходит до сервера и возвращается обратно: " + between + " наносекунд "
                + "время отправки: " + sendTimeNano + ", время возврата: " + serverTimeNano);

    }

    private Socket getSocket() throws IOException {
        Socket socket = new Socket(ip, port);
        return socket;
    }


    public static void main(String[] args) {
        int port = 8091;
        String ip = "127.0.0.1";

        try {
            new Client(port, ip).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}