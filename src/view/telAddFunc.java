
package view;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import model.Atendente;
import model.Gerente;


public class telAddFunc extends javax.swing.JFrame {

    public telAddFunc() {
        initComponents();
        setIcon();
    }
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addUserTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputcpffunc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputNomeFunc = new javax.swing.JTextField();
        botSalvar = new javax.swing.JButton();
        botVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADICIONAR FUNCIONÁRIO");
        setResizable(false);

        addUserTitle.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        addUserTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUsuarioIcon_resized.png"))); // NOI18N
        addUserTitle.setText("Adicionar Funcionário");

        jLabel1.setText("CPF");

        jLabel2.setText("Nome");

        botSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/confirmarIcon.png"))); // NOI18N
        botSalvar.setText("Salvar");
        botSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSalvarActionPerformed(evt);
            }
        });

        botVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelarIcon.png"))); // NOI18N
        botVoltar.setText("Voltar");
        botVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputcpffunc, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(addUserTitle)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botVoltar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botSalvar))
                        .addComponent(inputNomeFunc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(addUserTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputcpffunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botVoltar)
                    .addComponent(botSalvar))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tel() {

        addUserTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputcpffunc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputNomeFunc = new javax.swing.JTextField();
        botSalvar = new javax.swing.JButton();
        botVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addUserTitle.setFont(new java.awt.Font("Agency FB", 1, 48));
        addUserTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUsuarioIcon.png")));
        addUserTitle.setText("Adicionar Usuário");

        jLabel1.setText("ID Funcionário");

        jLabel2.setText("Nome");

        botSalvar.setText("Salvar");
        botSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSalvarActionPerformed(evt);
            }
        });

        botVoltar.setText("Voltar");
        botVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(addUserTitle))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(botVoltar)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(botSalvar))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(inputcpffunc, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel1)
                                                                .addComponent(inputNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel2)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addUserTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputcpffunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botSalvar)
                                        .addComponent(botVoltar))
                                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }

    private void botSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSalvarActionPerformed

        if (inputcpffunc.getText().equals("") || inputNomeFunc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "ERRO", 0);
        } else {
            String cpfFunc = inputcpffunc.getText();
            String nomeFunc = inputNomeFunc.getText();

            Object[] options = {"Gerente", "Atendente", "Cancelar"};
            int opc = JOptionPane.showOptionDialog(null, "Qual o cargo deste funcionário?", "Cargo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            switch (opc) {
                case 0:
                    Gerente gere = new Gerente(nomeFunc, cpfFunc);
                    gere.cadGerente();
                    break;

                case 1:
                    Atendente atend = new Atendente(nomeFunc, cpfFunc);
                    atend.cadAtendente();
                    break;

                default:
                    break;
            }
        }
    }//GEN-LAST:event_botSalvarActionPerformed

    private void botVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botVoltarActionPerformed
        Servicos menu = new Servicos();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_botVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addUserTitle;
    private javax.swing.JButton botSalvar;
    private javax.swing.JButton botVoltar;
    private javax.swing.JTextField inputNomeFunc;
    private javax.swing.JTextField inputcpffunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bombaGasol.png")));
    }
}