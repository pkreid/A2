/**
 * @author Peter Kowalchuk-Reid
 * Student ID: 101006196
 *
 */
import java.util.Scanner;

public class CellPhoneProgram {

	static final double city1x = 100;
	static final double city1y = 360;
	static final double city2x = 250;
	static final double city2y = 360;
	static final double city3x = 340;
	static final double city3y = 250;
	static final double city4x = 230;
	static final double city4y = 140;
	
	public static void main(String[] args) {
		
		double c1Range = getRange("City 1");
		double c2Range = getRange("City 2");
		double c3Range = getRange("City 3");
		double c4Range = getRange("City 4");
		
		double c1c2Dist = distance(city1x, city1y, city2 x, city2y);
		double c2c3Dist = distance(city2x, city2y, city3x, city3y);
		double c3c4Dist = distance(city3x, city3y, city4x, city4y);
		
		if (((c1Range + c2Range) > c1c2Dist) && ((c2Range + c3Range) > c2c3Dist) && ((c3Range + c4Range) > c3c4Dist)) {
			System.out.print("Cell phone service will remain available");
		}
		else {
			System.out.print("Cell phone service will become unavailable");
			}
			
		}
		
	public static double distance(double x1, double y1, double x2, double y2) {
		double xDiff = Math.pow((x2 - x1), 2);
		double yDiff = Math.pow((y2 - y1), 2);
		double cityDistance = Math.sqrt(xDiff + yDiff);
		return cityDistance;
			
	}
	public static double getRange(String city) {
		System.out.print("Enter maximum cell phone connectivity distance for " + city + ": ");
		Scanner sc = new Scanner(System.in);
		double cityRange = sc.nextDouble();
		return cityRange;
		
	}
	
}
