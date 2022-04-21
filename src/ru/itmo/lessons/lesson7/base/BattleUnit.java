/* package ru.itmo.lessons.lesson7.base;

import ru.itmo.lessons.lesson7.Infantry;
import ru.itmo.lessons.lesson7.Knight;

/*abstract public class BattleUnit extends Unit implements AttackAble {
    //extends BattleUnit наследуется из Unit
    //Unit-родительский класс
    // BattleUnit - дочерний класс

    //наследуются методы и свойства родительского класса
    //конструкторы не наследуются
    //в BattleUnit мы сможем обратится к healthCare, потому что он protected

    protected int attackScore;

    public BattleUnit(int healthScore, int attackScore) {
        super(healthScore);//вызов конструктора родителя
        if (attackScore < 1) {
            throw new IllegalArgumentException("Атака должна быть положительной");
        }
        this.attackScore = attackScore;
    }


    public int getAttackScore() {
        return attackScore;
    }

    //переопределить final метод нельзя
    public final void battleUnitVoid() {
        System.out.println("Метод BattleUnit");
    }


    public boolean runFromField() {
        //при бегстве юнит теряет 1ед здоровья
        if (!this.isAlive()) {
            System.out.println("Юнит сбежал с поля боя");
            return false;
        }
        minusHealth(1); //healthScore-=1;
        if (!isAlive()) {
            System.out.println("Юнит не мог сбежать");
            return false;
        }
        return true;
    }


    //static
    public static BattleUnit getBattleUnit() {
        String[] types = {"knight", "infantry"};
        BattleUnit unit = null;
        switch (types[(int) (Math.random() * types.length)]) {
            case "knight":
                unit = new Knight(30, 50);
                break;
            case "infantry":
                unit = new Infantry(35,20);
                break;
        }
        return unit;
    }

    public static BattleUnit[] getBattleUnits(int count){
        BattleUnit[] units = new BattleUnit[count];
        for (int i = 0; i < units.length; i++) {
            units[i] = getBattleUnit();
        //в статических методах можно обратиться
        //только к статическим методам или свойствам
        }
        return units;
    }

    @Override
    public String toString() {
        return "BattleUnit{" +
                "attackScore=" + attackScore +
                ", healthScore=" + healthScore +
                '}';
    }
}
*/