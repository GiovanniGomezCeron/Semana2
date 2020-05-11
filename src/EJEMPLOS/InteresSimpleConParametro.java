package EJEMPLOS;
public class InteresSimpleConParametro {
    public static void main(String[]args){
        double cantidadPrestada,tiempo,tasaDeInteres;
        cantidadPrestada=150.00;
        tiempo=0.75;
        tasaDeInteres=0.08;
        double valorInteresSimple=calculoInteres(cantidadPrestada,tiempo,tasaDeInteres);
        System.out.println("El interes simple es: "+valorInteresSimple);
    }
    public static double calculoInteres(double cantidad,double tiempo,double tasa){
      double interes=cantidad*tiempo*tasa;  
    return interes;
    }
}
