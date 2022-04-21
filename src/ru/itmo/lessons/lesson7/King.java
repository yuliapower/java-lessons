/* package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;
import ru.itmo.lessons.lesson7.base.Unit;

import java.util.Arrays;

//король
//здоровье +++
// золото
// армия боевых юнитов
/* public class King extends Unit {
    private int gold = 500;
    private BattleUnit[] army = new BattleUnit[20]; //


    public King(int healthScore) {
        super(healthScore);
    }

    public void kingVoid() {
        System.out.println("Метод kingVoid");
    }

    public int plusGold(int count) {
        return gold = gold + count;
    }

    public int minusGold(int count) {
        if (gold > count) {
            return gold = gold - count;
        }
        return gold;
    }

   /* public void generateArmy() {
        if (gold >= 250) {
            for (int i = 0; i < army.length; i++) {
                if (i <= 3){
                    army[i] = new Knight(generateRandomHealthScore(),generateRandomAttack());
                }else {
                    army[i] = new Infantry(generateRandomHealthScore(),generateRandomAttack());
                }

            }
        }else {
            System.out.println("Недостаточно золота");
        }

        System.out.println(Arrays.toString(army));
    }
*/

  /*  public void generateArmy(){
    if (gold<250){
        System.out.println("Стоимость армии 250. У короля "+gold);
    return;
    }
gold-=250;
    army = new BattleUnit[20];
        for (int i = 0; i < army.length; i++) {
            army[i] = BattleUnit.getBattleUnits(20);
        }
    }


    private int generateRandomHealthScore(){
        return (int) (Math.random() * 51) + 10;
    }
    private int generateRandomAttack(){
        return (int) (Math.random() * 21) + 7;
    }

  /*  public void changeUnits(){
        for (int i = 0; i < army.length; i++) {
            if (!army[i].isAlive()){
                while (gold >= 20){
                    gold -= 20;
                    army[i] = new Knight(generateRandomHealthScore(),generateRandomAttack());
                }
            }
        }
    }
*/

  /*  public void changeUnits(){
        if (gold<20){
            System.out.println("Создание одного юнита 20.У короля "+gold);
        return;
        }
        for (int i = 0; i < army.length; i++) {
            if (gold<20) {
                System.out.println("Создание одного юнита 20.У короля " + gold);
                return;
            }
            if (army[i]!=null&&army[i].isAlive()){
                gold-=20;
                army[i]=BattleUnit.getBattleUnit();
            }
        }
    }


    //король нападает на короля

    public void startBattle(King enemy){
        //for (BattleUnit battleUnit : army) {  //iter
        for (int i = 0; i < army.length; i++) {
            int unitIndex = (int)(Math.random()*army.length);
            int enemyUnitIndex = (int)(Math.random()*enemy.army.length);
            army[unitIndex].attack(enemy.army[enemyUnitIndex]);
            army[unitIndex].rest();
            enemy.army[enemyUnitIndex].rest();
        }

    }




    public int getBattleUnitsCount(){
        int count = 0;
        for (int i = 0; i < army.length; i++) {
            if (army[i].isAlive()){
                count++;
            }
        }
        return count;
    }

    // реализация абстрактного метода
    @Override
    public void rest(){
        minusGold(50);
        plusHealth(5);
        System.out.println("Отдых короля");
    }

    @Override
    public String toString() {
        return "King{" +
                "gold=" + gold +
                ", army=" + Arrays.toString(army) +
                ", healthScore=" + healthScore +
                '}';
    }
}
*/