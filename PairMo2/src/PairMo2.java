
public class PairMo2 {
	
	public static void main(String[] args) {
		System.out.println(calc(3,2,6));
	}
	
	public static int calc(int a, int b, int c) {
		int d=0;
		if (a+b==c) {
			d=c;
		}
		else if (a+c==b) {
			d=b;
		}
		if (a*b==c) {
			d=c;
		}
		else if (a*c==b) {
			d=b;
		}
		
		
		
		if (a-b==c) {
			d=c;
		}
		else if (a-c==b) {
			d=b;
		}
		if (b-a==c) {
			d=c;
		}
		else if (b-c==a) {
			d=b;
		}
		if (c-a==b) {
			d=c;
		}
		else if (c-b==a) {
			d=b;
		}
		
		
		if (a/b==c) {
			d=c;
		}
		else if (a/c==b) {
			d=b;
		}
		if (b/a==c) {
			d=c;
		}
		else if (b/c==a) {
			d=b;
		}
		if (c/a==b) {
			d=c;
		}
		else if (c/b==a) {
			d=b;
		}
		
		

		return d;
	}
	
}
