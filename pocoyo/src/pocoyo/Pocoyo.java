/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pocoyo;
import java.util.Scanner;

/**
 *
 * @author GABRIELA
 */
public class Pocoyo {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
            int valor1 = 0;
            int valor2 = 0;
            int total;
            System.out.println("Introduce el primer número:"+valor1);
            valor1 = reader.nextInt();

            System.out.println("Introduce el segundo número:"+valor2);
            valor2 = reader.nextInt();
    total = valor1+valor2;
    System.out.println("La suma es :"+total);
    }
}
