/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class SumaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        int valorUno = sc.nextInt();
        System.out.println("Ingrese numero 2");
        int valorDos = sc.nextInt();

        Suma valores = new Suma(valorUno, valorDos);
        valores.Imprimir();

    }
}
