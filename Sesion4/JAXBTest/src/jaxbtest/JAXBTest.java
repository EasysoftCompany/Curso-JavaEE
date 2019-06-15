package jaxbtest;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author g_ric
 */
public class JAXBTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user = new User(1, "Gerardo");
        Product product = new Product(1, "Laptop", user);
        

        
        try {
            JAXBContext context = JAXBContext.newInstance(Product.class);
            /*
                Marshaller = Java to XML
                Unmarshaller = XML to Java
            */
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);   //Usado para que la salida tenga formato       
            m.marshal(product, new File("Prod.xml")); //
            m.marshal(product, System.out);
            
        } catch (JAXBException ex) {
            Logger.getLogger(JAXBTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
