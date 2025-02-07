package commit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Veiculo;

public class abastecimentos{

    public void cadAbastecimento(Veiculo veic) {
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/postosenai", "pedrogg", "Chicote1@");
            String sql = "INSERT INTO Veiculos (Placa, Modelo, TipoComb, LitroAbastecimento) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, veic.getPlaca());
            pstmt.setString(2, veic.getModelo());
            pstmt.setString(3, veic.getTipoCombustivel());
            pstmt.setFloat(4, veic.getLitrosAbastecidos());

            int result = pstmt.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Abastecimento registrado com sucesso!", "Sucesso", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao registrar abastecimento!", "ERRO", 0);
            }
        } catch (ClassNotFoundException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO", 0);
        } finally {
            if (pstmt != null) try {
                pstmt.close();
            } catch (SQLException ignore) {
            }
            if (conn != null) try {
                conn.close();
            } catch (SQLException ignore) {
            }
        }
    }

   
}
