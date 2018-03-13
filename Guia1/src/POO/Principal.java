
package POO;


public class Principal {
    
    public static void main (String [] args){
        AreaYDiagonal ayd = new AreaYDiagonal();
        Circunferencia circ = new Circunferencia();
        VolEsfera voes = new VolEsfera();
        VolCubo vocu= new VolCubo();
        Promedio prom = new Promedio();
        
        ayd.PedirDatos();
        circ.Datos();
        voes.Dato();
        vocu.PedirD();
        prom.Vec();
    }
    
}
