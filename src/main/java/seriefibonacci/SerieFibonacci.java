/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package seriefibonacci;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SerieFibonacci {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de la serie de Fibonacci que desea mostrar: ");
        int numTerminos = scanner.nextInt();

        System.out.println("Serie de Fibonacci con " + numTerminos + " términos:");
        for (int i = 0; i < numTerminos; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
}
