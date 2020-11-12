package chatClient;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Application {
//David Quesada Romero - Alberto Esquivel Gomez - Andres Salas Miranda
    public static void main(String[] args) {
         try {
        for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                System.out.println("CHOSEN THIS");
                break;
            } else {
                UIManager.setLookAndFeel  ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            }
        }
    } catch (Exception e) {
        System.out.println("Nimbus error");
    }
       Model model = new Model();
        View view= new View();
        Controller controller = new Controller(view,model);
        view.setVisible(true);
     }
}
