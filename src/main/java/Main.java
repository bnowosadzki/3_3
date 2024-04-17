import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj rozmiar trójkąta");
        int size = new Scanner(System.in).nextInt();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swój znak: ");
        String name = scanner.next();

        for (int row = 1; row <= size; row++) {
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }
      
            for (int col = 1; col <= row; col++) {
                System.out.print(name);
            }
            System.out.println();
        }
    }
}