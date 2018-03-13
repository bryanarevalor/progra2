package POO;
import java.util.Scanner;
import java.lang.Math;


public class VolCubo {
    Scanner sc = new Scanner(System.in);
    
    public void PedirD(){
        double diag=0;
        double s=0;
        double arista=0;
        double volcu=0;
        
        System.out.println("VOLUMEN DE UN CUBO");
        System.out.println("Ingrese el valor de la diagonal de su cubo perfecto: ");
        diag=sc.nextDouble();
        
        s= (double) Math.sqrt(3);
        arista= diag/s;
        
        volcu=(double)(Math.pow(arista, 3));
        
        System.out.println("El volumen de su cubo perfecto es:" +volcu);
        System.out.println(" ");
        
    }
    
}
