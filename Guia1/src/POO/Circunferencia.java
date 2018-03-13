package POO;
import java.util.Scanner;
import java.lang.Math;

public class Circunferencia {
    Scanner te= new Scanner(System.in);
    
    public void Datos(){
        int e=0;
        double medida=0;
        double radio=0;
        System.out.println("CIRCUNFERENCIA");
        System.out.println("Desea ingresar Radio o Diametro?");
        System.out.println("1.Diametro\n2.Radio");
        e=te.nextInt(); 
        if(e==1) {
            System.out.println("Ingrese Diametro");
            medida=te.nextDouble();
        }if (e==2) {
            System.out.println("Ingrese Radio");
            radio=te.nextDouble();
            medida=radio*2;
        }
        cuentas(medida);
    }
    
    public void cuentas(double medida){
        double valor=0;
        
        valor=medida*(Math.PI);
        
        System.out.println("La circunferencia tiene un valor de: "+valor);
        System.out.println(" ");
    }
    
    
}
    

