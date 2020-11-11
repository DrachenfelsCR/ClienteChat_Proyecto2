package chatClient;

import chatProtocol.Chat;
import chatProtocol.PaqueteDatos;
import chatProtocol.Protocol;
import chatProtocol.User;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Model extends java.util.Observable implements Runnable {
    User currentUser;
    List<Chat> messages;
    PaqueteDatos currentContact; 
    List<String> contactos;

    

    public Model() {
       currentContact=null;
        currentUser = null;
       messages=new ArrayList<>();
       contactos = new ArrayList<>();
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public List<Chat> getMessages() {
        return messages;
    }

    public void setMessages(List<Chat> messages) {
        this.messages = messages;
    }

    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        this.commit();
    }
    
    public void commit(){
        this.setChanged();
        this.notifyObservers();        
    } 
    public void setCurrentContact(PaqueteDatos currentContact) {
        this.currentContact = currentContact;
    }

    public PaqueteDatos getCurrentContact() {
        return currentContact;
    }

    public List<String> getContactos() {
        return contactos;
    }

    public void setContactos(List<String> contactos) {
        this.contactos = contactos;
    }

    @Override
    public void run() {
        try {
            ServerSocket serverCliente = new ServerSocket();
            Socket Cliente;
            PaqueteDatos paqueteRec;
            while(true)
            {
            Cliente=serverCliente.accept();
            ObjectInputStream flujoE = new ObjectInputStream(Cliente.getInputStream());
                try {
                    paqueteRec = (PaqueteDatos) flujoE.readObject();
                    for(Chat c: this.messages)
                    {
                        if (c.getIdEmisor().equals(paqueteRec.getIdEmisor()) && c.getIdReceptor().equals(paqueteRec.getIdReceptor())) {
                            c.getMensajes().add(paqueteRec.getMensaje());
                            break;
                        }
                    }
                } catch (ClassNotFoundException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
    }
    
    
    
    
}
