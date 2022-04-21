package ru.itmo.lessons.lesson21;

public class Application {
    public static void main(String[] args) {
        User user = new User(User.Level.LOW, "qwe");
        // экземпляр внутреннего класса
        User.Account account = user.new Account(20); //new вызывани конструктор аккаунта

        User.Account account2 = new User(User.Level.HIGH, "asd")
          .new Account(200); //создание аккаунта и юзера в одной строчке
        System.out.println(account2.getUser());


        //создание экземпляра вложенного класса
        Student.Exam math = new Student.Exam("math");
        Student student1 = new Student("Tom");//экзамени и студнт сами по себе не связаны

        math.setMark(5);
        student1.addExam(math);

      // анонимные классы
        SomeInterface object = new SomeInterface() {
            @Override
            public void void1() {
                System.out.println("void1");
            }

            @Override
            public void void2() {
                System.out.println("void2");
            }

            @Override
            public void void3() {
                System.out.println("void3");
            }
        };
        object.void1();

       // фабричный метод
        // это статичский метод в абстрактном классе или интерфейсе
    }
}
