package EJEMPLOS;
public class CreacionMetodos {
    public static void main(String[] args) {
        System.out.println("Metodo Void");
        metodoVoid(1,24.34,"Lucas");
        System.out.println("-----------------");
        System.out.println("Metodo int");
        metodoInt(1);
        System.out.println("------------------");
        System.out.println("Metodo double");
        metodoDouble(12.3);
        System.out.println("------------------");
        System.out.println("Metodo String");
        metodoString("Lucas");
        
    }
  public static void metodoVoid(int n,double n2,String nombre){
      System.out.println("Valor int "+n);
      System.out.println("Valor double "+n2);
      System.out.println("Valor String "+nombre);
  }
  public static void metodoInt(int n){
      System.out.println("Valor int "+n);
  }
  public static void metodoDouble(double n){
      System.out.println("Valor double "+n);
  }
  public static void metodoString(String nombre){
      System.out.println("Valor String "+nombre);
  }
}
