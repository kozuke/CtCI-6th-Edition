package ch1.is_unique;

import java.util.ArrayList;
import java.util.List;

/**
 * 問題1.1 重複のない文字列 ある文字列が、全て固有である（重複する文字がない）かどうか判定するアルゴリズムを実装してください。
 * また、それを実装するのに新たなデータ構造が使えない場合、どのようにすれば良いですか？
 * 
 * @author kota
 *
 */
public class Answer {
	// 判定なのでreturnはboolean
	public static boolean hasSameChar(String str) {
		List<Character> charsList = new ArrayList<Character>();
		// くるくる回して同じ文字列が当たったらbreakする方針
		for (int i = 0; i < str.length() - 1; i++) {
			if (charsList.contains(str.charAt(i))) {
				return false;
			}
			charsList.add(str.charAt(i));
		}
		return true;
	}

	/**
	 * test
	 * @param args
	 */
	public static void main(String[] args) {
		String[] words = { "abcde", "hello", "apple", "kite", "padle" };
		for (String word : words) {
			System.out.println(word + ": " + hasSameChar(word));
		}
	}
}
