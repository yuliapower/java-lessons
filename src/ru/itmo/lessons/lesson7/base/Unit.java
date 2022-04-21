package ru.itmo.lessons.lesson7.base;

//ru.itmo.lessons.lesson7.base.Unit
//родительский класс всех персонажей
abstract public class Unit {
    //абстрактный класс - нельзя созать объект (для хранения дублей и общих свойств объектов)
    // на основе абстрактного класса (unit = new unit)
    // может содержать абстрактные меоды
    protected int healthScore; //доступ ращрешен из текущего класса + с дочернего класса
    private int maxHealthScore;

    public Unit(int healthScore) {
        if (healthScore < 1) {
            throw new IllegalArgumentException("Здоровье должно быть положительным значеием");
        }
        this.healthScore = healthScore;
        maxHealthScore = healthScore; //изначально у игрока максимальное здоровье и чтоб сравнивать с максимальным
    }

    public int getHealthScore(){
        return healthScore;
    }

    //увеличить здоровье на HealthScore, но не больше изначального
    // если персонаж жив
    public void plusHealth(int healthScore) {
        if (!isAlive()) return;
        this.healthScore = Math.min(this.healthScore + healthScore, maxHealthScore); //либо прибавляем либо если оно итак
        // максимумм будет равно максимуму
    }

    // уменьшить здровье, если персонаж жив
    public void minusHealth(int healthScore) {
        if (!isAlive()) return;
        this.healthScore -= healthScore;
    }

    //метод вернет true, если здоровье больше 0
    //false, если нет
    public boolean isAlive() {
        return healthScore > 0; //без иф потому что булен this.healthscore
    }

    public  void unitVoid(){
        System.out.println("Метод unit");
    }

    public void killUnit(){
        if (healthScore != 0){
            healthScore = 0;
        }
    }


    // абстрактный метод-метод без реализации (без {})
    // если класс абстрактный - то он может иметь абстрактный метод
    public abstract void rest();


    @Override
    public String toString() {
        return "Unit{" +
                "healthScore=" + healthScore +
                ", maxHealthScore=" + maxHealthScore +
                '}';
    }
}
