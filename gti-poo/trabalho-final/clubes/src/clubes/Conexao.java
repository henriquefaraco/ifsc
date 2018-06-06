package clubes;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

    
    public static Connection conecta() throws SQLException {
    
        String url = "jdbc:mysql://localhost/";
        String bd = "exemplojava";
        String user = "root";
        String pass = "";
        Connection con = DriverManager.getConnection(url+bd, user, pass);
    
    return con;
    
    }

    
}
