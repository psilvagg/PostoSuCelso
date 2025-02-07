package commit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Produto;

public class comProduto {
    public void CadProdutos(Produto prod) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/postosenai", "pedrogg", "Chicote1@");
            String sql = "INSERT INTO Produtos (NomeProduto, Preco, QtdEstoque) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, prod.getNome());
            pstmt.setFloat(2, prod.getPreco());
            pstmt.setInt(3, prod.getQuantidadeEmEstoque());

            int result = pstmt.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Produto registrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao registrar produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException | SQLException e) {
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
