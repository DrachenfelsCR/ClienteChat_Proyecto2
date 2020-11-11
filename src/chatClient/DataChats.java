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
public class DataChats {
    @XmlID 
    String id;
    private List<Chat> conversaciones;

    public DataChats() {
        conversaciones = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Chat> getConversaciones() {
        return conversaciones;
    }

    public void setConversaciones(List<Chat> conversaciones) {
        this.conversaciones = conversaciones;
    }
    
}