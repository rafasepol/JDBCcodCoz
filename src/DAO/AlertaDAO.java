package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Servelet.Conexao;

public class AlertaDAO {

    public void inserir(Integer id, Integer idProduto, String tipoAlerta, String dataCriacao, String status) {
        String sql = "INSERT INTO alerta (id, id_produto, tipo_alerta, data_criacao, status) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conn = Conexao.criarConexao();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, id);
            pstmt.setInt(2, idProduto);
            pstmt.setString(3, tipoAlerta);
            pstmt.setString(4, dataCriacao);
            pstmt.setString(5, status);

            pstmt.executeUpdate();
            pstmt.close();
            conn.close();

            System.out.println("Alerta inserido com sucesso!");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    public void alterar(int id, double estoqueMinimo){
        Conexao conexao = new Conexao();
        Connection conn = conexao.criarConexao();
        try {
            PreparedStatement pstmt = conn.prepareStatement("UPDATE DEPT SER DNAME = ? WHERE DEPTNO = ?");
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }
    public void remover(int id){
        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.criarConexao();
            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM DEPT WHERE DEPTNO = ?");

            pstmt.setInt(1,id);
            pstmt.execute();
            conexao.desconectar(conn);
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }
}
