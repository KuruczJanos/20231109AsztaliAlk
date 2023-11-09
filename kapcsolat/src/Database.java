import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Kapcsolat implements iDatabase {

    public Connection connectDb() {
        Connection conn = null;
        try {
            conn = tryConnect();
        } catch (SQLException e) {
            System.err.println("Hiba! A kapcsolat sikertelen");
            System.err.println(e.getMessage());
        }
        return conn;
    }
    public Connection tryConnect() throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/emp";
        Connection conn = null;
        String user = "emp";
        String password = "titok";


        conn = DriverManager.getConnection(, user, password);
        return conn;
    }
    public void close(){
        try {
            tryClose(conn);
        }catch(SQLException e){
        
        }
    };

    public void tryClose(Connection conn) throws SQLException{
        conn.close();
    };
}
