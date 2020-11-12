package chatClient;

import chatProtocol.Chat;
import chatProtocol.PaqueteDatos;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.Icon;


public class View extends javax.swing.JFrame implements java.util.Observer {

    /**
     * Creates new form PersonaView
     */
    public View() {
        initComponents();
        getRootPane().setDefaultButton(post);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexoFld = new javax.swing.ButtonGroup();
        bodyPanel = new javax.swing.JPanel();
        mensaje = new javax.swing.JTextField();
        post = new javax.swing.JButton();
        messages = new java.awt.TextArea();
        logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Contactos = new javax.swing.JTable();
        CurrentContact = new javax.swing.JLabel();
        jLabel_contactoClickeado = new javax.swing.JLabel();
        jLabel_conexionEstado = new javax.swing.JLabel();
        TextoContacto = new javax.swing.JTextField();
        BuscarBoton = new javax.swing.JButton();
        TextoAgregarContacto = new javax.swing.JTextField();
        AgregarContacto = new javax.swing.JButton();
        jLabel_pendiente = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        clave = new javax.swing.JPasswordField();
        finish = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CHAT");

        bodyPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        post.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        post.setText("Enviar");
        post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        Contactos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Contactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Contactos.setAlignmentX(10.0F);
        Contactos.setRowHeight(60);
        Contactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Contactos);

        CurrentContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel_contactoClickeado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel_conexionEstado.setText("Conexion");

        TextoContacto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        BuscarBoton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BuscarBoton.setText("Buscar");
        BuscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBotonActionPerformed(evt);
            }
        });

        TextoAgregarContacto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        AgregarContacto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AgregarContacto.setText("Contacto+");
        AgregarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarContactoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bodyPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(bodyPanelLayout.createSequentialGroup()
                            .addComponent(TextoAgregarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(AgregarContacto)
                            .addGap(46, 46, 46))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(TextoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(BuscarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_pendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(post)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messages, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addComponent(CurrentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_contactoClickeado, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(jLabel_conexionEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(logout)))
                        .addContainerGap())))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel_contactoClickeado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_conexionEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(logout))
                            .addComponent(CurrentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(messages, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(post)))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_pendiente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoAgregarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        loginPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Usuario");

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Clave");

        login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        finish.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        finish.setText("Terminar");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finish)
                .addGap(138, 138, 138))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(finish))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postActionPerformed
        try{
            controller.post();
        }
        catch(Exception ex){
            
        }
    }//GEN-LAST:event_postActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        id.setBackground(Color.white);
        clave.setBackground(Color.white);       
        try {
            controller.login();
            id.setText("");
            clave.setText("");
        } catch (Exception ex) {
            id.setBackground(Color.orange);
            clave.setBackground(Color.orange);
        }
         model.setMessages(Service.instance().getConversaciones());
    }//GEN-LAST:event_loginActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Service.instance().dataC.setConversaciones(model.getMessages());
        Service.instance().store();
        Service.instance().storeC();
        controller.logout();      
    }//GEN-LAST:event_logoutActionPerformed

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        System.exit(0);
    }//GEN-LAST:event_finishActionPerformed

    private void ContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactosMouseClicked
        // TODO add your handling code here:
        int current;
        current= Contactos.getSelectedRow();
        Icon contacto = (Icon) Contactos.getValueAt(current,0);
        String faker = (String) Contactos.getValueAt(current,1);
        CurrentContact.setIcon(contacto);
        PaqueteDatos currentCon= new PaqueteDatos();
        currentCon.setIdReceptor(faker);
        model.setCurrentContact(currentCon);
         this.jLabel_contactoClickeado.setText(faker);
         String msg="";
         this.jLabel_pendiente.setText("");
         Chat auxiliar = null;
        for( Chat c: model.getMessages()){
            if (c.getIdEmisor().equals(model.currentUser.getId()) && c.getIdReceptor().equals(faker)) {
                for (String m: c.getMensajes()) {
                     msg+=(m +"\n");
                }
                auxiliar = c;
                break;               
            }               
            }
        if (auxiliar == null) {
           model.getMessages().add(new Chat(new ArrayList<String>(),model.currentUser.getId(),faker));
        }
            this.messages.setText(msg);
            currentCon.setMensaje(msg);
    }//GEN-LAST:event_ContactosMouseClicked

    private void AgregarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarContactoActionPerformed
         if( TextoAgregarContacto.getText().isEmpty()) return;
         controller.AgregarContacto(TextoAgregarContacto.getText());
          TextoAgregarContacto.setText("");
    }//GEN-LAST:event_AgregarContactoActionPerformed

    private void BuscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBotonActionPerformed
        
        controller.buscar(TextoContacto.getText());
        TextoContacto.setText("");
    }//GEN-LAST:event_BuscarBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarContacto;
    private javax.swing.JButton BuscarBoton;
    private javax.swing.JTable Contactos;
    private javax.swing.JLabel CurrentContact;
    private javax.swing.JTextField TextoAgregarContacto;
    private javax.swing.JTextField TextoContacto;
    private javax.swing.JPanel bodyPanel;
    public javax.swing.JPasswordField clave;
    private javax.swing.JButton finish;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_conexionEstado;
    private javax.swing.JLabel jLabel_contactoClickeado;
    private javax.swing.JLabel jLabel_pendiente;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton login;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton logout;
    public javax.swing.JTextField mensaje;
    private java.awt.TextArea messages;
    public javax.swing.JButton post;
    private javax.swing.ButtonGroup sexoFld;
    // End of variables declaration//GEN-END:variables
    Controller controller;
    Model model;
    
    
    public void setController(Controller controller){
        this.controller=controller;
    }
    public void setModel(Model model){
        this.model=model;
         model.addObserver(this);
    }
    
    /**
     *
     * @param updatedModel
     * @param parametros
     */
    @Override
   public void update(java.util.Observable updatedModel,Object parametros){
     
       
       if(model.getCurrentUser()==null){
           loginPanel.setVisible(true);
           bodyPanel.setVisible(false);
           
       }
       else{
           
           loginPanel.setVisible(false);
           bodyPanel.setVisible(true);           
            this.setTitle(model.getCurrentUser().getId());
            String msg="";
            try
            {    
                for( Chat c: model.getMessages()){
                if (model.currentContact.getIdReceptor().equals(c.getIdReceptor()) && model.currentUser.getId().equals(c.getIdEmisor())) 
                {
                    for (String m: c.getMensajes()) {
                          if (m.equals("Offline")) {
                              msg = "Offline";   
                              c.getMensajes().remove(msg);
                            break;
                            }
                          else 
                          {
                          msg+=(m +"\n");
                          }
                        }
                    }
                if (msg.equals("Offline")) {
                            break;
                }
                       
                }
            }
            catch(Exception e)
            {
            System.out.println("Mensaje recibido");
            this.jLabel_pendiente.setText("(!) Msj recibido");
            }
            if (msg.equals("Offline")) {
               this.jLabel_conexionEstado.setText(msg);
               
           }
            else
            {
            this.jLabel_conexionEstado.setText("Online");
            this.messages.setText(msg);
            this.mensaje.setText("");
            this.mensaje.requestFocus();
            }
       }
       
        this.validate();
        Contactos.setModel(new ChatTableModel(model.getContactos()));
        
    } 
   
}
