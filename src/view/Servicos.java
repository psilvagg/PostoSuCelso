package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;

public class Servicos extends javax.swing.JFrame {

    public Servicos() {
        initComponents();
        setIcon();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botAddFunc = new javax.swing.JButton();
        botRegisVenda = new javax.swing.JButton();
        botCadProd = new javax.swing.JButton();
        botConsulFunc = new javax.swing.JButton();
        botHisAbastecimento = new javax.swing.JButton();
        botConsulProd = new javax.swing.JButton();
        botRegisAbast = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bombaGasol_resized.png"))); // NOI18N
        jLabel1.setText("Posto SuCelso");

        botAddFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUsuarioIcon_resized.png"))); // NOI18N
        botAddFunc.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Adicionar Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 0, 12))); // NOI18N
        botAddFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAddFuncActionPerformed(evt);
            }
        });

        botRegisVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/terminal-pos_resized.png"))); // NOI18N
        botRegisVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Vender", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 0, 12))); // NOI18N
        botRegisVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegisVendaActionPerformed(evt);
            }
        });

        botCadProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar-item_resized.png"))); // NOI18N
        botCadProd.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Cadastrar Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 0, 12))); // NOI18N
        botCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCadProdActionPerformed(evt);
            }
        });

        botConsulFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verUsuarios_resized.png"))); // NOI18N
        botConsulFunc.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Quadro de Funcionários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 0, 12))); // NOI18N
        botConsulFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConsulFuncActionPerformed(evt);
            }
        });

        botHisAbastecimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/historia_resized.png"))); // NOI18N
        botHisAbastecimento.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Hist. de Abastecimentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 0, 12))); // NOI18N
        botHisAbastecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botHisAbastecimentoActionPerformed(evt);
            }
        });

        botConsulProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tabelaIcon_resized.png"))); // NOI18N
        botConsulProd.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 0, 12))); // NOI18N
        botConsulProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConsulProdActionPerformed(evt);
            }
        });

        botRegisAbast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gasolina_resized.png"))); // NOI18N
        botRegisAbast.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Registrar Abastecimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 0, 12))); // NOI18N
        botRegisAbast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegisAbastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botHisAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botRegisVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botConsulProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botCadProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botAddFunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botConsulFunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(botRegisAbast, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botRegisAbast)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botCadProd)
                    .addComponent(botAddFunc)
                    .addComponent(botRegisVenda))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botConsulProd)
                    .addComponent(botHisAbastecimento)
                    .addComponent(botConsulFunc))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botAddFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAddFuncActionPerformed
        telAddFunc taddfun = new telAddFunc();
        this.dispose();
        taddfun.setVisible(true);
    }//GEN-LAST:event_botAddFuncActionPerformed

    private void botRegisVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegisVendaActionPerformed
        
        regVenda rven = new regVenda();  
        rven.botVender.setVisible(false);
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PostoSuCelso", "root", "cimatec");

            String sql = "SELECT NomeProduto FROM Produtos";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();


            while (rs.next()) {
                String NomeProd = rs.getString("NomeProduto");
                rven.combNmProd.addItem(NomeProd);
            }
            
            sql = "SELECT NomeFunc FROM Funcionarios WHERE Cargo = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "Atendente");
            rs = pstm.executeQuery();


            while (rs.next()) {
                String NomeFunc = rs.getString("NomeFunc");
                rven.combNmFunc.addItem(NomeFunc);
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
        

       rven.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_botRegisVendaActionPerformed

    private void botCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCadProdActionPerformed
        AddProduto AdProd = new AddProduto();
        this.dispose();
        AdProd.setVisible(true);
    }//GEN-LAST:event_botCadProdActionPerformed

    private void botConsulFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConsulFuncActionPerformed
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ConsulFunc cf = new ConsulFunc();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PostoSuCelso", "root", "cimatec");

            String sql = "SELECT * FROM Funcionarios";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            DefaultTableModel model = (DefaultTableModel) cf.TabelaConsulFunc.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                String NomeFunc = rs.getString("NomeFunc");
                String cpf = rs.getString("cpf");
                String cargo = rs.getString("Cargo");
                model.addRow(new Object[]{NomeFunc, cpf, cargo});
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

        this.dispose();
        cf.setVisible(true);

    }//GEN-LAST:event_botConsulFuncActionPerformed

    private void botHisAbastecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botHisAbastecimentoActionPerformed
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        HistAbastecimento hp = new HistAbastecimento();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PostoSuCelso", "root", "cimatec");
            String sql = "SELECT Placa, Modelo, TipoComb, LitroAbastecimento FROM Veiculos";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            var model = (DefaultTableModel) hp.TbHistAbastecimento.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                String placa = rs.getString("Placa");
                String modelo = rs.getString("Modelo");
                String tipoComb = rs.getString("TipoComb");
                float litroAbastecimento = rs.getFloat("LitroAbastecimento");
                model.addRow(new Object[]{placa, modelo, tipoComb, litroAbastecimento});
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

        this.dispose();
        hp.setVisible(true);
    }//GEN-LAST:event_botHisAbastecimentoActionPerformed

    private void botConsulProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConsulProdActionPerformed
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ConsulProd cpr = new ConsulProd();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PostoSuCelso", "root", "cimatec");
            String sql = "SELECT NomeProduto, Preco, QtdEstoque FROM Produtos";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
 
            var model = (DefaultTableModel) cpr.tbConsulProd.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                String nomeProd = rs.getString("NomeProduto");
                float preco = rs.getFloat("Preco");
                int qtdEstq = rs.getInt("QtdEstoque");
                model.addRow(new Object[]{nomeProd, preco, qtdEstq});
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
        this.dispose();
        cpr.setVisible(true);
    }//GEN-LAST:event_botConsulProdActionPerformed

    private void botRegisAbastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegisAbastActionPerformed
       telRegAbast rabas = new telRegAbast();
       rabas.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_botRegisAbastActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAddFunc;
    private javax.swing.JButton botCadProd;
    private javax.swing.JButton botConsulFunc;
    private javax.swing.JButton botConsulProd;
    private javax.swing.JButton botHisAbastecimento;
    private javax.swing.JButton botRegisAbast;
    private javax.swing.JButton botRegisVenda;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bombaGasol.png")));
    }
}