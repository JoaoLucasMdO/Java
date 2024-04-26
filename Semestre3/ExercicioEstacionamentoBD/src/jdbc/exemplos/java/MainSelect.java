package jdbc.exemplos.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Classes.Veiculo;

public class MainSelect {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        
        String DATABASE_URL = "jdbc:derby://localhost:1527/bdEstacionamento";
        String usuario = "APP";
        String senha = "123";
        
        Connection connection = DriverManager.getConnection(DATABASE_URL, usuario, senha);
        
        String sql = "SELECT * FROM VEICULO";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            Veiculo veiculo = new Veiculo();
            veiculo.setNome(rs.getString("nome"));
            veiculo.setPlaca(rs.getString("placa"));
            veiculo.setTipo(rs.getString("tipo"));
            System.out.println(veiculo);
        }
    }
}
