public class Driver {
	
	public static void main(String[] args) {
		
		Counter c = new Counter(0);
		
		c.count();
		c.count();
		System.out.println("After 2 counts: Count (1) = " + c.getCount());
		
		c.count();
		c.count();
		System.out.println("After 4 counts: Count(1) = " + c.getCount());
		
		c.reset();
		System.out.println("After reseting: Count (1)= " + c.getCount());
		
	}

}
