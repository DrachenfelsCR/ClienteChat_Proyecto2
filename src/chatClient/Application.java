package chatClient;

public class Application {
//David Quesada Romero - Alberto Esquivel Gomez - Andres Salas Miranda
    public static void main(String[] args) {
       Model model = new Model();
        View view= new View();
        Controller controller = new Controller(view,model);
        view.setVisible(true);
     }
}
