
package conectabd;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConectaBD {


    public static void main(String[] args) {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/usuario";
        
        try {
            Connection conexao = (Connection) DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexao estabelecida!");
            
            //Criar um objeto usuário e passar as informacoes necessarias ao objeto
            Usuario user1 = new Usuario("Henriques", "12345", "henrique@tudo.comprazer");
            
            String sql = "insert into cadastro(usuario, senha, email) values (?,?,?);";
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setString(1, user1.getNome());
            ps.setString(2, user1.getSenha());
            ps.setString(3, user1.getEmail());

            ps.execute();
            
        } catch (SQLException e) {
            System.out.println("Erro: "+e);
            System.out.println("Erro ao conectar");
        }
            
        
    }
}
