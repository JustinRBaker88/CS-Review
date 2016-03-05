// First assignment from CS 142 Homework list.
// The program is supposed to print out the output of the song
// and match the desired output exactly. An optional seventh verse
// is also added.
//
// This project is supposed to implement basic usage of methods to reduce
// redundancy. I added loops, parameters, and some basic recursion in my
// code for the assignment.

public class Song {

	public static void main(String[] args) {
		
		// calls dayOfChristmas() method for the seven days
		for (int i = 1; i <=7; i++)
			dayOfChristmas(i);

	}

	// Prints a given verse of the song.
	// Accepts an int parameter to handle the difference between verses.
	private static void dayOfChristmas(int day) {
		String Con = getContraction(day);
		System.out.println("On the " + day + Con + " day of \"Xmas\", my true love gave to me");
		verse(day);
	}

	// Prints a line according to the day parameter passed to the method.
	// if day != 1 the method will call itself with a parameter value decreased by 1
	private static void verse(int day) {
		if (day == 1) {
			System.out.println("a partridge in a pear tree.\n");
		} else if (day == 2) {
			System.out.println("two turtle doves, and");
		} else if (day == 3) {
			System.out.println("three French hens,");
		} else if (day == 4) {
			System.out.println("four calling birds,");
		} else if (day == 5) {
			System.out.println("five golden rings,");
		} else if (day == 6) {
			System.out.println("six geese a-laying,");
		} else {
			System.out.println("seven snowmen screaming,");
		}
		if (day != 1)
			verse(day - 1);
	}

	// Returns a string for the first, second, third, etc abbreviations/contractions
	// Accepts an int Parameter to determine which abbreviation to return
	private static String getContraction(int day) {
		String Con;
		if (day == 1) 
			Con = "st";
		else if (day == 2)
			Con = "nd";
		else if (day == 3)
			Con = "rd";
		else
			Con = "th";
		return Con;
	}
}
