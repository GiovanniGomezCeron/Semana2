package EJERCICIOS;
import java.util.Scanner;
public class Salario_vendedor_3 {

    public static void main(String[] args) {
        int n_auto = 0;
        double monto_ventas = 0.0;
        String nombre="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el nombre del vendedor");
        nombre=sc.nextLine();
        System.out.println("Ingrese el numero de autos vendidos");
        n_auto=sc.nextInt();
        System.out.println("Ingrese el monto_de_ventas");
        monto_ventas=sc.nextDouble();
        System.out.println("El nombre del vendedor es:\n"+nombre+"\nEl monto de ventas es: "+monto_ventas+"\nEl salario devengado: "+Calcular_Salario(n_auto, monto_ventas));
        
    }

    public static double Calcular_Salario(int n_auto, double monto_ventas) {
        final double salario_mes = 800.00, comision_auto = 175.00, comision= 0.05;
        double salario=0.0;
        salario=salario_mes+n_auto*comision_auto+monto_ventas*comision;
        return salario;
    }

}
