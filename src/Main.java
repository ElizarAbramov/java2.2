public class Main {
    public static void main(String[] args) {
        int InitialAccBalance = 100;
        int replenishmentAmount = 160;
        int rubforBonus = 100;
        int bonus;

        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / rubforBonus;
        } else {
            bonus = 0;
        }
        int finalBalance = InitialAccBalance + bonus + replenishmentAmount;
        System.out.println(bonus);
        System.out.println(finalBalance);


    }
}
