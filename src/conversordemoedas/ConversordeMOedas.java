/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordemoedas;
import javax.jws.WebService;
import javax.jws.WebMethod;
/**
 *
 * @author Jake Freitas
 */
@WebService
public class ConversordeMOedas {

    /**
     * @param args the command line arguments
     */
    @WebMethod
    public double realToDolar(double valorReal){
        double dolar = 5.30;
        return valorReal/dolar;
    }
    @WebMethod
    public double dolarToReal(double valorDolar){
        double real = 0.19;
        return valorDolar/real;
    }
    @WebMethod
    public double realToEuro(double valorReal){
        double euro = 0.16;
         return valorReal*euro;
    }
    @WebMethod
    public double euriToReal(double valorEuro){
        double real = 0.16;
        return valorEuro/real;
    }
    
}
