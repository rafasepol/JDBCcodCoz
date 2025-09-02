package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Servelet.Conexao;

public class ItemNotaFiscalDAO {

    public void inserir(Integer id, Integer idNotaFiscalXml, Integer idProduto, Double quantidade, Double precoUnitario) {
        String sql = "INSERT INTO item_nota_fiscal (id, id_nota_fiscal_xml, id_produto, quantidade, preco_unitario) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conn = Conexao.criarConexao();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, id);
            pstmt.setInt(2, idNotaFiscalXml);
            pstmt.setInt(3, idProduto);
            pstmt.setDouble(4, quantidade);
            pstmt.setDouble(5, precoUnitario);

            pstmt.executeUpdate();
            pstmt.close();
            conn.close();

            System.out.println("ItemNotaFiscal inserido com sucesso!");
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
