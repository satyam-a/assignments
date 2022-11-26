
public class Assignment {

	public static void main(String[] args) {
		// q1. WAP to reverse a string
		String s1 = "Satyam";
		String s2 = "";

		// first way
		for (int i = 0; i < s1.length(); i++) {
			s2 = s1.charAt(i) + s2;
		}
		System.out.println(s2);

		// second way
		s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);

		// q2.WAP to reverse a sentence while preserving the position
		s1 = "My name is Satyam, I love coding.";
		s2 = "";
		String s3 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ' || s1.charAt(i) == '.' || s1.charAt(i) == ',') {
				s2 = s2 + s3 + s1.charAt(i);
				s3 = "";
			} else {
				s3 = s1.charAt(i) + s3;
			}

		}
		System.out.println(s2);

		// q3. WAP to check if a string is anagram or not
		s1 = "abyss";
		s2 = "sabyo";
		s3 = "";
		if (s1.length() != s2.length()) {
			System.out.println("two strings are not anagram of each other.");
			System.exit(0);
		}
		boolean isPresent = false;
		for (int i = 0; i < s1.length(); i++) {

			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					if (s3.indexOf(((Integer) j).toString()) == -1) {
						isPresent = true;
						s3 = s3 + j;
						System.out.println(s3);
						break;
					}

				}
			}
			if (isPresent == false) {
				System.out.println("two strings are not anagram of each other.");
				break;
			}
		}
		if (isPresent == true) {
			System.out.println("two strings are anagram of each other.");
		}

		// q4. WAP to check if a string is pangram or not
		s1 = "abcdefghijklmnopqrstuvwxyz";
		s2 = "";
		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			if ((int) s1.charAt(i) >= 65 && (int) s1.charAt(i) <= 90
					|| (int) s1.charAt(i) >= 97 && (int) s1.charAt(i) <= 122) {
				if (s2.indexOf(s1.charAt(i)) == -1) {
					s2 = s2 + s1.charAt(i);
					count++;
				}
			}
		}
		if (count == 26) {
			System.out.println("String is pangram");
		} else {
			System.out.println("String is not a pangram");
		}

		// q5. WAp to print repeatedly occurring characters in the given string
		System.out.println("output for WAp to print repeatedly occurring characters in the given string");
		s1 = "my name is anthony gonzalves";
		s2 = "";
		s3 = "";

		for (int i = 0; i < s1.length(); i++) {
			if (s2.indexOf(s1.charAt(i)) == -1) {
				s2 += s1.charAt(i);
			} else {
				if (s3.indexOf(s1.charAt(i)) == -1) {
					s3 += s1.charAt(i);
				}
			}
		}
		for (int i = 0; i < s3.length(); i++) {
			if (s3.charAt(i) != ' ') {
				System.out.println(s3.charAt(i));
			}
		}

		// q6. WAP to sort a string alphabetically
		System.out.println("o/p for string sort alphabetically");

		s1 = "SATYAM";
		int swapCount = 0;
		do {
			swapCount = 0;
			for (int i = 1; i < s1.length(); i++) {
				s2 = "";
				if (s1.charAt(i - 1) > s1.charAt(i)) {
					swapCount++;
					s2 = s1.substring(0, i - 1) + s1.charAt(i) + s1.charAt(i - 1);
					if (i <= s1.length() - 1) {
						s1 = s2 + s1.substring(i + 1);
					}
				}
			}
		} while (swapCount != 0);
		System.out.println(s1);

		// q7. WAP to count the number of Vowels and Consonants of a String value
		System.out.println("WAP to count the number of Vowels and Consonants of a String value");
		s1 = "My name is Satyam";
		s2 = "aAeEiIoOuU";
		int consCount = 0;
		int vowelCount = 0;
		for (int i = 0; i < s1.length(); i++) {
			if ((int) s1.charAt(i) >= 65 && (int) s1.charAt(i) <= 90
					|| (int) s1.charAt(i) >= 97 && (int) s1.charAt(i) <= 122) {
				if (s2.indexOf(s1.charAt(i)) == -1) {
					consCount++;
				} else {
					vowelCount++;
				}
			}
		}
		System.out.println(
				"in the string " + s1 + "number of vowels are " + vowelCount + " and consonants are " + consCount);

		// q8. WAP to count number of special characters
		System.out.println("WAP to count number of special characters");
		s1 = "there @re few $pe(ial (#@r@(ter$ here";
		int spclCharCount = 0;
		for (int i = 0; i < s1.length(); i++) {
			if ((int) s1.charAt(i) >= 65 && (int) s1.charAt(i) <= 90
					|| (int) s1.charAt(i) >= 97 && (int) s1.charAt(i) <= 122
					|| s1.charAt(i) >= 48 && s1.charAt(i) <= 57) {

			} else {
				spclCharCount++;
			}
		}
		System.out.println("Special Characters count : " + spclCharCount);
	}
}
