/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatClient;

/**
 *
 * @author David
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlPersister {
    private String path;
    private String pathContact = "";
    private static XmlPersister theInstance;
    public static XmlPersister instance(){
        if (theInstance==null){ 
            theInstance=new XmlPersister("PruebaDeChat.xml");
        }
        return theInstance;
    }
    
    public XmlPersister(String p) {
            path=p;         
    }  
    
    public Data load(String ee) throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);  
        FileInputStream is = new FileInputStream(ee + ".xml");
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();  
        Data result = (Data) unmarshaller.unmarshal(is);
        is.close();
        return result;        
    }
      
       public void store(Data d, String p)throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);  
        pathContact = p + ".xml";
        FileOutputStream os = new FileOutputStream(pathContact);
        Marshaller marshaller = jaxbContext.createMarshaller();  
        marshaller.marshal(d, os);
        os.flush();
        os.close();     
    }
       
       public void storeC(DataChats d, String p)throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(DataChats.class);  
        pathContact = p + "Chats.xml";
        FileOutputStream os = new FileOutputStream(pathContact);
        Marshaller marshaller = jaxbContext.createMarshaller();  
        marshaller.marshal(d, os);
        os.flush();
        os.close();     
    }
         public DataChats loadC(String ee) throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(DataChats.class);  
        FileInputStream is = new FileInputStream(ee);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();  
        DataChats result = (DataChats) unmarshaller.unmarshal(is);
        is.close();
        return result;        
    }
       
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}



