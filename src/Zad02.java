import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Zad02 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("doubles.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        System.out.println("Ile liczb zmiennoprzecinkowych chciałbyś wprowadzić?");

        int howMany = scan.nextInt();
        double[] doublesTab = new double[howMany];

        for (int i = 0; i < doublesTab.length; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę: ");
            doublesTab[i] = scan.nextDouble();
        }
        bufferedWriter.write(Arrays.toString(doublesTab));
        bufferedWriter.close();
    }
}

