// This code will print a representation of the space needle scaling on a class constant
// using ASCII characters. Loops and methods are required to produce the text representation. 

public class SpaceNeedle {
	
	public static final int SCALE = 4; // scale for the ASCII art, must be bigger than 2, default 4
	
	public static void main(String[] args) {
		
		straightSegement();
		foundationSegment();
		secondSegement();
		straightSegement();
		thirdSegement();
		foundationSegment();

	}
	

	// This method creates the straight segment used at the begining segment and below the 
	// top segment.
	private static void straightSegement() {
		for (int i = 0; i < SCALE; i++) {
			insertString("   ", SCALE);
			System.out.println("||");
		}
	}
	
	// This method creates the lower half of the top of the needle.
	private static void secondSegement() {
		for (int i = 0; i < SCALE; i++) {
			insertString("  ", i);
			System.out.print("\\_");
			insertString("/\\", SCALE*3 - 1 -2*i);
			System.out.println("_/");
		}
	}
	
	// This method creates the segment above the lowest section.
	// its height scales with the square of the SCALE.
	private static void thirdSegement() {
		for (int i = 0; i < SCALE*SCALE; i++) {
			insertString("   ", SCALE-1);		
			System.out.println("|%%||%%|");
		}
	}
	
	// this method creates segment near the top and at the bottom of the space needle.
	private static void foundationSegment() {
		for (int i = 0; i < SCALE; i++) {
			insertString("   ", SCALE - i - 1);
			System.out.print("__/");
			insertString(":::", i);
			System.out.print("||");
			insertString(":::", i);
			System.out.println("\\__");
		}
		System.out.print("|");
		insertString("\"\"\"\"\"\"", SCALE);
		System.out.println("|");
	}
	
	// This method accepts a string and integer and repeats the string
	// the desired number of times.
	private static void insertString(String insert, int n) {
		for (int i = 0; i < n; i++)
		System.out.print(insert);
	}
}
