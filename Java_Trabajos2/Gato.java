import java.util.Scanner;
public class Gato {
  public static Scanner eso= new Scanner (System.in);
  String raza;
  private String color;
  int energia;
  int nivelalimento;
  //Constructor de la clase Gato
  public Gato(String raza, String color, int energia, int nivelalimento){
    super();
    this.raza=raza;
    this.color=color;
    this.energia=energia;
    this.nivelalimento=nivelalimento;
        
  }
  // metodo para dar de comer al gato
  public void comer(int comida){
    this.nivelalimento=nivelalimento+comida;
    System.out.println("Este es el nivel alimenticio del gato "+this.nivelalimento);
    
  }
  //metodo para hacer dormir al gato
  public void dormir(int horas){
    
    switch (horas){
      case 1: {
        this.energia=energia+10;
      System.out.println("El gato tine este nivel de energia "+ this.energia+ "por las horas dormidas");
      }
      break;
      case 2:{
        this.energia=energia+20;
    System.out.println("El gato tine este nivel de energia "+ this.energia+ "por las horas dormidas");
      }
      break;
      case 3:{
        this.energia=energia+30;
    System.out.println("El gato tine este nivel de energia "+ this.energia+ "por las horas dormidas");
      }
      break;
      case 4:{
        this.energia=energia+40;
    System.out.println("El gato tine este nivel de energia "+ this.energia+ "por las horas dormidas");
      }
      break;
      case 5:{
        this.energia=energia+50;
    System.out.println("El gato tine este nivel de energia "+ this.energia+ "por las horas dormidas");
      }
      break;
      case 6:{
        this.energia=energia+60;
    System.out.println("El gato tine este nivel de energia "+ this.energia+ "por las horas dormidas");
      }
      break;
      case 7:{
        this.energia=energia+70;
    System.out.println("El gato tine este nivel de energia "+ this.energia+ "por las horas dormidas");
      }
      break;
      case 8:{
        this.energia=energia+80;
    System.out.println("El gato tine este nivel de energia "+ this.energia+ "por las horas dormidas");
      }
      break;
      case 9:{
        this.energia=energia+90;
    System.out.println("El gato tine este nivel de energia "+ this.energia+ "por las horas dormidas");
      }
      break;
      case 10:{
        this.energia=energia+100;
    System.out.println("El gato tine este nivel de energia "+ this.energia+ "por las horas dormidas");
      }
      break;
    }
    
  }
  // En este metodo podremos jugar con el gato
  public void jugar(){
    
    if (this.energia<=0  || this.nivelalimento<=1){
      System.out.print("El gato no quiere jugar"+"\n"+"Si quieres seguir jugando con el gato pon lo a dormir o que coma un poco");
      
     
      
      }
    else {
        
      this.energia-=1;
      this.nivelalimento-=2;
      System.out.print("El gato le encataria jugar"+"\n"+"El nivel de energia del gato es: "+this.energia+"\n"+"El nivel alimenticio del gato es: " +this.nivelalimento+"\n");
       
      
      
      }
      
      }
  }
  
