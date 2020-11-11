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
import chatProtocol.Chat;
import chatProtocol.PaqueteDatos;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {
    @XmlID 
    String id;
    private List<String> contactos;    
  //  private List<Chat> conversaciones;

    public Data() {
        contactos = new ArrayList<>();
     //   conversaciones = new ArrayList<>();
    }
    
    public List<String> getContactos() {
        return contactos;
    }

    public void setContactos(List<String> contactos) {
        this.contactos = contactos;
    }
    public void agregarContacto(String id){
        contactos.add(id);
    }

    /*public List<Chat> getConversaciones() {
        return conversaciones;
    }

    public void setConversaciones(List<Chat> conversaciones) {
        this.conversaciones = conversaciones;
    }*/
    
}