
/**
 * 
 * @author Kamesh
 * @version 1.2.3 
 * The first part of this lab was really easy converting from a number to a Roman numeral since 
 * all I had to do was make many while loops with different cases. The second part was the hard one.
 * I decided to make a switch statement with all the possible Roman Letters that can be read and their 
 * values. I called this from within the while loop I created in the static method. The hard part was
 * figuring out how to do the IV and IX and CD cases where the bigger numeral comes before and we use 
 * the subtraction rule, all I did for that was make an if statement and check if the number I was
 * currently on was greater in value than the Roman number of the next in the string and if so just add in 
 * the value of the difference of the two. 
 */
public class P3_Vedula_Kamesh_RomanNumerals {

	public static void main(String[] args){

		System.out.println(P3_Vedula_Kamesh_RomanNumerals.arabicToRoman(999));
		System.out.println(P3_Vedula_Kamesh_RomanNumerals.romanToArabic("MMMDXCIII"));
	}


	public static String arabicToRoman(int num){

		String roman = "";
		int sum = num;
		while (sum >= 1000) {
			// Move 1000 from sum to roman.
			roman += "M";
			sum -= 1000;
		}
		while (sum >= 900) {
			// Move 900 from sum to roman.
			roman += "CM";
			sum -= 900;
		}
		while (sum >= 500) {
			// Move 500 from sum to roman.
			roman += "D";
			sum -= 500;
		}
		while (sum >= 400) {
			// Move 400 from sum to roman.
			roman += "CD";
			sum -= 400;
		}
		while (sum >= 100) {
			// Move 100 from sum to roman.
			roman += "C";
			sum -= 100;
		}
		while (sum >= 90) {
			// Move 90 from sum to roman.
			roman += "XC";
			sum -= 90;
		}
		while (sum >= 50) {
			// Move 50 from sum to roman.
			roman += "L";
			sum -= 50;
		}
		while (sum >= 40) {
			// Move 40 from sum to roman.
			roman += "XL";
			sum -= 40;
		}
		while (sum >= 10) {
			// Move 10 from sum to roman.
			roman += "X";
			sum -= 10;
		}
		while (sum >= 9) {
			// Move 9 from sum to roman.
			roman += "IX";
			sum -= 9;
		}
		while (sum >= 5) {
			// Move 5 from sum to roman.
			roman += "V";
			sum -= 5;
		}
		while (sum >= 4) {
			// Move 4 from sum to roman.
			roman += "IV";
			sum -= 4;
		}
		while (sum >= 1) {
			// Move 1 from sum to roman.
			roman += "I";
			sum -= 1;
		}

		return roman;
	}



	private static int convert(char romanNumeral) {
		
		switch (romanNumeral) {
			case 'I':  return 1;
			case 'V':  return 5;
			case 'X':  return 10;
			case 'L':  return 50;
			case 'C':  return 100;
			case 'D':  return 500;
			case 'M':  return 1000;
			default:   return -1;
		}
		
	}


	public static int romanToArabic(String str){

		str = str.toUpperCase();
		int i = 0; //position to start the while loop iteration from
		int arabic = 0;  

		while (i < str.length()) {

			char letter = str.charAt(i); 
			int num = convert(letter);

			i++;

			//if there is no numbers left add the blank number to the Arabic number we created
			if (i == str.length()) {
				arabic += num;

			} else {
				//Check if the next letter in the string has a larger Roman numeral equivalence or not
				//if so, just count both letters together by subtracting the next Roman Character with the 
				//one we are on
				int num2 = convert(str.charAt(i));
				if (num2 > num) {
					//Subtract the larger Roman Numeral equivalence with the smaller one to get the
					//combined value (ex. IX = 9, IV, = 4)
					arabic += (num2 - num);
					i++;
				} else {
					arabic += num;

				}
				
			}

		}

		return arabic;

	}

}