import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static Scanner entrada = new Scanner(System.in);
    public static Scanner entradas = new Scanner(System.in);
    public static ArrayList<Float> lista = new ArrayList<Float>();
    
    public static float promedio(ArrayList <Float> lista) {
        float sumatoria=0, resultado=0;
        int numeroslist=0 , z=0;
        numeroslist = lista.size();
        
        for (int p = 0; p < numeroslist; p++) {
            sumatoria= sumatoria + lista.get(z);
            z+=1;
            }
        resultado = sumatoria / numeroslist;
        
        return resultado;
    }

    public static void main(String[] args) {
        float notas;
        int n = 0;

        System.out.println("Cuantas notas quiere ingresar: ");
        int x = entrada.nextInt();

        do {
            System.out.println("Ingrese un número: ");
            notas = entradas.nextFloat();
            lista.add(notas);
            n += 1;
        } while (n < x);
        System.out.println("Los elementos que estan en la lista son: " + lista);

      
        
        System.out.println("El promedio de las notas dadas es:"+(promedio(lista)));
    }
}
