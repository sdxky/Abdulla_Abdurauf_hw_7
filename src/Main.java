public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20, "INVISIBILITY"),
                new Medic(80, 10, "HEALING", 50),
                new Warrior(120, 30, "CRITICAL DAMAGE")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
                System.out.println("New heal points for Medic: " + ((Medic) hero).getHealPoints());
            }
        }
    }
}
