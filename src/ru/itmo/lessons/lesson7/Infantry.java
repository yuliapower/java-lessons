/* package ru.itmo.lessons.lesson7;
// здоровье
// очкиАтаки ++
// дополнительнаяАтака

import ru.itmo.lessons.lesson7.base.AttackAble;
import ru.itmo.lessons.lesson7.base.BattleUnit;

/* public class Infantry extends BattleUnit implements AttackAble {
    private final int additionalAttack = 5; //нельзя изменить
    // final значение можно задать только при объявлении
    //или через конструктор, но не в сеттерах и тп (если изначально пусто)
    public Infantry(int healthCare, int attackScore) {
        super(healthCare, attackScore);
    }

    public void infantryVoid() {
        System.out.println("Метод infantryVoid");
    }

    //переопределение метода родителя
    // модификатор не ниже чем у родителя, тип, название, аргументы как у родителя
   @Override
    public boolean runFromField() {
        if (super.runFromField()) ;{ //обращение к родителю и вызов его метода,а ниже можно что-то добавить
            this.attackScore -= 3;
            System.out.println("После бегства атака уменьшена на 3");
            return true;
        }
        //return false;
        // если юнит выжил, у него AttackScore уменьшается на 3
        //можно написать собственную реализацию, которая перекроет родительский метод
    }

    @Override
    public void rest(){
        plusHealth(1);
        System.out.println("Отдых пехотинца");
    }


    @Override
    public void attack(BattleUnit enemy) {
        if (enemy.isAlive() && this.isAlive()) enemy.minusHealth(attackScore);
        if (enemy.isAlive()) this.minusHealth(getAttackScore());
        if (this.isAlive())enemy.minusHealth(additionalAttack);
    }

    @Override
    public String toString() {
        return "Infantry{" +
                "additionalAttack=" + additionalAttack +
                ", attackScore=" + attackScore +
                ", healthScore=" + healthScore +
                '}';
    }
}
*/