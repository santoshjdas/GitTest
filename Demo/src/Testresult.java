import java.util.ArrayList;
import java.util.Iterator;

public class Testresult {

	public static void main(String[] args) {
		ArrayList<Integer> fib = new ArrayList<Integer>();
		ArrayList<String> outputLines = new ArrayList<String>();
		int n1 = 0, n2 = 1, n3 = 0, k, count = 12;
		String fullString = "1";
		for (k = 0; k < count; ++k) {
			n3 = n1 + n2;
			fib.add(n3);
			fullString = fullString + n3 + "+";
			n1 = n2;
			n2 = n3;
		}
		System.out.print("\n");
		for (int i = 1; i < 9; i += 2) {
			String tempLine = "";
			for (int j = 0; j < 8 - i / 2; j++)
				tempLine = tempLine + " ";
			if (fullString.startsWith("+")) {
				fullString = fullString.substring(1);
			}
			for (int j = 0; j < i; j++) {
				tempLine = tempLine + (fullString.substring(0, 1));
				fullString = fullString.substring(1);
			}
			for (int l = tempLine.length(); l < 12; l++) {
				tempLine = tempLine + " ";
			}
			outputLines.add(tempLine);
		}

		for (int a = 5; a > 0; a -= 2) {
			String tempLine = "";
			for (int b = 0; b < 8 - a / 2; b++)
				tempLine = tempLine + " ";
			if (fullString.startsWith("+")) {
				fullString = fullString.substring(1);
			}
			for (int b = 0; b < a; b++) {
				tempLine = tempLine + fullString.substring(0, 1);
				fullString = fullString.substring(1);
			}
			for (int l = tempLine.length(); l < 12; l++) {
				tempLine = tempLine + " ";
			}
			outputLines.add(tempLine);
		}
		System.out.print("\n");
		String fullString1 = "";
		Iterator<String> iterator = outputLines.iterator();
		for (int a = 1; a < 9; a += 2) {
			if (iterator.hasNext()) {
				System.out.print(iterator.next());
			}
			for (int b = 0; b < 8 - a / 2; b++)
				System.out.print(" ");
			int number = 0;
			for (int b = 0; b < a; b++) {
				fullString1 = "UNOCOIN";
				number++;
				// System.out.println(fullString);
			}
			System.out.print(fullString1.substring(0, number));
			System.out.print("\n");
		}
		for (int a = 5; a > 0; a -= 2) {
			if (iterator.hasNext()) {
				System.out.print(iterator.next());
			}
			for (int b = 0; b < 8 - a / 2; b++)
				System.out.print(" ");
			int number = 0;
			for (int b = 0; b < a; b++) {
				fullString1 = "UNOCOIN";
				number++;
			}
			System.out.print(fullString1.substring(0, number));
			System.out.print("\n");
		}
}

}
