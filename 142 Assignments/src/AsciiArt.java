// This class prints two squares and two triangles.
// The requirements of the assignments were to come up with pieces of ASCII art
// and use static method and or loops in the creation of the art.

public class AsciiArt {

	public static void main(String[] args) {
		square(4);
		triangle(4);
		square(6);
		triangle(6);
		
	
	}

	// Prints a triangle with a given height
	// and then prints a line at the end.
	private static void triangle(int height) {
		for (int i = 1; i <= height; i++) { // loops to print the desired number of layers 
			printSpaces(height-i); 			// spaces for alignment
			drawTriangleBody(i);
		}
		drawLine(height*2);					
		
	}

	// prints a square, the body of the square will have its height determined
	// by the parameter.
	private static void square(int base) {
		if (base == 1)
			System.out.println("[]");
		else { 
			drawLine(base*3);
			drawSquareBody(base);
			drawLine(base*3);
		}
			
	}

	// Prints the mid segments of the square.
	// Each segment starts and ends with a '^' character separated by spaces.
	private static void drawSquareBody(int base) {
		for (int i = 0; i < base; i++) {
			System.out.print("^");
			printSpaces(base*3 -2);
			System.out.println("^");
		}
	}
	
	// Accepts an int as a parameter and prints a single line of a triangle's body.
	// the parameter is used to determine the spaces between the edges.
	private static void drawTriangleBody(int base) {
		System.out.print("/");
		printSpaces(base*2 -2);
		System.out.println("\\");		
	}
	
	// Accepts an int as a parameter and prints that number of spaces.
	private static void printSpaces(int spaces) {
		for (int i = 0; i < spaces; i++) {
			System.out.print(" ");
		}
	}

	// Accepts an int as a parameter and prints that number of '^' characters.
	// After the proper number of characters have been printed a println command is executed for spacing.
	private static void drawLine(int length) {
		for (int i = 0; i < length; i++)
			System.out.print("^");
		System.out.println();
				
	}
	
}
