

package project1;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Project1 {

    public static void main(String[] args) {
        try {
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
            String user = "user4";
            String name = "Muaz";
            int win = 0,loose = 0, draw = 0;
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hangman?verifyServerCertificate=false&useSSL=true","root","1234");
            st = con.createStatement();
           String query = "Insert into hangman values('" + user + "','" + name + "','" +win + "','" +loose+ "','" + draw +"');";                                                                                                   

             st.executeUpdate(query);
     
JOptionPane.showMessageDialog(null," Welcome New Player ! \n\n Please Enter Your Nickname \nOn the  [ Existing Player ]  Field \n\n To Play Game ");
        } catch (ClassNotFoundException ex) {
               
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Player with thesame Nickname Exist ! \n\nPls try a different Nickname");    
        }
      
    }
    
}
