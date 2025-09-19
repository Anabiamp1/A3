/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.dao;

import br.com.projeto.model.ItemVenda;
import br.com.projeto.model.Produtos;
import imagens.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author anabe
 */
public class ItemVendaDAO {
          private Connection con;

    public ItemVendaDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    
    //Método que cadastra Itens
    public void cadastraItem(ItemVenda obj){
        
               try {
            String sql = "insert into tb_itensvendas(venda_id,produto_id,qtd,subtotal) values (?,?,?,?)";

            //conectar banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
         

            stmt.setInt(1, obj.getVenda().getId());
            stmt.setInt(2, obj.getProduto().getId());
            stmt.setInt(3, obj.getQtd());
            stmt.setDouble(4, obj.getSubtotal());

            stmt.execute();
            stmt.close();


         

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);

        }
    }
    
    //Método que lista itens de venda por id
    public List<ItemVenda>listaItensPorVenda(int venda_id){

        List<ItemVenda> lista = new ArrayList<>();
//        select p.descricao, i.qtd, p.preco, i.subtotal from tb_itensvendas as i
//inner join tb_produtos as p on(i.produto_id = p.id) where i.venda_id =10; 
        try {
            String query = "select p.descricao, i.qtd, p.preco, i.subtotal from tb_itensvendas as i "
                                 + " inner join tb_produtos as p on(i.produto_id = p.id) where i.venda_id = ? ";
       
            PreparedStatement ps = con.prepareStatement(query);         
            ps.setInt(1, venda_id);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                ItemVenda item = new ItemVenda();
                Produtos prod = new Produtos();
                
                 prod.setDescricao(rs.getString("p.descricao"));
                 item.setQtd(rs.getInt("i.qtd"));
                 prod.setPreco(rs.getDouble("p.preco"));
                 item.setSubtotal(rs.getDouble("i.subtotal"));
                
                 item.setProduto(prod);         
              
                
                lista.add(item);
            }
            return lista;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    
    }}
