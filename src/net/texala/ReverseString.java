package net.texala;

public class ReverseString {

	public static String reverseString(String inputStr) {
		char[] charArray = inputStr.toCharArray();
		char temp;
		for (int i = 0; i < charArray.length / 2; i++) {
			temp = charArray[i];
			charArray[i] = charArray[charArray.length - 1 - i];
			charArray[charArray.length - 1 - i] = temp;

		}
		return new String(charArray);
	}

	public static void main(String[] args) {

		String s = "ajeet";
		System.out.println("Reverse String of input string " + s + " Is: " + reverseString(s));
	}

}
