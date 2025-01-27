/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class regVenda extends javax.swing.JFrame {

    int idProd;
    int idFunc;

    public regVenda() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combNmProd = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblQtdEstq = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputQtdSolicitada = new javax.swing.JTextField();
        botVoltar = new javax.swing.JButton();
        botVender = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        combNmFunc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAIXA");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/terminal-pos_resized.png"))); // NOI18N
        jLabel1.setText("Vender");

        jLabel2.setText("Produto");

        combNmProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um item..." }));
        combNmProd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combNmProdItemStateChanged(evt);
            }
        });

        jLabel3.setText("Preço:");

        lblPreco.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblPreco.setText("Selecione um item...");

        jLabel4.setText("Estoque:");

        lblQtdEstq.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblQtdEstq.setText("Selecione um item...");

        jLabel5.setText("Quantidade solicitada pelo cliente:");

        botVoltar.setText("Voltar");
        botVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVoltarActionPerformed(evt);
            }
        });

        botVender.setText("Vender");
        botVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVenderActionPerformed(evt);
            }
        });

        jLabel6.setText("Vendedor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combNmFunc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botVender))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputQtdSolicitada))
                    .addComponent(jLabel2)
                    .addComponent(combNmProd, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQtdEstq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combNmProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblQtdEstq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputQtdSolicitada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(combNmFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botVender)
                    .addComponent(botVoltar))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void combNmProdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combNmProdItemStateChanged
        String itemSelectedComb = (String) combNmProd.getSelectedItem();
        if (itemSelectedComb.equals("Selecione um item...")) {
            lblPreco.setText("Selecione um produto...");
            lblQtdEstq.setText("Selecione um produto...");
            inputQtdSolicitada.setText("");
            botVender.setVisible(false);
        } else {
            botVender.setVisible(true);
            Connection conn = null;
            PreparedStatement pstm = null;
            ResultSet rs = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PostoSuCelso", "root", "Meupapai@022");

                String sql = "SELECT Preco, QtdEstoque FROM Produtos WHERE NomeProduto = ?";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, (String) combNmProd.getSelectedItem());
                rs = pstm.executeQuery();

                while (rs.next()) {
                    float precoProd = rs.getFloat("Preco");
                    int qtdEst = rs.getInt("QtdEstoque");
                    lblPreco.setText("R$" + String.valueOf(precoProd));
                    lblQtdEstq.setText(String.valueOf(qtdEst));
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro de Classe: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } finally {
                if (rs != null) try {
                    rs.close();
                } catch (SQLException ignore) {
                }
                if (pstm != null) try {
                    pstm.close();
                } catch (SQLException ignore) {
                }
                if (conn != null) try {
                    conn.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }//GEN-LAST:event_combNmProdItemStateChanged

    private void botVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botVoltarActionPerformed
        Servicos serv = new Servicos();
        serv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botVoltarActionPerformed

    private void botVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botVenderActionPerformed

        if (inputQtdSolicitada.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "Nenhum item vendido");
        } else {
            Connection conn = null;
            PreparedStatement pstm = null;
            ResultSet rs = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PostoSuCelso", "root", "Meupapai@022");

                String sql = "SELECT IDProduto FROM Produtos WHERE NomeProduto = ?";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, (String) combNmProd.getSelectedItem());
                rs = pstm.executeQuery();

                while (rs.next()) {
                    idProd = rs.getInt("IDProduto");
                }

                sql = "SELECT IDFunc FROM Funcionarios WHERE NomeFunc = ?";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, (String) combNmFunc.getSelectedItem());
                rs = pstm.executeQuery();

                while (rs.next()) {
                    idFunc = rs.getInt("IDFunc");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro de Classe: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } finally {
                if (rs != null) try {
                    rs.close();
                } catch (SQLException ignore) {
                }
                if (pstm != null) try {
                    pstm.close();
                } catch (SQLException ignore) {
                }
                if (conn != null) try {
                    conn.close();
                } catch (SQLException ignore) {
                }
            }

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PostoSuCelso", "root", "Meupapai@022");
                String sql = "INSERT INTO Venda (DataVenda, HoraVenda, IDFunc_Fk, IDProduto_Fk, QtdVendida) VALUES (CURDATE(), CURTIME(), ?, ?, ?)";
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1, idFunc);
                pstm.setInt(2, idProd);
                pstm.setInt(3, Integer.parseInt(inputQtdSolicitada.getText()));

                int result = pstm.executeUpdate();

                sql = "SELECT Preco, QtdEstoque FROM Produtos WHERE NomeProduto = ?";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, (String) combNmProd.getSelectedItem());
                rs = pstm.executeQuery();

                while (rs.next()) {
                    float precoProd = rs.getFloat("Preco");
                    int qtdEst = rs.getInt("QtdEstoque");
                    lblPreco.setText("R$" + String.valueOf(precoProd));
                    lblQtdEstq.setText(String.valueOf(qtdEst));
                }
                
                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Produto vendido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao vender produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            } catch (ClassNotFoundException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } finally {
                if (pstm != null) try {
                    pstm.close();
                } catch (SQLException ignore) {
                }
                if (conn != null) try {
                    conn.close();
                } catch (SQLException ignore) {
                }
            }
        }
        
    }//GEN-LAST:event_botVenderActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botVender;
    private javax.swing.JButton botVoltar;
    public javax.swing.JComboBox<String> combNmFunc;
    public javax.swing.JComboBox<String> combNmProd;
    private javax.swing.JTextField inputQtdSolicitada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQtdEstq;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bombaGasol.png")));
    }
}
