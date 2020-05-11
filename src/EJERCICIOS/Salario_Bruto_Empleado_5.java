package EJERCICIOS;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Salario_Bruto_Empleado_5 {

    public static void main(String[] args) {
        int llegadas_tarde = 0, condicion = 0;
        double salario = 0.0;
        Scanner dato = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("#0.00");
        String nombre_empleado = "";
        System.out.println("Ingrese el nombre del empleado");
        nombre_empleado = dato.nextLine();
        try {
            do {

                System.out.println("Ingrese el salario del empleado");
                salario = dato.nextDouble();
                System.out.println("¿Cuántas veces ha llegado tarde?");
                llegadas_tarde = dato.nextInt();
                if (!(salario <= 0) && !(llegadas_tarde <= 0)) {
                    condicion = 1;
                } else {
                    System.out.println("-----------------------------------");
                    System.out.println("El salario del empleado o el número de tardias debe ser >0");
                    System.out.println("-----------------------------------");
                }
            } while (condicion == 0);
        } catch (Exception e) {
            System.out.println("Error; " + e.getMessage());
        }

        System.out.println("El nombre del empleado es: \n" + nombre_empleado + "\nVeces que ha llegado tarde:\n"
                + llegadas_tarde + "\n" + Calcular_Salario_Bruto(salario, llegadas_tarde, f));
    }

    public static String Calcular_Salario_Bruto(double salario_mes, int llegadas_tardes, DecimalFormat f) {
        double salarioTotal = 0.0, descuento_tardes = 0.0, salarioMinuto;
        final double renta = 0.10;
        salarioMinuto = salario_mes / 4 / 5 / 8 / 60;
        descuento_tardes = llegadas_tardes * salarioMinuto;
        salarioTotal = salario_mes - descuento_tardes - salario_mes * 0.10;
        return "Salario por minuto:\n" + f.format(salarioMinuto) + "\nRenta:\n" + (salario_mes * renta) + "\nDescuento por llegadas tardes:\n"
                + f.format(descuento_tardes) + "\nSalario total:\n" + f.format(salarioTotal) + "\n";
    }
}
