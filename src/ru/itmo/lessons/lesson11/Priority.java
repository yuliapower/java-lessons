package ru.itmo.lessons.lesson11;
// enum может создаваться со свойствами, конструктором,
// методами
// можно не ставить ; после последнего элемента перечисления,
// если в перечислении больше ничего нет.
public enum Priority {
    HIGH(10), MIDDLE(5), LOW(1);
    private int code;
    Priority(int code){
        this.code = code;
    }

    public void setCode(int code){ // метод доступен всем элементам перечисления согласно модификатору доступа
        this.code = code;
    }

    public int getCode(){
        return code;
    }
}
