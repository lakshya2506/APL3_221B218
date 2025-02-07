
interface Testable {
    void display(); 
}

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();
        FinalTest abstest = new FinalTest();
        abstest.display();
    }
}
