package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int num1,num2,resultado;

        Scanner objeto=new Scanner(System.in);
        System.out.println("ingrese el primer numero de la suma");
        num1=objeto.nextInt();
        System.out.println("ingrese el segundo numero de la suma");
        num2=objeto.nextInt();
        resultado=num1+num2;
        System.out.println("el resultado de la suma es igual a :"+resultado);
    }
}
