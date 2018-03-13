package POO;
import java.util.Scanner;
import java.lang.Math;

public class AreaYDiagonal {
    Scanner teclado = new Scanner(System.in);
    
    public void PedirDatos(){
        int a=0;
        int b=0;
        System.out.println("AREA Y DIAGONAL.");
        System.out.println("Ingresará las medidas de los lados de una figura cuadrada o rectangular.");
        
        System.out.println("Ingrese lado a: ");
        a=teclado.nextInt();
        
        System.out.println("Ingrese lado b: ");
        b=teclado.nextInt();
        
        CalculandoArea(a, b);
        CalculandoDiagonal(a, b);
   }
    
    public void CalculandoArea(int a, int b){
        
        double area=0;
        
        area=a*b;
        System.out.println("El area de su figura es: "+area);
    }
    
    public void CalculandoDiagonal(int a, int b){
        int y, z, r;
        double diagonal;
        
        y= (int) Math.pow(a,2);
        z= (int) Math.pow(b, 2);
        
        r=y+z;
        diagonal=(double) Math.sqrt(r);
        
        System.out.println("La diagonal de su figura es "+diagonal);
        System.out.println(" ");
    }
    
}
