package chatClient;

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
        String idReceptor = "jperez";
        ServiceProxy.instance().post(message, idEmisor, idReceptor);
        model.commit();
    }
    
    public void logout(){
        try {
            ServiceProxy.instance().logout(model.getCurrentUser());
        }
        catch (Exception ex) {}
        model.setCurrentUser(null);
        model.setMessages(new ArrayList<String>());
        model.commit();
    }
        
    public void deliver(String message){
        model.getMessages().add(message);
        model.commit();    
    }    
}
