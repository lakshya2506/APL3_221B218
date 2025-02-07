
interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

interface Quackable {
    void quack();
}

interface Squeakable {
    void squeak();
}

interface Muteable {
    void mute();
}

public class Main {
    public static void main(String[] args) {
        Swimmable rubberDuck = new RubberDuck();
        rubberDuck.swim();
        ((Squeakable) rubberDuck).squeak();
        
        Swimmable woodenDuck = new WoodenDuck();
        woodenDuck.swim();
        ((Muteable) woodenDuck).mute(); 
        
        Swimmable redHeadDuck = new RedHeadDuck();
        redHeadDuck.swim();
        ((Flyable) redHeadDuck).fly();
        ((Quackable) redHeadDuck).quack();
        
        Swimmable lakeDuck = new LakeDuck();
        lakeDuck.swim();
        ((Flyable) lakeDuck).fly();
        ((Quackable) lakeDuck).quack(); 
    }
}
