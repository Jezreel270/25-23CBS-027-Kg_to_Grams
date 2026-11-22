import java.util.Scanner;

public class Kilogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kg, g;

        System.out.print("Enter weight in kilograms: ");
        kg = sc.nextDouble();

        g = kg * 1000;

        System.out.println("Weight in grams = " + g);
    }
}
