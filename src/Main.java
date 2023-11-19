public class Main {

        public static void main (String[]args){

            Boss boss = new Boss();

            boss.setHealthOfBoos(500);
            System.out.println("Health of boss: " + boss.getHealthOfBoos());

            boss.setDamageOfBoos(50);
            System.out.println("Damage of boss: " + boss.getDamageOfBoos());
            System.out.println("Damage of boss: " + boss.getDamageOfBoos());

            boss.setTypeDefenceOfBoos("Magic");
            System.out.println("Type Defence of boss: " + boss.getTypeDefenceOfBoos());

        }
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Fire");
        Hero hero2 = new Hero(100, 30, "Fires");
        Hero hero3 = new Hero(100, 30);

        Hero[] heroesArray = {hero1, hero2, hero3};
        return heroesArray;
    }

    public static void printHeroesInfo(Hero[] heroes) {
        for (Hero hero : heroes) {
            System.out.println("Health of heroes: " + hero.getHealthOfHero());
            System.out.println("Damage of geroes: " + hero.getDamageOfHero());
            System.out.println("Superpower of heroes: " + hero.getSuperPower() + "\n");
        }
    }
    }