public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Kaurav duryodhan = new Kaurav();
        Vikarn vikarn = new Vikarn();
        
        System.out.println("Pandav:");
        arjun.fight();
        bheem.obey();
        bheem.kind(); 
        System.out.println();
        System.out.println("Kaurav:");
        duryodhan.fight();
        vikarn.obey();
        vikarn.kind();
    }
}