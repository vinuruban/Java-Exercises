
public class intermediate {
	public static void main(String[] args)
	
	{
		System.out.println(blackJack(18,21));
		System.out.println(blackJack(20,18));
		System.out.println(blackJack(20,20));
		
		System.out.println(uniqueSum(1,2,3));
		System.out.println(uniqueSum(3,3,3));
		System.out.println(uniqueSum(1,1,2));
		
		System.out.println(tooHot(-9)); //if less than 10, its winter. Else, its summer
		System.out.println(tooHot(11));
	}
	
	public static int blackJack(int a, int b) {
	int c=0;	
		if ( (21-a) < (21-b) ) { 
		c=a;
		}
		else if(a==b) {
		c=0;
		}
		else { 
		c=b;
		}
		return c;
	}
	
	public static int uniqueSum(int a, int b, int c) {
	int d=0;	
		if ( a!=b && a!=c && b!=c ) { 
		d=a+b+c;
		}
		else if( a==b && a==c && b==c ) {
		d=0;
		}
		else if( a==b ) {
		d=c;
		}
		else if( a==c ) {
		d=b;
		}
		else if( b==c ) {
		d=a;
		}
		return d;
	}
	
	public static String tooHot(int temp) {
	String c=null;	
		if (temp<11) { 
		c="winter";
		}
		else {
		c="summer";
		}
		return c;
	}
}
