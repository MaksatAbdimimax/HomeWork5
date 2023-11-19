public class Hero {
    private int healthOfHero;
    private int damageOfHero;
    private String superPower;

    public int getHealthOfHero() {
        return healthOfHero;
    }

    public int getDamageOfHero() {
        return damageOfHero;
    }

    public String getSuperPower() {
        return superPower;
    }

    public Hero(int healthOfHero, int damageOfHero, String superPower) {
        this.healthOfHero = healthOfHero;
        this.damageOfHero = damageOfHero;
        this.superPower = superPower;
    }
    public Hero(int healthOfHero,int damageOfHero) {
        this.healthOfHero = healthOfHero;
        this.damageOfHero = damageOfHero;
    }
}



