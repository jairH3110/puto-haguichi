package A2;

import java.rmi.*;



public interface InterfaceRemota extends Remote{

    

    public double area_circulo(double r) throws RemoteException;
    public double area_poligono(double capital, double interes, double plazo) throws RemoteException;
    public double area_poligono_irregular(double capital, double interes, double plazo) throws RemoteException;


}
