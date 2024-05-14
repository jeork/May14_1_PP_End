import java.util.Iterator;
import java.util.Scanner;

// main함수에서 진행
// 1 : 학생 수 값을 입력받을 수 있게
// 2 : 각 학생들의 점수를 입력 받을 수 있게
// 3 : 학생들의 점수리스트를 출력할 수 있게(ex: 1번학생 점수  50점)
// 4 : 최고점수와 평균점수를 분석해서 출력
// 5 : 프로그램 종료
public class PMain6 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int i;
		int student = 0;
		int[] score = new int[0];
		int high_score;
		float avg;
		int score_sum=0;

		a: while (true) {

			System.out.print("입력 : ");
			i = k.nextInt();

			switch (i) {
			case 1:
				System.out.print("학생 수를 입력하세요 :");
				student = k.nextInt();
				score = new int[student];
				break;
			case 2:
				for (int j = 0; j < student; j++) {
					System.out.printf("%d 번학생 점수 입력 : ", j+1);
					score[j] = k.nextInt();
				}
				break;
			case 3:
				for (int j = 0; j < score.length; j++) {
					System.out.printf("%d번 학생 점수 : %d\n", j + 1, score[j]);
				}

				break;
			case 4:
				high_score = score[0];
				for (int j = 0; j < score.length; j++) {
					if (high_score < score[j]) {
						high_score = score[j];
					}
				}
				System.out.println("최고 점수 : " + high_score);
				for (int j = 0; j < score.length; j++) {
					score_sum += score[j];
				}
				avg = score_sum/student;
				System.out.println("평균 점수 : "+avg);
				break;
			case 5:
				System.out.println("프로그램 종료");

				break a;

			default:
				System.out.println("다시 입력하세요");
				break;
			}
		}

	}
}
