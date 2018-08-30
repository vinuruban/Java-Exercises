import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Morse ms = new Morse();
		
	
		ms.add();
//		String code = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
//		ms.translate(code);
		
		Scanner s = new Scanner(System.in);
		System.out.println("What is the Morse code?");
		String code = s.nextLine();
		ms.translate(code);
	}

}
