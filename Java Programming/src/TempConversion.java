// Fahrenheit ↔ Celsius Conversion

/*
  Convert the temperature readings given in degree Fahrenheit to degree
  Celsius, using the following formula :
  C = (5/9) * (F - 32)
  Test these values in degree Fahrenheit: 68, 150, 212, 0, -22, -200.
  Output: The  Celsius value for the Farenheit value 68 is  _
  Input some values to convert Celsius to Fahrenheit.
  Output: The Farenhit value for the Celsius value  _ is  _
*/

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        double[] fahrenheitValues = {68, 150, 212, 0, -22, -200};

        System.out.println("Fahrenheit to Celsius Conversion:");
        for (double f : fahrenheitValues) {
            double c = (5.0 / 9.0) * (f - 32);
            System.out.println("Celsius value for Fahrenheit " + f + " is " + c);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Celsius value to convert into Fahrenheit: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println("Fahrenheit value for Celsius " + celsius + " is " + fahrenheit);

        sc.close();
    }
}
