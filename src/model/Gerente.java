package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf) {
        this.setNome(nome);
        this.setCargo("Gerente");
        this.setCpf(cpf);
    }

    public void cadGerente() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PostoSuCelso", "root", "Meupapai@022");
            String sql = "INSERT INTO Funcionarios ( NomeFunc, Cargo, cpf) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, this.getNome());
            pstmt.setString(2, this.getCargo());
            pstmt.setString(3, this.getCpf());

            int result = pstmt.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Gerente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar gerente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (pstmt != null) try {
                pstmt.close();
            } catch (SQLException ignore) {}
            if (conn != null) try {
                conn.close();
            } catch (SQLException ignore) {}
        }
    }
}
