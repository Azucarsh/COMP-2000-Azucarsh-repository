package Entities;
public class Animal { //parent class for all animals
    public int health;
    public float reproductionCooldown;
    public int damage;
    public int hunger;
    public String gender;

    public Animal (int health, float reproductionCooldown, int damage, int hunger, String gender) {
        this.health = health;
        this.reproductionCooldown = reproductionCooldown;
        this.damage = damage;
        this.hunger = hunger;
        this.gender = gender;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setReproductionCooldown(int cooldown) {
        this.reproductionCooldown = cooldown;
    }

    public float getReproductionCooldown() {
        return reproductionCooldown;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }


}