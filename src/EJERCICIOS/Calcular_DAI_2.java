package EJERCICIOS;
import java.util.Scanner;
public class Calcular_DAI_2 {
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int condicion=0;
  double valorUsa=0.0,filete=0.0,seguro=0.0;
  do{
  System.out.println("Ingrese el valor del auto");
  valorUsa=sc.nextDouble();
  System.out.println("Ingrese filete");
  filete=sc.nextDouble();
  System.out.println("Ingrese el seguro");
   seguro=sc.nextDouble();
  if(valorUsa>0 && filete>0 && seguro>0){
      condicion=1;
  }
  else
  {   System.out.println("-----------------------------");
      System.out.println("Los valores tiene que ser > 0");
      System.out.println("-----------------------------");
  }
  }while(condicion==0);
 
      System.out.println("El valor de DAI del auto es: "+Calcular_dai(valorUsa, filete, seguro));
  } 
  public static double Calcular_dai(double valorUSA,double filete,double seguro){
  final double Depreciacion=valorUSA*0.10;
  double dai=(valorUSA-Depreciacion-filete-seguro)*0.25;
  return dai;
  }
}
