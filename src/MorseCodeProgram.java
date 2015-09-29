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
			char UserChar = UserInp.charAt(i);
			char UpperChar = Character.toUpperCase(UserChar);
			String MorseChar = GetMorse(UpperChar);
			System.out.print(MorseChar + " ");
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
		case 'A': code = ".--";  break;
		case 'B': code = "-..."; break;
		case 'C': code = "-.-."; break;
		case 'D': code = "-..";  break;
		case 'E': code = ".";    break;
		case 'F': code = "..-."; break;
		case 'G': code = "--.";  break;
		case 'H': code = "...."; break;
		case 'I': code = "..";   break;
		case 'J': code = ".---"; break;
		case 'K': code = "-.-";  break;
		case 'L': code = ".-.."; break;
		case 'M': code = "--";   break;
		case 'O': code = "---";  break;
		case 'P': code = ".--."; break;
		case 'Q': code = "--.-"; break;
		case 'R': code = ".-.";  break;
		case 'S': code = "...";  break;
		case 'T': code = "-";    break;
		case 'U': code = "..-";  break;
		case 'V': code = "...-"; break;
		case 'W': code = ".--";  break;
		case 'X': code = "-.--"; break;
		case 'Y': code = "-.--"; break;
		case 'Z': code = "--.."; break;
		case ' ': code = "  ";   break;
		}
		return code;



	}
}


