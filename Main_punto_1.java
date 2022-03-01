import java.util.Scanner;

class Main {
    public static Scanner entrada= new Scanner (System.in);
      public static int calcular (int x, int y, int operacion){
        int resultado=0;
        switch(operacion){  
          case 1:{
            resultado=x+y;
            break;
          }
          case 2:{
            resultado=x-y;
            break;
          }
          case 3:{
            resultado=x*y;
            break;
            }
         }
      return resultado;
      }
    public static float promedio(int x, int y, int operacion){
        
        float suma=x+y;
        float prost=0;
        
        switch(operacion){
            case 4: prost=suma/2;break;}
        return prost;
      }
      

  public static void main (String args[]){
    int x, y, operacion;
    System.out.print("Digite un numero: ");
    x= entrada.nextInt();
    System.out.print("Digite otro numero: ");
   y= entrada.nextInt();
  System.out.print("Digite cual operacion quiere hacer: 1 Suma, 2 Resta 3, Multiplicacion y 4 Promedio:  ");
  operacion= entrada.nextInt();
  if (operacion>=1 && operacion<=4){
          System.out.print("El resultado de la operacion es: "+calcular(x,y,operacion));
      }
   else {
           System.out.print("Ingrese un numero de los cuales se le indico");
          operacion=entrada.nextInt();
      }
     if (operacion==4){
       System.out.print("El resultado del promedio  es: "+promedio(x,y,operacion));
    }
    
  }
 }
