
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isado
 */
public class CalculadoraClient {
    public static void main(String[]args) throws NotBoundException, MalformedURLException{
        try{
            Calculadora lucroAppFood = (Calculadora) Naming.lookup("rmi://192.168.137.59:1099/CalculadoraService");
            System.out.println("Lucro app food :" +lucroAppFood.appFood(5000, 8000));
            System.out.println("Lucro app Time :" +lucroAppFood.appFood(4000, 6000));
            System.out.println("Lucro app Services :" +lucroAppFood.appFood(2000, 3000));
            System.out.println("Lucro geral da Connect:" +lucroAppFood.margemTotal(63, 67, 67));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
