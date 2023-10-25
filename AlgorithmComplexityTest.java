import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String str = scanner.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i);
            frequentChar[ascii] += 1;
        }

        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("Chu cai xuat hien nhieu nhat la " + character + " voi so " + max + " lan");

    }
}