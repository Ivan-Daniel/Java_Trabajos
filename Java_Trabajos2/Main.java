import java.util.Scanner;
public class Main {
  public static Scanner info= new Scanner (System.in);
  public static Scanner info2= new Scanner (System.in);
  public static void main (String[]args){
    String dato1, dato2, dato5;
    int dato3, dato4, x, y, horas, juego;
    System.out.println("Inicio el programa");
    System.out.println("Cual es la raza del gato?: ");
    dato1= info2.nextLine();
    System.out.println("Cual es su color?: ");
    dato2= info2.nextLine();
    System.out.println("Cuanta es su energia?: ");
    dato3= info.nextInt();
    System.out.println("El nivel alimenticio del gato: ");
    dato4= info.nextInt();
    System.out.println("Quieres interactuar con el gato?");
    dato5= info2.nextLine();
 // Creación del objeto Paco que pertenece a la clase Gato (Instancia)
    Gato misifus= new Gato(dato1, dato2, dato3, dato4);
    while (true){       
      if(dato5.equals("si")){
        System.out.println("Que quieres hacer con el gato?: "+"\n"+ "1 darle comida"+"\n"+ "2 jugar con el"+"\n"+"3 que duerma"+"\n"+"4 no estar mas con el gato");
        y= info.nextInt();           
        
        switch(y){
          case 1: {
          System.out.println("Cuanta comida quiere darle al gato?: ");
          x= info.nextInt();
          misifus.comer(x);
            }
            break;
          case 2: {
            System.out.println("Cuantas veces quieres jugar con el gato?: ");
            juego= info.nextInt();
            for (int j=0; j<juego;j+=1){
                misifus.jugar();
              }
            }
         break;
          case 3: {
            System.out.println("Cuantas horas va a poner a dormir al gato ?: ");
            horas=info.nextInt();
            misifus.dormir(horas);
          }
          break;
          case 4 :{
            dato5="Si";
            break;
          }
           
      }
     }// fin del if 
      else {        
        break;
        }
     } // fin del while true
    
    } 
    
  }
  
