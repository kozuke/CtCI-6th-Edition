package ch1.chk_permutation;

import java.util.ArrayList;
import java.util.List;

/**
 * 問題1.2 順列チェック ２つの文字列が与えられたとき、片方がもう片方の並び替え担っているかどうかを決定するメソッドを書いてください。
 * 
 * @author kota
 *
 */
public class Answer {

	public static boolean inclSameChars(String str1, String str2) {
		boolean inclSameChars = false;
		// 文字数違う時点でアウト
		if (str1.length() != str2.length()) {
			return false;
		}
		// とりあえブルートフォースで
		List<Integer> numList = new ArrayList<Integer>(str1.length());
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (!numList.contains(j) && str1.charAt(i) == str2.charAt(j)) {
					numList.add(j);
					break;
				}
			}
		}

		if (str1.length() == numList.size()) {
			inclSameChars = true;
		}
		return inclSameChars;
	}

	public static void main(String[] args) {
		String[][] pairs = { { "apple", "papel" }, { "carrot", "tarroc" }, { "hello", "llloh" } };
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = inclSameChars(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}

	}

}
