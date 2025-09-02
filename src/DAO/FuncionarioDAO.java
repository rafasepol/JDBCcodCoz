package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Servelet.Conexao;

public class FuncionarioDAO {

    public void inserir(Integer id, Integer idEmpresa, Integer idFuncao, String nome,
                        String sobrenome, String cpf, Double salario, String dataAdmissao) {
        String sql = "INSERT INTO funcionario (id, id_empresa, id_funcao, nome, sobrenome, cpf, salario, data_admissao) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = Conexao.criarConexao();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, id);
            pstmt.setInt(2, idEmpresa);
            pstmt.setInt(3, idFuncao);
            pstmt.setString(4, nome);
            pstmt.setString(5, sobrenome);
            pstmt.setString(6, cpf);
            pstmt.setDouble(7, salario);
            pstmt.setString(8, dataAdmissao);

            pstmt.executeUpdate();
            pstmt.close();
            conn.close();

            System.out.println("Funcionario inserido com sucesso!");
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
