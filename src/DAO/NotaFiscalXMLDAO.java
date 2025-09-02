package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Servelet.Conexao;

public class NotaFiscalXMLDAO {

    public void inserir(Integer id, Integer idEmpresa, String numeroNota, String dataEmissao, String arquivoXml) {
        String sql = "INSERT INTO nota_fiscal_xml (id, id_empresa, numero_nota, data_emissao, arquivo_xml) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conn = Conexao.criarConexao();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, id);
            pstmt.setInt(2, idEmpresa);
            pstmt.setString(3, numeroNota);
            pstmt.setString(4, dataEmissao);
            pstmt.setString(5, arquivoXml);

            pstmt.executeUpdate();
            pstmt.close();
            conn.close();

            System.out.println("NotaFiscalXML inserida com sucesso!");
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
