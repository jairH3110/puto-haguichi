package A2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/*

UnicastRemote se utiliza para ña exportacion de un objeto remoto con el protocolo
de metodo remoto java (JRMP) y la obtencio de un stub que se comunica 
con el objeto remoto 

la comunicacion solo puede darse a traves del contrato establencido por medio
de una interfaz , por tal razon la clase implementa a interface remotaS

*/

public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota {

    private static final long  serialVersionUID = 1L;
   
    // cONTRUYE IONTACNIA DE OBJETO REMOTO

    protected ObjetoRemoto() throws RemoteException {
        super();
    }//FIN DEL CONSTRUCTOR 
    
    
    public double area_circulo(double r) throws RemoteException {
        System.out.println("Calculando area del circulo");
 
   
 
        return (r * r) * Math.PI;
     }


     public double area_poligono(double l, double lo, double apo) throws RemoteException {
        System.out.println("Calculando area de poligono xd");
 
   ;
 
        return (l * lo)  * apo / 2 ;
     }

     public double area_poligono_irregular(double capital, double interes, double plazo) throws RemoteException {
        System.out.println("Calculando Cuota...");
 
        double plazoMes = plazo / 12.00;
        double interesMes = interes / 12.00;
 
        return (capital * interes) / (100.00 * (1- Math.pow(interesMes / 100.00, plazoMes)));
     }
    

} 