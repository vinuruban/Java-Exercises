import java.util.HashMap;

public class Morse {

static HashMap<String, String> map = new HashMap<>();
	
public void add() {
	map.put(".-", "A");
	map.put("-...", "B");
	map.put("-.-.", "C");
	map.put("-..", "D");
	map.put(".", "E");
	map.put("..-.", "F");
	map.put("--.", "G");
	map.put("....", "H");
	map.put("..", "I");
	map.put(".---", "J");
	map.put("-.-", "K");
	map.put(".-..", "L");
	map.put("--", "M");
	map.put("-.", "N");
	map.put("---", "O");
	map.put(".--.", "P");
	map.put("--.-", "Q");
	map.put(".-.", "R");
	map.put("...", "S");
	map.put("-", "T"); 
	map.put("..-", "U");
	map.put("...-", "V");
	map.put(".--", "W");
	map.put("-..-", "X");
	map.put("-.--", "Y");
	map.put("--..", "Z");
	map.put("/", " ");
	
}	



public void translate(String str) {
	
	String word = "";
	String sentence = "";
	
	for (int i=0; i <= str.length()-1; i++) {
		
		if(str.charAt(i) != ' ') { //add each char until space is found
			word = word + str.charAt(i);
		}
		
		else if(str.charAt(i) == ' ') { //when space is reached, store the word in to the sentence
			sentence = sentence + map.get(word);
			word=""; //restores to null after strong a word into sentence
		}
		if(i == str.length()-1) {
			sentence = sentence + map.get(word);
		}
	}
	
	System.out.println(sentence);
	
}
	
	
}
