
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isado
 */
public interface Calculadora extends Remote {
    public float appFood(float a, float b) throws RemoteException;
    public float appTime(float lucro, float receita) throws RemoteException;
    public float appServices(float lucro, float receita) throws RemoteException;
    public float margemTotal(float app1, float app2, float app3) throws RemoteException;

}
