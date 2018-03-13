package POO;
import java.util.Scanner;

public class Promedio {
    Scanner tec = new Scanner(System.in);
    
    public void Vec(){
        
        double Vector []=new double[10];
        
        System.out.println("PROMEDIO");
        System.out.println("Necesitamos una muestra numérica de 10 valores. Por favor, ingreselos a continuación: ");
        for (int i = 0; i < (Vector.length); i++) {
            System.out.println("Ingrese valor N."+(i+1));
            Vector[i]=tec.nextInt();
        }
        calculando(Vector);
    }
    
    public void calculando(double [] Vector){
        double su=0;
        double prom=0;
        
        for (int i = 0; i < Vector.length; i++) {
            
            su=su+Vector[i];
        }
        prom=su/(Vector.length);
        
        System.out.println("El promedio de la muestra es: "+prom);
        System.out.println(" ");
    }
}