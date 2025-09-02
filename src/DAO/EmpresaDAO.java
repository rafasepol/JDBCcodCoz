package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Servelet.Conexao;

public class EmpresaDAO {

    public void inserir(Integer id, Integer idEndereco, String nome, String cnpj) {
        String sql = "INSERT INTO empresa (id, id_endereco, nome, cnpj) VALUES (?, ?, ?, ?)";

        try {
            Connection conn = Conexao.criarConexao();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, id);
            pstmt.setInt(2, idEndereco);
            pstmt.setString(3, nome);
            pstmt.setString(4, cnpj);

            pstmt.executeUpdate();
            pstmt.close();
            conn.close();

            System.out.println("Empresa inserida com sucesso!");
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
