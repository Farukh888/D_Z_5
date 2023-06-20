public class Boss {
    private int Health;
    private int Damage;
    private String typeDefence;


    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return Damage;
    }

    public String getTypeDefence() {
        return typeDefence;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public void setTypeDefence(String typeDefence) {
        this.typeDefence = typeDefence;
    }
}
