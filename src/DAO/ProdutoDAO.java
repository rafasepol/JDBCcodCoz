package DAO;

import java.sql.*;
import Servelet.Conexao;

public class ProdutoDAO {
    public void inserir(Integer id, Integer idUnidadeMedida, String nome, Double preco, Double estoqueMinimo) {
        String sql = "INSERT INTO Produto (id, id_unidade_medida, nome, preco, estoque_minimo) VALUES (?, ?, ?, ?, ?)";
        Connection conn = Conexao.criarConexao();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, id);
            pstmt.setInt(2, idUnidadeMedida);
            pstmt.setString(3, nome);
            pstmt.setDouble(4, preco);
            pstmt.setDouble(5, estoqueMinimo);

            pstmt.executeUpdate(); // melhor que execute() em INSERT
            pstmt.close();
            conn.close();

            System.out.println("Produto inserido com sucesso!");
        } catch (SQLException sqle) {
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
