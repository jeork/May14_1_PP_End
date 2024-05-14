import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PMain9 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] n = new int[7];
		int[] lotto = new int[6];
		int b = r.nextInt(7);

		Scanner k = new Scanner(System.in);

		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (n[i] == n[j])
					i--;
			}
		}

		Arrays.sort(n);
		System.out.print("로또 번호  : ");
		for (int i = 0; i < lotto.length; i++) {
			if (i == b)
				continue;
			else {
				lotto[i] = n[i];
				System.out.print(lotto[i] + " ");
			}
		}

		System.out.println();
		System.out.println("보너스 번호 : " + n[b]);

	}
}
