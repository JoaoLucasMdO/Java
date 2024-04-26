package Model.VeiculoDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Classes.Veiculo;
import Model.Estacionamento.MetricaCalculoEnum;
import Model.Estacionamento.TipoVeiculoEnum;

public class VeiculoDAO {
    
    private Connection connection;
      
    public VeiculoDAO() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String DATABASE_URL = "jdbc:derby://localhost:1527/bdEstacionamento";
            String usuario = "APP";
            String senha = "123";
            this.connection = DriverManager.getConnection(DATABASE_URL, usuario, senha);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Veiculo> listar() {
        String sql = "SELECT * FROM Veiculo";
        List<Veiculo> retorno = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setNome(resultado.getString("nome"));
                veiculo.setPlaca(resultado.getString("placa"));
                veiculo.setTipo(TipoVeiculoEnum.valueOf(resultado.getString("tipo")));
                retorno.add(veiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public boolean inserir(Veiculo veiculo) {
        String sql = "INSERT INTO Veiculo(placa, nome, tipo) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, veiculo.getPlaca());
            stmt.setString(2, veiculo.getNome());
            stmt.setString(3, veiculo.getTipo().toString());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean alterar(Veiculo veiculo) {
        String sql = "UPDATE Veiculo SET nome=?, tipo=? WHERE placa=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, veiculo.getNome());
            stmt.setString(2, veiculo.getTipo().toString());
            stmt.setString(3, veiculo.getPlaca());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean remover(String placa) {
        String sql = "DELETE FROM Veiculo WHERE placa=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, placa);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
