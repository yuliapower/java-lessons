package ru.itmo.lessons.lesson21;

public class User {
    private Level level;
    private String login;

    public User(Level level, String login) {
        this.level = level;
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "level=" + level +
                ", login='" + login + '\'' +
                '}';
    }

    //внутренний класс без static
    // 1. область видимости-согласно модификатору достпупа
    // 2. нельзя создать объект внутреннего класса без создания объекта внешнего
    public class Account{
        //3. не может содержать статиечксих методов и свойств
        // только если статическое свойство не final
      //  private static final int MAX_BALANCE = 500;
        private float balance;

        public Account(float balance) { //кнструктор
          //  доступ возможен к приватным методам и свойствам внешнего класса
            this.balance = balance + User.this.level.getCount();
        }

        public User getUser(){
            //доступ к экземпляру внешнего класса
            return User.this;//ссылка на экземпляр внешнего класса
        }
    }

    public enum Level{ //вложенный класс static
         //доступ к перечислению вне класса -
        // согласно модификатору доступа: User.Level.элемент
       HIGH(10), MEDIUM(5), LOW(0);
        private int count;

        Level(int count){   //конструктор
            this.count = count;
        }

        //геттер
        public int getCount(){
            return count;
        }
    }
}
//public - один класс
// не public сколько угодно class