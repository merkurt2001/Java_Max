import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveAll {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("hi", "hi", "hi", "yo"));
		removeAll(list, "hi");
	}

	public static void removeAll(ArrayList<String> wordList, String targetWord) {

		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).equals(targetWord)) {
				wordList.remove(wordList.get(i));
				i--;
			}
		}

		System.out.println(wordList);
	}
}