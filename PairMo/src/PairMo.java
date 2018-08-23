
public class PairMo {
	
	
	public static void main(String[] args) {
		
		int gweight=100;
		int maxtemp=80;
		int[] capacity= {30,130,90,150,120,200,110};
		int[] ptemp= {50,60,60,85,70,200,100};
		int[] lum= {70,23,71,123,111,88,33}; 
		
		for(int i = 0; i <capacity.length; i++)
		{
			int x = capacity[i];
			int y = ptemp[i];
			int z = lum[i];
			int seat = i;
			if( gweight <= x && y <= maxtemp && z>=70)
			{
				System.out.println("Seat no." + (i+1));
				
			}
		}
		
		
	
}
}
