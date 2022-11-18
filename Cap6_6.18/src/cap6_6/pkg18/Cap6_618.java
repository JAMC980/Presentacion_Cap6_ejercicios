/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cap6_6.pkg18;

import java.util.Scanner;


public class Cap6_618 {

    
    public static void main(String[] args) {
        System.out.print("\nEste programa recibe un entero e imprime ");
        System.out.println("un cuadrado de asteriscos con ese numero de lado.");

        int lado;
        Scanner entrada = new Scanner(System.in);
 
         Cap6_618 miObjeto = new Cap6_618();

        System.out.println("\nPor favor introduzca un entero: ");
        lado = entrada.nextInt();

        miObjeto.Cuadrado(lado);
    }

    public void Cuadrado(int n) {
       for ( int i = 1; i <= n; i++ )
{   
for ( int j = 1; j <= n; j++ )
System.out.print("*");
 System.out.println();
}
} 
}  
         
 
