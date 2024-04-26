package jdbc.exemplos.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Classes.Veiculo;

public class MainUpdate {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        
        String DATABASE_URL = "jdbc:derby://localhost:1527/bdEstacionamento";
        String usuario = "APP";
        String senha = "123";
        
        Connection connection = DriverManager.getConnection(DATABASE_URL, usuario, senha);
        
        String sql = "UPDATE VEICULO SET nome=?, tipo=? WHERE placa=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        
        Veiculo veiculo = new Veiculo("veiculo0", "Moto", "Carro3");
        
        ps.setString(1, veiculo.getNome());
        ps.setString(2, veiculo.getTipo());
        ps.setString(3, veiculo.getPlaca());
        ps.execute();
    }
}
