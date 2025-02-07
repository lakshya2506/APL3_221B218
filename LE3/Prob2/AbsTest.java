abstract class AbsTest implements Testable {
    
}

class FinalTest extends AbsTest{
    public void display() {
        System.out.println("Display method implemented in abstract class");
    }
}