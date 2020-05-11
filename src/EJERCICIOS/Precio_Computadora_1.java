package EJERCICIOS;

import java.util.Scanner;

public class Precio_Computadora_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int condicion=0;
        double precio=0.0;
        do{
        System.out.println("Ingrese el precio de la computadora");
        precio = sc.nextDouble();
        if(precio>0){
            condicion=1;
        }
        else{
            System.out.println("--------------------------------------------");
            System.out.println("El precio de la computadora tiene que ser >0");
            System.out.println("--------------------------------------------");
        }
        }
        while(condicion==0);
        System.out.println("El precio de la pc es: " + Calcular_Precio_pc(precio));
    }

    public static double Calcular_Precio_pc(double precio) {
        double Precio_Total = precio - precio * 0.13;
        Precio_Total = Precio_Total - Precio_Total * 0.15;
        return Precio_Total;
    }
}
