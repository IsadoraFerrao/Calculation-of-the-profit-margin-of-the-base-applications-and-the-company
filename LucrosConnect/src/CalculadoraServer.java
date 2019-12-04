
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isado
 */
public class CalculadoraServer { 
    CalculadoraServer(){
        try{
            System.setProperty("java.rmi.server.hostname", "192.168.137.59");
            LocateRegistry.createRegistry(1099);
            Calculadora lucroAppFood = new CalculadoraImple();
            Naming.bind("CalculadoraService", (Remote) lucroAppFood);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new CalculadoraServer();
    }
}
