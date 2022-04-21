package ru.itmo.lessons.lesson12;
// можно создавать собственные классы исключения
// если мы хотим создать исключение времени выполнения,
// то класс должен наследоваться от RuntimeException

// если мы хотим создать исклбчение времени компиляции,
// то класс должен наследоваться от Exception

public class CalcException extends Exception {
    // можно добавлять собственные методы и свойства
    // можно вызывать конструкторы родителя
    public CalcException(String message) {
        super(message);
    }

    public CalcException(String message, Throwable cause) {
        super(message, cause);
    }

    // можно переопределять методы родителя
    @Override
    public String getMessage() {
        return super.getMessage()+ "Будьте внимательны!";
    }
}
