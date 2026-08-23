package Entities;
public class Human extends Animal{
    String name;
    //ArrayList<items> inventory; //items need to be made

    public Human(String name, int health, float reproductionCooldown, int damage, int hunger, String gender) {
        super(health, reproductionCooldown, damage, hunger, gender);
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }






    
}
