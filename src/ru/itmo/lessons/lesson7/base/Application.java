/* package ru.itmo.lessons.lesson7.base;

import ru.itmo.lessons.lesson7.Infantry;
import ru.itmo.lessons.lesson7.King;
import ru.itmo.lessons.lesson7.Knight;

import java.util.Scanner;

//public class King extends Unit
//public class Knight extends BattleUnit (ext Unit)
//public class Infantry extends BattleUnit (ext Unit)
public class Application {
    public static void main(String[] args) {
        Knight knight1 = new Knight(20, 17);
        knight1.knightVoid();
        knight1.runFromField();

        BattleUnit knight2 = new BattleUnit(20, 17);
        knight2.battleUnitVoid();

        Unit knight3 = new Knight(20, 17);
        knight2.plusHealth(4);
        knight3.unitVoid();

        // Knight knight4 = (Knight) knight3;


        //King king = new King(300);
        // king.generateArmy();
        // System.out.println(king.getBattleUnitsCount());
        // king.changeUnits();

        Infantry infantry1 = new Infantry(18, 15);
        infantry1.runFromField();

        Scanner in = new Scanner(System.in);
        System.out.println("Укажите тип персонала");
        String bType = in.nextLine();



        BattleUnit battleUnit = null;
        if (bType.equalsIgnoreCase("knight")){
          battleUnit = new Knight(23, 56);

        }else {
            battleUnit = new Infantry(23,56);
        }
        battleUnit.attack(knight1);


    }
}
*/