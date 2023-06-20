public class Hero {
    private int Health;
    private int Damage;
    private String Superpover;

    public Hero(int Health, int Damage) {
        this.Health = Health;
        this.Damage = Damage;

    }

    public Hero(int Health, int Damage, String Superpover) {
        this.Health = Health;
        this.Damage = Damage;
        this.Superpover = Superpover;

    }

    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return Damage;
    }

    public String getSuperpover() {
        return Superpover;
    }
}

