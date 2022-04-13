package A2;

import java.rmi.*;
import java.text.*;
import java.util.Scanner;


public class Cliente {

    public Cliente(){
        Scanner xd = new Scanner(System.in);
         double r,l,lo,apo;
            int numero;
     try{


        InterfaceRemota objetoRemoto= (InterfaceRemota) Naming.lookup("//25.10.160.35/ObjetoRemoto");

       
        DecimalFormat df = new DecimalFormat("#.##");
        for(int i= 0; i<10;i++){

            System.out.println("MENU \n");
            System.out.println("1._ sacar el area de un circulo  \n");
            System.out.println("2._ sacar el area de un poligono \n");
            System.out.println("3._ sacar el area de un poligono irregular \n");
            System.out.println("4._ salir del menu \n");
             numero = xd.nextInt();
           
      switch(numero){

             case 1:

             System.out.println("ingrese el radio ");
              r = xd.nextDouble();

            System.out.println("el area de su circulo es :"+df.format(objetoRemoto.area_circulo(r))+"- peticion completa" +"\n");
            
            break;
            
            case 2:
            System.out.println("ingrese la cantidad de lados del poligono que quiere el area:");
            l = xd.nextDouble();
            System.out.println("ingrese la longitud de los lados del poligono");
             lo = xd.nextDouble();
             System.out.println("ingrese el apotema del poñigono");
             apo = xd.nextDouble();
             
            System.out.println("el area de su poligono es :"+df.format(objetoRemoto.area_poligono(l,lo,apo))+"- peticion completa"+"\n");
            break;

            case 3:
            System.out.println("le sere sincero la neta no se como sacar el area de un poligono irregular pero ahi le van unos numeros bien kul"
            +df.format(objetoRemoto.area_poligono_irregular(900000,6,7.00))+"---perdon:("+"\n");

            break;
             case 4:
                i=10;
             break;
      }

            
            Thread.sleep(500);
                               }
           
        }
     catch(Exception e){
         e.printStackTrace();
     }



    }
    public static void main(String[] args){
        new Cliente();
    }
    
}