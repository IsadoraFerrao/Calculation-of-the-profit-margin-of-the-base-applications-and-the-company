
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isado
 */
public class CalculadoraImple extends UnicastRemoteObject implements Calculadora{
    private static final long serialVersionUID = 1L;
    protected CalculadoraImple() throws RemoteException{
        super();
    }
    public float appFood(float lucro, float receita) throws RemoteException{
        return (lucro/receita)*100;
    }
    public float appTime(float lucro, float receita) throws RemoteException{
        return (lucro/receita)*100;
    }
    public float appServices(float lucro, float receita) throws RemoteException{
        return (lucro/receita)*100;
    }
    public float margemTotal(float app1, float app2, float app3) throws RemoteException{
        return (app1+app2+app3)/3;
    }
}
