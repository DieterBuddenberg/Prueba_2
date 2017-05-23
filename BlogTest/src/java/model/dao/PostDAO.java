/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.Post;
import util.Conexion;

public class PostDAO {

    Conexion con;

    public PostDAO() {
        con = new Conexion();
    }
   
    //  public void ingresar(Post p) {
    public void ingresar(Post p) {
        String sql = "INSERT INTO `mydb`.`Post`" +
                     "(`id`,`usuario_id`,`titulo`,`cuerpo`,`postestado_id`) " +
                     "VALUES ('" + p.getId() + "','" + p.getUsuario_id() + "','"+ p.getTitulo() + "','"+ p.getCuerpo() + "','"+ p.getPostestado_id() + "');";
        con.update(sql);
    }
          
    public void modificar(Post p, int id) {
        String sql = "update Post SET "
                   + "nombres = '" + p.getTitulo() + "',"
<<<<<<< HEAD
                   + "apellidos ='" + p.getCuerpo()+ "' "
                   + "where id='" + id + "'" ;
=======
                   + "apellidos ='" + p.getCuerpo()+ "'"
                   + " where id='" + id + "'" ;
>>>>>>> master
        con.update(sql);
    }

    public ArrayList<Post> listar() {
<<<<<<< HEAD
        ArrayList<Post> post = new ArrayList<Post>();
=======
        ArrayList<Post> profesores = new ArrayList<Post>();
>>>>>>> master
        ResultSet datos = null;
        try {
            String sql = "SELECT * FROM post";

            datos = con.query(sql);

            while (datos.next()) {
                Post p = new Post();
                p.setId(datos.getInt("id"));
                p.setUsuario_id(datos.getInt("usuario_id"));
                p.setTitulo(datos.getString("titulo"));
                p.setCuerpo(datos.getString("cuerpo"));
                p.setPostestado_id(datos.getInt("postestado_id"));

                //agregar profesor a arraylist de profesores
<<<<<<< HEAD
                post.add(p);
=======
                profesores.add(p);
>>>>>>> master

            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

<<<<<<< HEAD
        return post;
=======
        return profesores;
>>>>>>> master

    }

    public void eliminar(int id) {
        String sql = "DELETE FROM post WHERE id=" + id;
        con.update(sql);
    }

    public Post buscar(int id) {
        try {
            String sql = "SELECT * FROM post WHERE id = " + id;
            ResultSet datos = null;

            datos = con.query(sql);

            datos.next();

            Post p = new Post();
            p.setId(datos.getInt("id"));
            p.setUsuario_id(datos.getInt("usuario_id"));
            p.setTitulo(datos.getString("titulo"));
            p.setCuerpo(datos.getString("cuerpo"));
            p.setPostestado_id(datos.getInt("postestado_id"));

            return p;
        } catch (SQLException ex) {
            Logger.getLogger(PostDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

}
