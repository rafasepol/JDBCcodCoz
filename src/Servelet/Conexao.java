package Servelet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection criarConexao(){
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://pg-28ae1a12-germinare-23i.i.aivencloud.com:23003/inter", "avnadmin", "AVNS_Yy7b6_t9Fo0ThBzyaim");
            System.out.println("Realizaoção feita");
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }
        return conn;
    }
    public void desconectar(Connection conn){
        try {
            if(conn != null && !conn.isClosed()){
                conn.close();
            }
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }

    }
}
