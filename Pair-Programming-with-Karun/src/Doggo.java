import java.util.ArrayList;

public class Doggo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rank = 13;
		System.out.println(outputPlaces(rank));
		

	}
	
	public static String outputPlaces(int rank) {
		String alphaRank = null;
		String convert = null;
		String secChar = null;
		int userRank = rank;
		
		ArrayList ranks = new ArrayList<>();
		
		for(int i=1;i<101;i++) {
			rank = i;
			
			if(rank == 1) {
				alphaRank = rank+"st";
			} else if(rank==2){
				alphaRank = rank+"nd";
			}else if(rank==3){
				alphaRank = rank+"rd";
			}else if(rank == 11 || rank == 12 || rank == 13 ) {
				alphaRank = rank + "th";
			} else if(rank >=14) {
				convert = Integer.toString(rank);
				secChar = convert.substring(1, 2);
				if (secChar.equals("1")) {
					alphaRank = rank + "st";
				}else if (secChar.equals("2")) {
					alphaRank = rank + "nd";
				}else if (secChar.equals("3")) {
					alphaRank = rank + "rd";
				} else{
					alphaRank = rank + "th";
				}
				
			}else {
				alphaRank = rank + "th";
			}
			
			ranks.add(rank);
			
			for(int j=0;j<=ranks.size();j++) {
				System.out.println(ranks.get(j));
			}
		}
		
		
			
		
		
		return alphaRank;
		
	}

}