//package ru.itmo.lessons.lesson7;

//import ru.itmo.lessons.lesson7.base.AttackAble;
//import ru.itmo.lessons.lesson7.base.BattleUnit;

//рыцарь
// здоровье
// очкиАтаки ++
// дополнительноеЗдороьве
// класс Knight реализует (имплементирует) интерфейс AttackAble
//можно реализовать несколько интерфейсов implements Int1, Int2, Int3
/* final public class Knight extends BattleUnit implements AttackAble { //final - запрещает наследование
    private final int additionalHealth = 10;

    public Knight(int healthCare, int attackScore) {

        super(healthCare, attackScore);
    }

    public void knightVoid() {
        System.out.println("Метод knightVoid");
    }

    @Override
    public void rest() {
        plusHealth(3);
        System.out.println("Отдых рыцаря");
    }

    @Override
    public void attack(BattleUnit enemy) {
        if (enemy.isAlive() && this.isAlive()) enemy.minusHealth(attackScore);
        if (enemy.isAlive()) this.minusHealth(getAttackScore());
        if (this.isAlive())plusHealth((int)(Math.random()*additionalHealth));
    }
}
*/