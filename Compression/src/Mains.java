
public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compression c1 = new Compression();
		
		String nm = "its svinu dfd dgfhfgh gfhfghfgh ffdfsdf";
		String[] wordList = nm.split(" ");

		for(int i=0; i<wordList.length-1; i+=2) { //loops +2
			
			String set="";
			String add="";
			
			if(i==0 && wordList[i].charAt(wordList[i].length()-1)==wordList[i+1].charAt(0)) { //checks the first and second word. if they overlap (ONE LETTER FOR NOW), put them together...
				set = (wordList[i].substring(0,wordList[i].length()-1) + wordList[i+1].substring(0+1, wordList[i+1].length()));
				add = add + set;
			}
			else if(i==0 && wordList[i].charAt(wordList[i].length()-1)!=wordList[i+1].charAt(0)) { //... if not, add display the first and second word
				set = set + wordList[i] + " "+ wordList[i+1];
			}
			
			if(i!=0 && wordList[i].charAt(wordList[i].length()-1)==wordList[i+1].charAt(0)) {
				set = (wordList[i].substring(0,wordList[i].length()-1) + wordList[i+1].substring(0+1, wordList[i+1].length())); //checks the third and fourth (LOOPS) word. if they overlap (ONE LETTER FOR NOW), put them together...
				add = add + set;
			}
			else if(i!=0 && wordList[i].charAt(wordList[i].length()-1)!=wordList[i+1].charAt(0)) { //... if not, add display the words
				set = set + wordList[i] + " "+ wordList[i+1];;
				add = add + set;
			}
			
			System.out.println(add);
			
			
			
		}

			
			//			System.out.println(s);
		}
	}

