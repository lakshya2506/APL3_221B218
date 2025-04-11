public class Main
{
	public static void main(String[] args) {
	    Offering o1 = new Coffee();
	    o1 = new Rum(o1);
		System.out.println(o1.getName() + " at Rs." + o1.getPrice());
		
		Offering o2 = new Tea();
	    o2 = new Rum(o2);
		System.out.println(o2.getName() + " at Rs." + o2.getPrice());
		
		Offering o3 = new Icecream();
	    o3 = new Rum(o3);
		System.out.println(o3.getName() + " at Rs." + o3.getPrice());
		
		Offering o4 = new Coffee();
	    o4 = new Gin(o4);
		System.out.println(o4.getName() + " at Rs." + o4.getPrice());
		
		Offering o5 = new Tea();
	    o5 = new Gin(o5);
		System.out.println(o5.getName() + " at Rs." + o5.getPrice());
		
		Offering o6 = new Icecream();
	    o6 = new Gin(o6);
		System.out.println(o6.getName() + " at Rs." + o6.getPrice());
	}
}
