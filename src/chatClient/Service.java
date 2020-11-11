/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatClient;
import chatProtocol.Chat;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author David
 */
public class Service {
    
    private static Service theInstance;
    public static Service instance(){
        if (theInstance==null){ 
            theInstance=new Service();
        }
        return theInstance;
    }
    
    Data data;
    DataChats dataC;
    
    public Service() {
        try{
            if (data == null) {
                throw new Exception();
            }
            else if (dataC == null) {
                throw new Exception();
            }
        }
        catch(Exception e){
            data =  new Data();
            dataC = new DataChats();
        }
    }
    public List<String> getContactos(){
        return data.getContactos();
    }
    public List<Chat> getConversaciones(){
        return dataC.getConversaciones();
    }
    public void AgregarContacto(String id){
        if (busca(id)== null) {
            data.agregarContacto(id);
        }
        
    }
       public void store(){
        try{  XmlPersister.instance().store(data, data.id); }
        catch(Exception e){ 
            System.out.println("error");
        }
      }
       
          public void storeC(){
        try{  XmlPersister.instance().storeC(dataC, dataC.id); }
        catch(Exception e){ 
            System.out.println("error");
        }
      }
    public void load(String id)
    {
        try {
            data = XmlPersister.instance().load(id);
        } catch (Exception ex) {
            System.out.print("Este usuario no tiene contactos");
        }
    }
    
     public void loadC(String id)
    {
        try {
            dataC = XmlPersister.instance().loadC(id);
        } catch (Exception ex) {
            System.out.print("Este usuario no tiene chats");
        }
    }
    public List<String> search(String o){
        List<String> result = new ArrayList<>();
        for(String c:data.getContactos()) {if (c.contains(o)) result.add(c);};
        return result;
    }
    public String busca(String o){
        for(String c:data.getContactos()) {if (c.equals(o)) return o ;}
        return null;
    }
}
