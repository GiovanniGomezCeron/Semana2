package EJERCICIOS;

import java.util.Scanner;

public class Salario_Vendedor_Computadoras_4 {

    public static void main(String[] args) {
        int n_computadoras = 0;
        double monto_ventas = 0.0;
        String nombre = "";
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese el nombre del vendedor");
            nombre = sc.nextLine();
            System.out.println("Ingrese el numero de computadoras vendidas");
            n_computadoras = sc.nextInt();
            System.out.println("El nombre del vendedor es: \n" + nombre + "\nLa cantidad de computadoras vendidas: \n"
                    + n_computadoras + Calcular_Salario(n_computadoras));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String Calcular_Salario(int n_computadoras) {
        final double salario_mes = 300.00, comision_pc = 50.00, renta = 0.10;
        double salario = 0.0, retencion_renta = 0.0;
        salario = salario_mes + n_computadoras * comision_pc;
        retencion_renta = salario * renta;
        salario = salario - retencion_renta;
        return "\nEl salario del vendedor es: \n" + String.valueOf(salario) + "\n La retención de renta es: \n" + retencion_renta;
    }
}
