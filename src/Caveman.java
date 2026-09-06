import java.awt.*;


public class Caveman extends Animal implements AnimalBehaviours{
    // stats can change later for balancing
    private static float defaultHealth = 10f;
    private static int defaultSpeed = 5;
    private static int defaultHunger = 10; //seconds before dying?
    private static int defaultDamage = 2;

    Caveman(){
        setStats();

        x = 0;
        y = 0;
    }

    Caveman(int spawnX, int spawnY) {
            setStats();
            x = spawnX;
            y = spawnY;
        }
    
        
    @Override
    public void setStats(){
        this.health = defaultHealth;
        this.speed = defaultSpeed;
        this.hunger = defaultHunger;
        this.damage = defaultDamage;
    }

    @Override
    public void createNest(){

    }

    @Override
        public void draw(Graphics2D g2) {
        g2.setColor(Color.BLACK);
 
        // Head
        g2.drawOval(x - 3, y - 18, 6, 6);
 
        // Body
        g2.drawLine(x, y, x, y - 12);
 
        // Arms
        g2.drawLine(x, y - 8, x - 5, y - 4); //left
        g2.drawLine(x, y - 8, x + 5, y - 4); //right
 
        // Legs
        g2.drawLine(x, y, x - 5, y + 5); //left
        g2.drawLine(x, y, x + 5, y + 5); //right
    }

}
