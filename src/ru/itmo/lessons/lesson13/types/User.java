package ru.itmo.lessons.lesson13.types;

public class User<T> {
    private T id; //внутри класса у объекта id можно вызвать только методы Object
    private String login;

    public void setId(T id){
        this.id = id;
    }

    public T getId(){
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }
}
