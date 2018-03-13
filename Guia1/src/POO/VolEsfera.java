package POO;
import java.util.Scanner;
import java.lang.Math;

public class VolEsfera {
    Scanner tc = new Scanner(System.in);
    
    public void Dato(){
        int s=0;
        double med=0;
        double dia=0;
        System.out.println("VOLUMEN DE UNA ESFERA");
        System.out.println("Desea ingresar Radio o Diametro?");
        System.out.println("1.Diametro\n2.Radio");
        s=tc.nextInt(); 
        if(s==1) {
            System.out.println("Ingrese Diametro");
            dia=tc.nextDouble();
            med=dia/2;
        }if (s==2) {
            System.out.println("Ingrese Radio");
            med=tc.nextDouble();
        }
        impr(med);
    }
    
    public void impr(double med){
        double volumen=0;
        double r=0;
        double vol=0;
        
        r= (int) Math.pow(med, 3);
        
        vol=(4*(Math.PI)*r);
        
        volumen =vol/3;
        
        System.out.println("El volumen de la esfera es: "+volumen);
        System.out.println(" ");
    }
}
