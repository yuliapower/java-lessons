package ru.itmo.lessons.lesson15;

import java.util.*;

public class App {
    public static void main(String[] args) {


        User user1 = new User("123", "qwerty", Role.USER, 23);
        User user2 = new User("user", "111", Role.USER, 23);
        User user3 = new User("777", "qw", Role.ADMIN, 23);
        User user4 = new User("ilya", "qwerty", Role.ADMIN, 24);

        HashMap<String, User> hashMap = new HashMap<>();

        hashMap.put(user1.getLogin(), user1);
        hashMap.put(user2.getLogin(), user2);
        hashMap.put(user3.getLogin(), user3);
        hashMap.put(user4.getLogin(), user4);
        System.out.println(hashMap);
//Логины всех пользователей, старше 20 лет скопировать в отдельный List
        List<String> logins = new ArrayList<>();
        for (Map.Entry<String, User> pair : hashMap.entrySet()) {
            if (pair.getValue().getAge() > 20) {
                logins.add(pair.getKey());
            }
        }
        System.out.println(logins);

        // Вывести логины и пароли пользователей с ролью ADMIN
        for (Map.Entry<String, User> pair : hashMap.entrySet()) {
            if (pair.getValue().getRole().equals(Role.ADMIN)) {
                System.out.println("Логин и пароль админа: " + pair.getValue().getLogin() + pair.getValue().getPwd());
            }
        }

        for (User user : hashMap.values()) {
            //      if ()
        }

        //На основе существующей мапы создать новую, где ключи - возраст пользователей
        //значения - списки пользователей соответствующего возраста
        // новая мапа
        // перебор старой-наполнение новой
        HashMap<Integer, ArrayList<User>> ageMap = new HashMap<>();
        //16 [user1,user5,user67]
        //22 [use2,user3]
        for (User user : hashMap.values()) {
            if (!ageMap.containsKey(user.getAge())) {
                ArrayList<User> users = new ArrayList<>();
                users.add(user);
                ageMap.put(user.getAge(), users);
            } else { //если такой ключ есть добавляем пользователя в сущ список
                ageMap.get(user.getAge()).add(user);
            }
        }

        EnumMap<Role, ArrayList<User>> enumMap = new EnumMap<>(Role.class); //Role.class - ссылка на класс
        //[ArrayList, ArrayList]
        //пользователи в списке, спики в мапе
        //  3. Добавить данные
        //  4. Вывести в консоль логины всех пользователей с ролью USER
        //  5. Создать еще один экземпляр класса User, добавить его в мапу,
        //   представляя, что роль пользователя Вам неизвестна
        ArrayList<User> admins = new ArrayList<>(Arrays.asList(user3, user4));
        ArrayList<User> users = new ArrayList<>(Arrays.asList(user1, user2));
        admins.add(user3);
        admins.add(user4);
        users.add(user1);
        users.add(user2);
        enumMap.put(Role.ADMIN, admins);
        enumMap.put(Role.USER, users);

        for (User user : enumMap.get(Role.USER)) {
            System.out.println(user.getLogin());
        }

        User user5 = new User("viktor", "asd", Role.USER, 45);
       // enumMap.get(user5.getRole()).add(user5);   =
        Role userRole = user5.getRole();
ArrayList<User> usersFromMap = enumMap.get(userRole);
usersFromMap.add(user5);


    }


}
