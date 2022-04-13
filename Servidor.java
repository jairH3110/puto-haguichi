package A2;


import java.rmi.*;


public class Servidor {
    

    public Servidor(){
        try {
   
            System.setProperty(
                "java.rmi.server.codebase", 
                "25.10.160.35");

            InterfaceRemota objetoRemoto = new ObjetoRemoto();
            Naming.rebind("//25.10.160.35/ObjetoRemoto", objetoRemoto);
            System.out.println("Servidor inicializado...");

        } catch (Exception e) {
            e.printStackTrace();
        }

    } 

     public static void main(String[] args) {
        new Servidor();

    } 
}