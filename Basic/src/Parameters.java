
public class Parameters {
	
	
	public static void main(String[] args)
	
	
	{
		
		
		
		System.out.println("Hello World");
		
		
		System.out.println(returnString());
		System.out.println(paraOp(1,2));
		System.out.println(conditionals(1,2,false));
		System.out.println(conditionalsTwo(0,7));
		
		for (int i=0; i<11; i++) {
			System.out.println(iteration(0,7));
			}
	}
	
	
	
	
	
	
	
	public static String returnString() {
		
		
		return "oink";
		
	}
	
	public static int paraOp(int a, int b) {
		
		return a + b;
		
	}
	
	public static int conditionals(int a, int b, boolean check) {
		if (check==true) { 
		return a + b;
		}
		else 
			return a*b;
	}
	
	public static int conditionalsTwo(int a, int b) {
	int c=0;	
		if (a==0 ) { 
		c=b;
		}
		else if (b==0 ) { 
		c=a;
		}
		return c;
	}

	public static int iteration(int a, int b) {
	int c=0;	
		if (a==0 ) { 
		c=b;
		}
		else if (b==0 ) { 
		c=a;
		}
		
		return c;
	}
	
	
}
