import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introduceți numele: ");
        String nume = in.nextLine();

        System.out.print("Introduceți greutatea (kg): ");
        double greutate = in.nextDouble();

        System.out.print("Introduceți înălțimea (m): ");
        double inaltime = in.nextDouble();


        CalculatorIMC calculator = new CalculatorIMC(nume, greutate, inaltime);

        System.out.println(calculator.getRezultatFormatat());

        in.close();
    }
}
