import java.awt.*;


public class Dinosaur extends Animal implements AnimalBehaviours {

    //Dinosaur stats can change later for balancing
    private static float defaultHealth = 10f;
    private static int defaultSpeed = 5;
    private static int defaultHunger = 10; //seconds before dying?
    private static int defaultDamage = 2;


        Dinosaur () {
            setStats();
            x = 0;
            y = 0;

        }

        //constructor for reproduced dinosaurs, pass the position of the parent (or next to them)
        Dinosaur(int spawnX, int spawnY) {
            setStats();
            x = spawnX;
            y = spawnY;
        }

    @Override
    public void setStats(){
        this.health = defaultHealth;
        this.dx = defaultSpeed;
        this.dy = defaultSpeed;
        this.hunger = defaultHunger;
        this.damage = defaultDamage;
    }

    @Override
    public void createNest(){

    }

    @Override
    public void draw(Graphics2D g2) {
        g2.setColor(new Color(60, 150, 60));
 
        // Body (oval)
        g2.fillOval(x, y, 10, 20);
 
        // Tail (triangle-ish using polygon)
        int[] tailX = {x, x - 10, x + 5};
        int[] tailY = {y + 10, y + 17, y + 15};
        g2.fillPolygon(tailX, tailY, 3);
 
        // head
        g2.fillOval(x + 3, y - 4, 10, 7);  // head
 
        // Legs
        g2.fillRect(x + 2 , y + 17, 2, 7); //left
        g2.fillRect(x + 5, y + 17, 2, 7); //right

 
        // Eye
        g2.setColor(Color.BLACK);
        g2.fillOval(x + 5, y - 2, 2, 1);

    }
}
