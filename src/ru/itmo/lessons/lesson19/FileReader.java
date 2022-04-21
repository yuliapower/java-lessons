package ru.itmo.lessons.lesson19;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class FileReader {
    //java.io
    //java.nio
    // new File (файл или директория)

    // программа          источник
    // InputStream (байты) - отвечает за получение потока байт в программу
    // OutputStream (байты) отправка данных из программы
    // Reader (char) получение потока чар в прогрумму
    // Writer (char) отправка данных из программы

    // FileInputStream / FileOutputStream
    // ObjectInputStream / ObjectOutputStream

    // FileInputStream(ObjectInputStream(CustomStream(объект)))
    //если напишем try with resources () в круглых скобках открываем канал и он закрывается автоматически
    public static boolean writeToFile(byte[] data, File file) /*throws FileNotFoundException*/ {
        boolean result = false;
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
            //канал закрывается когда: 1. все инструкции блока try выполнены без ошибок
            // 2. в блоке try произошла ошибка. Ресурсы будут закрыты
            // до перехвата исключения блоком catch
            //Если класс, объект которого создается в try resources
            // реализует AutoCloseable интерфйс
            // и его абстрактный метод void close()
            // если try with resources не используется,закрывать ресурсы надо
            // в блоке finally (если не используем круглые скобки)
            //true-дозапись файла в new FileOutputStream, false перезапись файла в new FileOutputStream

            fileOutputStream.write(data);
            result = true;
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось использовать файл");
        } catch (IOException e) { //FileNotFoundException - наследник IOException
            System.out.println("Не удалось записать данные в файл");
        }
        return result;
    }

    public static byte[] readFromFile(File file) {
        byte[] result = null;
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            result = fileInputStream.readAllBytes();
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Не удалось использовать файл");
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("Не удалось записать данные в файл");
        }
        return result;
    }

    public static boolean writeFromConsole(File file) {
        boolean result = false;
        try (FileOutputStream fileOutput = new FileOutputStream(file, true);
             //декоратор
             //Декоратор декоратор = new Декоратор(fileOutput)
             BufferedOutputStream buffer = new BufferedOutputStream(fileOutput)) {
//в круглых скобках можно создать несколько объектов
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Введите данные или stop для выхода");
                String userInput = scanner.nextLine();
                if ("stop".equalsIgnoreCase(userInput)) break;
                buffer.write(userInput.getBytes());
                //buffer декоратор типа OutputStream вызывает метод write объекта, который был передан в конструкторе
            }
            result = true;
        } catch (IOException e) {
            System.out.println("Не удалось использовать файл");
        }
        return result;
    }

    public static String readWithBuffer(File file) {
        String result = null;
        try (FileInputStream fileInput = new FileInputStream(file);
             BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
             ByteArrayOutputStream byteArray = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[300];
            int count;
            while ((count = bufferedInput.read(buffer)) != -1) {
                byteArray.write(buffer, 0, count);
            }
            result = new String(byteArray.toString());

        } catch (IOException e) {
            System.out.println("Ошибка чтения");
        }
        return result;
    }

    // метод для преобразования изображения в байты.но это все есть в готовых фреймворках
    public static boolean byteArrayToImage(File file, byte[] bytes) throws IOException {
        try (ByteArrayInputStream byteArray = new ByteArrayInputStream(bytes)) {
            BufferedImage image = ImageIO.read(byteArray);
            return ImageIO.write(image,"png",file);
        }
    }

    public static byte[] imageToBytes(File file) throws IOException{
        BufferedImage image = ImageIO.read(file);
        ByteArrayOutputStream arrayOutput = new ByteArrayOutputStream();
        ImageIO.write(image,"png", arrayOutput);
        return arrayOutput.toByteArray();
    }

//HW
//разобраться с классом Properties
    //как хранит данные
    //как добавить данные
    // как получить данные

    // имя-файла.properties

    //как прочитать данные из properties файла в эксземпляр Properties
    //чтение объекта файла пропертис

}
