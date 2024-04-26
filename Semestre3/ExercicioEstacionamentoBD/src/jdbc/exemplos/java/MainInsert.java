package jdbc.exemplos.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Classes.Veiculo;

public class MainInsert {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        
        String DATABASE_URL = "jdbc:derby://localhost:1527/bdEstacionamento";
        String usuario = "APP";
        String senha = "123";
        
        Connection connection = DriverManager.getConnection(DATABASE_URL, usuario, senha);
        
        String sql = "INSERT INTO VEICULO (placa, nome, tipo) VALUES (?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        
        Veiculo veiculo = new Veiculo("ADC1234", "Carro5", "Moto");
        
        ps.setString(1, veiculo.getPlaca());
        ps.setString(2, veiculo.getNome());
        ps.setString(3, veiculo.getTipo());
        ps.execute();
    }
}
