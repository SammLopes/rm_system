package Conexao;

import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pompe
 */
public class ModuloConexao {

    public static Connection conector() {
        java.sql.Connection conexao;
        
        String driver = "com.mysql.cj.jdbc.Driver";
        //armazena informações
        String url = "jdbc:mysql://localhost:3306/banquinho";
        String usuario = "root";
        String senha = "rm123";
        //estabelecer conexão
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("PAssou !!!");
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
}
