/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatClient;
import chatProtocol.PaqueteDatos;
import chatProtocol.User;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author beto
 */
public class ChatTableModel extends AbstractTableModel implements TableModel {

   List<String> rows;
   String[] cols={"",""};
   Color[] paleta = {new Color(204,0,204),new Color(255,153,51),new Color(0,0,255),new Color(255,153,255)};
   int n = paleta.length;
    public ChatTableModel(List<String> rows) {
        this.rows = rows;
    }
   
    @Override
    public int getRowCount() {
       return rows.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }
   @Override
    public Class<?> getColumnClass(int col){
        switch(col){
            case 0: return Icon.class;
            default: return super.getColumnClass(col);
        }
    }

    @Override
    public Object getValueAt(int row, int col) {
        String u = rows.get(row);
        switch(col){
            case 0: return this.icon(u,row);  
            default: return "";
                
            
            
        }
    }
    
   private Icon icon(String u, int i){
       BufferedImage img = new BufferedImage(200,40,BufferedImage.TYPE_INT_ARGB);
       Graphics2D g = img.createGraphics();
       g.setColor(paleta[i%2]);
       g.fillOval(10, 5, 40, 40);
       g.setColor(Color.white);
       g.drawString(u.substring(0,1).toUpperCase(),25,25);
       g.setColor(Color.black);
       g.drawString(u,60,25);
       return new ImageIcon(img);
   }
    
    
}
