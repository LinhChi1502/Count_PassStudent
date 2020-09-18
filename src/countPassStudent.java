import java.util.Scanner;

public class countPassStudent {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int numOfStudent;
        do {
            System.out.println("Nhập số sinh viên: ");
            numOfStudent = sc.nextInt();
            if (numOfStudent > 30) {
                System.out.println("Số học sinh không vượt quá 30");
            }
        } while (numOfStudent > 30);
        int[] studentScore = new int[numOfStudent];
        for (int i = 0; i < studentScore.length; i++) {
            System.out.println("Nhập điểm sinh viên " + (i + 1) + ": ");
            studentScore[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < studentScore.length; i++) {
            if (studentScore[i] >= 5 && studentScore[i] <= 10) {
                count++;
            }
        }
        System.out.println("Số sinh viên pass là " + count);
    }
}
