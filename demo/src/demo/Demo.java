package demo;

import java.util.Scanner;

public class Demo {
	public static String getWordsContainsPattern(String []words, String Pattern) {
		String patternMatch = "";
		for(int i = 0; i< words.length; i++) {
			if(words[i].contains(Pattern)) {
				patternMatch += words[i].toUpperCase()+"\n";
			}
		}
		return patternMatch;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[] = {"Southi Africa","Afghanistan","Sri Lanka","New Zealand","West Indies","England","India","Australia","Pakistan","Bangladesh"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern to match in array");
		String pattern = sc.next();
		System.out.println(getWordsContainsPattern(words,pattern));
	}
}
