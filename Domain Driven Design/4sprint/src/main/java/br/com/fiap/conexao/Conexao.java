package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Conexao {

    public static Connection abrirConexao() {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";

            conn = DriverManager.getConnection(url, Dados.USER, Dados.PASSWORD);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    public static void fecharConexao(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
