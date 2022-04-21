package ru.itmo.lessons.lesson13.types;

public class GenericTypes {
    public static void main(String[] args) {
        User<String> stringUser = new User<>();
        stringUser.setId("fr25425");
        stringUser.setLogin("qwerty");

        String sId = stringUser.getId();
        System.out.println(sId.contains("fr"));

        User<Integer> integerUser = new User<>();
        integerUser.setId(1);
        integerUser.setLogin("asd");

        Integer iId = integerUser.getId();
        System.out.println(iId > 0);

        //public class PairContainer<T (key), K(value)>
        PairContainer<String, Integer> container1 = new PairContainer<>("a", 1);
        System.out.println(container1.getKey());
        System.out.println(container1.getValue());
        PairContainer<String, User<String>> container2 = new PairContainer<>("x", stringUser);
        System.out.println(container2.getValue().getId()); //fr25425

        PairContainer<Integer, PairContainer<Integer,User<Integer>>> container3 = new PairContainer<>(1, new PairContainer<>(2,integerUser));
    }
}

