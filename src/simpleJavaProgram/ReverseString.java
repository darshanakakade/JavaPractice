package simpleJavaProgram;

import javax.print.attribute.standard.RequestingUserName;

public class ReverseString {

	public static String reverselogic(String str) {
		char[] ch = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}

	// using string string Builder
	public static String reverselogic2(String str) {
		StringBuilder SB = new StringBuilder(str);
		StringBuilder s = SB.reverse();
		return s.toString();
	}

	// using string buffer
	public static String reverselogic3(String str) {
		StringBuffer SB = new StringBuffer(str);
		StringBuffer s = SB.reverse();
		return s.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverselogic("I am Darshana"));
		System.out.println(reverselogic2("i am dipati"));
		System.out.println(reverselogic3("i am khan"));
	}

}
