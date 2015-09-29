
/**
 * @author Peter Kowalchuk-Reid
 * Student ID: 101006196
 *
 */
import java.util.Scanner;
public class ReverseMorseCodeProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UserInp;
		UserInp = InputHandler();
		String[] UserCode = UserInp.split(" ");
		String txtOut = "";
		for (int i = 0; i < (UserCode.length) ; i++) {
			char MorseChar = decodeLetter(UserCode[i]);
			txtOut += MorseChar;
			
		}
		System.out.print(txtOut);
	}
	
	public static String InputHandler() {
		Scanner sc = new Scanner(System.in); 
		String InputLine = sc.nextLine();
		sc.close();
		return InputLine;
	}
	
	
	public static char decodeLetter(String MorseStr){
		char code = ' ' ;
		switch (MorseStr) {
		case ".-"  : code = 'A'; break;
		case "-...": code = 'B'; break;
		case "-.-.": code = 'C'; break;
		case "-.." : code = 'D'; break;
		case "."   : code = 'E'; break;
		case "..-.": code = 'F'; break;
		case "--." : code = 'G'; break;
		case "....": code = 'H'; break;
		case ".."  : code = 'I'; break;
		case ".---": code = 'J'; break;
		case "-.-" : code = 'L'; break;
		case "--"  : code = 'M'; break;
		case "-."  : code = 'N'; break;
		case "---" : code = 'O'; break;
		case ".--.": code = 'P'; break;
		case "--.-": code = 'Q'; break;
		case ".-." : code = 'R'; break;
		case "..." : code = 'S'; break;
		case "-"   : code = 'T'; break;
		case "..-" : code = 'U'; break;
		case "...-": code = 'V'; break;
		case ".--" : code = 'W'; break;
		case "-..-": code = 'X'; break;
		case "-.--": code = 'Y'; break;
		case "--..": code = 'Z'; break;
		default    : code = '\0';
		

		}
		return code;

		

	}
}

