
public class Main
{
	public static void main(String[] args) {
		Offering offering = new Coffee();
		offering = new Rum(offering);
		offering = new Gin(offering);
		offering = new Soda(offering);
		System.out.print(offering.getName()+": "+offering.getPrice());
	}
}
