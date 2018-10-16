public class FactorialReversed {
	public static void main(String[] args)
	
	{
		System.out.println(facs(150));
		System.out.println(facs(6));
		
	}	
	
	static String facs(float a) {
		int i = 2;
		String mess=null;
		
		
		while((a%i)==0) {
			
			a=a/i;
			
			
			if((a)==1) {
				mess = i + "!";
			} else {
				mess= "None";
			}
			
			i++;
		}
		
		return mess;
	
		
	}
}