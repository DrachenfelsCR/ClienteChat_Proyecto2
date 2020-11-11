package chatClient;

import chatProtocol.Chat;
import chatProtocol.PaqueteDatos;
import chatProtocol.User;
import java.util.ArrayList;

public class Controller {
    View view;
    Model model;
    
    ServiceProxy localService;
    
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        localService = (ServiceProxy)ServiceProxy.instance();
        localService.setController(this);
        model.setContactos(chatClient.Service.instance().getContactos());
        view.setController(this);
        view.setModel(model);
    }

    public void login() throws Exception{
        User u = new User(view.id.getText(),new String(view.clave.getPassword()),"");
        User logged=ServiceProxy.instance().login(u);
        model.setCurrentUser(logged);
        model.commit();
    }
    public void post(){
        String message=view.mensaje.getText();  
        String idEmisor = this.model.currentUser.getId();
        String idReceptor = this.model.currentContact.getIdReceptor();
        PaqueteDatos paqueteEnvio = new PaqueteDatos(message,idEmisor,idReceptor);
        ServiceProxy.instance().post(paqueteEnvio, idEmisor, idReceptor);
        model.commit();
    }
    
    public void logout(){
        try {
            ServiceProxy.instance().logout(model.getCurrentUser());
            Service.instance().data.getContactos().clear();
        }
        catch (Exception ex) {}
        model.setCurrentUser(null);
        model.setMessages(new ArrayList<Chat>());
        model.commit();
    }
        
    public void deliver(PaqueteDatos message){
        for (Chat c: model.getMessages()) {
            if (c.getIdReceptor().equals(message.getIdReceptor()) && c.getIdEmisor().equals(message.getIdEmisor())) {
                c.getMensajes().add(message.getMensaje());
            }
        }
        model.commit();    
    }
    public void AgregarContacto(String id){
       chatClient.Service.instance().AgregarContacto(id);
       model.setContactos( chatClient.Service.instance().getContactos());
       model.commit();
       
    }
    public void buscar(String c){
      model.setContactos(Service.instance().search(c));
       model.commit();
       
   }
}
