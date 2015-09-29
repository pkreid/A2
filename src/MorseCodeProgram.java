import java.util.Scanner;

/**
 * 
 */

/**
 * @author Peter Kowalchuk-Reid
 * Student ID: 101006196
 *
 */
public class MorseCodeProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String UserInp;
		UserInp = InputHandler();
		for (int i = 0; i < (UserInp.length()) ; i++) {
			String MorseChar = GetMorse(UserInp.charAt(i));
			System.out.print("FOO");
			System.out.print(MorseChar);
					}
	}
	public static String InputHandler() {
		Scanner sc = new Scanner(System.in); 
		String InputLine = sc.nextLine();
		//System.out.println(InputLine);
		sc.close();
		return InputLine;
		
	}
	public static String GetMorse(char letter){
		String code = null;
		switch (letter) {
		case 'A': code = ".--";  
		case 'B': code = "-..."; 
		case 'C': code = "-.-."; 
		case 'D': code = "-..";  
		case 'E': code = ".";    
		case 'F': code = "..-."; 
		case 'G': code = "--.";  
		case 'H': code = "...."; 
		case 'I': code = "..";   
		case 'J': code = ".---"; 
		case 'K': code = "-.-";  
		case 'L': code = ".-.."; 
		case 'M': code = "--";   
		case 'O': code = "---";  
		case 'P': code = ".--."; 
		case 'Q': code = "--.-"; 
		case 'R': code = ".-.";  
		case 'S': code = "...";  
		case 'T': code = "-";    
		case 'U': code = "..-";  
		case 'V': code = "...-"; 
		case 'W': code = ".--";  
		case 'X': code = "-.--"; 
		case 'Y': code = "-.--"; 
		case 'Z': code = "--.."; 
		case ' ': code = " ";    
		}
		return code;



	}
}


