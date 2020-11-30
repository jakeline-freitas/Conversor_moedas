/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordemoedas;

import javax.xml.ws.Endpoint;
/**
 *
 * @author Jake Freitas
 */
public class PublishConversor {
    public static void main(String[] args) {
        ConversordeMOedas c = new ConversordeMOedas();
        Endpoint.publish("http://localhost:8000/conversormoedas", c);
        System.out.println("Server started");
    }
    
}
