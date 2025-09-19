/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imagens;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author anabe
 */
public class ConnectionFactory {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdvendas","usuarioteste", "123");
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }
    
    
}
