/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariketa6;

import Classes.Persons;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author bortu
 */
public class AddForm extends JDialog {
    
    MainForm parent;
    Persons current;
    

    /**
     * Creates new form AddForm
     */
    
    public AddForm() {
        initComponents();
    }
    
    public AddForm(JFrame owner) {
        super(owner);
        parent = (MainForm)this.getOwner();
        initComponents();
        
    }
    
    public AddForm(JFrame owner, Persons person) {
        super(owner,true);
        parent = (MainForm)this.getOwner();
        
        Persons persona = (Persons) person;
        this.current = person;

        initComponents();
        
        this.IDText.setText(Integer.toString(persona.getId()));
        this.NameText.setText(persona.getName());
        this.eMailText.setText(persona.getEmail());
        this.PassText.setText(persona.getPasswd());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IDLabel = new javax.swing.JLabel();
        IDText = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        eMailLabel = new javax.swing.JLabel();
        eMailText = new javax.swing.JTextField();
        PassLabel = new javax.swing.JLabel();
        PassText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        IDErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        IDLabel.setText("ID");
        jPanel1.add(IDLabel);

        IDText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDTextKeyReleased(evt);
            }
        });
        jPanel1.add(IDText);

        NameLabel.setText("Name");
        jPanel1.add(NameLabel);

        NameText.setMaximumSize(new java.awt.Dimension(10, 50));
        jPanel1.add(NameText);

        eMailLabel.setText("eMail");
        jPanel1.add(eMailLabel);
        jPanel1.add(eMailText);

        PassLabel.setText("Password");
        jPanel1.add(PassLabel);
        jPanel1.add(PassText);

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ExitButton);

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ClearButton);

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SaveButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(IDErrorLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(IDErrorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        
        if(IDText.getText().length()<2){
            JOptionPane.showMessageDialog(this, "ID-ak gutxienez bi zenbaki izan behar ditu");
        }
        /*else if(IDText.getText().contains("[a-z]+")){
            JOptionPane.showMessageDialog(this, "ID-a numerikoa izan behar da");
        }*/
        else if(NameText.getText().length() < 2){
            JOptionPane.showMessageDialog(this, "Izenak gutxienez 2 letra izan behar ditu");
        }
        else if(eMailText.getText().length() < 6){
            JOptionPane.showMessageDialog(this, "eMailak gutxienez 6 letra izan behar ditu");
        }
        else if(PassText.getText().length() < 6){
            JOptionPane.showMessageDialog(this, "Pasahitzak gutxienez 6 karaktere izan behar ditu");
        }
        else{
            
            int id = Integer.parseInt(IDText.getText());
            String name = NameText.getText();
            String eMail = eMailText.getText();
            String passwd = PassText.getText();
            
            if(current != null){
                current.setId(id);
                current.setName(name);
                current.setEmail(eMail);
                current.setPasswd(passwd);
            }
            else{

                Persons persona = new Persons();
                persona.setId(id);
                persona.setName(name);
                persona.setEmail(eMail);
                persona.setPasswd(passwd);
                parent.addPersona(persona);
                
            }
            
            this.dispose();
            parent.setVisible(true);
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        parent.setVisible(true);
        
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        
        IDText.setText("");
        NameText.setText("");
        eMailText.setText("");
        PassText.setText("");
       
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void IDTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDTextKeyReleased
        
        if(IDText.getText().length()<2){
            this.IDErrorLabel.setText("ID-ak karaktere gehiago behar ditu");
        }
        else{
            this.IDErrorLabel.setText("");
        }
    }//GEN-LAST:event_IDTextKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel IDErrorLabel;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDText;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameText;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JTextField PassText;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel eMailLabel;
    private javax.swing.JTextField eMailText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
