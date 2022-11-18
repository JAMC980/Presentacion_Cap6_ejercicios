
package cap6_6_22;

import java.util.Scanner;


public class Cap6_6_22 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
  
        System.out.println("Covierte grados Centrigrados a Fahrenheit o viceversa");
        System.out.println("Presione 1 para convertir Centrigrados a Fahrenheit");
        System.out.println("Presione 2 para convertir Fahrenheit a Centigrados");
        int seleccion = entrada.nextInt();
  
        if (seleccion == 1) {
            System.out.print("Ingrese los grados Centigrados: ");
            double grados = entrada.nextDouble();
            System.out.printf("%.2f grados Centigrados son %.2f grados Fahrenheit\n", grados, fahrenheit(grados));
        }
        else {
            System.out.print("Ingrese los grados Fahrenheit: ");
            double grados = entrada.nextDouble();
            System.out.printf("%.2f grados Fahrenheit son %.2f grados Centigrados\n", grados, centigrados(grados));
        }
    }
 
    public static double centigrados(double fahrenheit) {
        double centigrados = 5.0 / 9.0 * (fahrenheit - 32);
        return centigrados;
    }
 
    public static double fahrenheit(double centigrados) {
      double fahrenheit = 9.0 / 5.0 * centigrados + 32;
        return fahrenheit;
    }
}
    

