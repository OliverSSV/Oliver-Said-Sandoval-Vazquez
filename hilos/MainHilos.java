/* Oliver Said Sandoval Vazquez 
  Programa de hilos */
package hilos;
import java.util.Scanner;
import java.util.InputMismatchException;
public class MainHilos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Array A1, A2, A3;
      
        
        System.out.println("--------------- PROGRAMA DE HILOS ----------------------");
        System.out.println("INTRODUZCA EL VALOR PARA EL TAMA�O DEL VECTOR: ");
        int tama�o = leer.nextInt();

        A1 = new Array("PRIMER HILO", tama�o); 
        A2 = new Array("SEGUNDO HILO", tama�o); 
        A3 = new Array("TERCER HILO", tama�o);

        A1.start(); 
        A2.start(); 
        A3.start(); 

        try {
            A1.join();
            A2.join(); 
            A3.join();
        } catch (InterruptedException e) {
        }
        
        System.out.println("SUMA DEL PRIMER HILO: " + A1.getSuma()); 
        System.out.println("SUMA DE CUADRADOS DEL SEGUNDO HILO: " + A2.getSumaCuadrados()); 
        System.out.println("MEDIA DEL TERCER HILO: " + A3.getMedia()); 
        
        
  
      }
}