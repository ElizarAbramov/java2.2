public class Main {
    public static void main(String[] args) {
        int initialAccBalance = 100;
        int replenishmentAmount = 160;
        int rubForBonus = 100;
        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / rubForBonus;
        } else {
            bonus = 0;
        }
        int finalBalance = initialAccBalance + bonus + replenishmentAmount;
        System.out.println(bonus);
        System.out.println(finalBalance);
    }
}
