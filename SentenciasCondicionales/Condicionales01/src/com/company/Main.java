package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Leídos dos números por teclado, A y B, calcular la resta del mayor menos el menor.
        Por ejemplo, si A = 8 y B = 3, el resultado debe ser A – B, es decir, 5. Pero si A = 4 y B = 7, el resultado
        debe ser B – A, es decir, 3.
         */

        int numeroUno, numeroDos, resultadoResta;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un número:");
        numeroUno = sc.nextInt();

        System.out.println("Escriba un número:");
        numeroDos = sc.nextInt();

        if(numeroUno < numeroDos)
        {
            resultadoResta = numeroDos - numeroUno;
        }
        else
        {
            resultadoResta = numeroUno - numeroDos;
        }

        System.out.println("El resultado de la resta es: " + resultadoResta);

    }
}
