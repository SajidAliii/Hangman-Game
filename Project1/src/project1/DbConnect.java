/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author muaz6
 */
public class DbConnect {
    private Connection con;
    private Statement st ; 
    private ResultSet rs;
    public DbConnect(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        
       con = DriverManager.getConnection("jdbc:mysql://localhost/hangman?verifyServerCertificate=false&useSSL=true","root","1234");
       st = con.createStatement();
       
    } catch (Exception e ){System.out.println("Error");} 
    
    }
   public void getData(){
   try {
   String query = "select * from hangman";
   rs = st.executeQuery(query);
   System.out.println("Record from Database");
   while (rs.next()) {
       String userid = rs.getString("userid");
       String name = rs.getString("name");
       System.out.println(userid+name);
   }
   } catch(Exception e ){}
   
   } 
   public void addData(String user, String name, int win, int loose, int draw ){
        try {
         
         //   st = con.createStatement();
           String query = "Insert into hangman values('" + user + "','" + name + "','" +win + "','" +loose+ "','" + draw +"');";                                                                                                   

             st.executeUpdate(query);
             System.out.println("Connected");
        } catch (SQLException ex) {
           System.out.println("error");
    //    } catch (ClassNotFoundException ex) {
      //      Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
    public void getName(String user){
           System.out.println("Record from Database");

   try {
       
   String query = "Select * from hangman Where userid = '" + user + "';"; 
   rs = st.executeQuery(query);
   System.out.println("Record from Database");
   while (rs.next()) {
       String userid = rs.getString("userid");
       String name = rs.getString("name");
       int wins = rs.getInt("win");
       int loose = rs.getInt("loose");
       int draw = rs.getInt("draw");
       System.out.println("UserID:"+ userid+"NAME"+name+"WINS"+wins+"LOOSES"+loose+"DRAW"+draw);
   }
   } catch(Exception e ){System.out.println("error");}
   
   } 
}
