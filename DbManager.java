/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell4
 */
public class DbManager {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public DbManager() 
    {
        try 
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        try 
        {
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\OOP Project\\Project\\Mydb.accdb");
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
        }            
    }
    public void updataRoom(int id, int aRooms)
    {
        try 
        {           
            String query;
            query = "Update RoomsData set Available = ? WHERE ID = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, aRooms);
            ps.setInt(2, id);
            int doneUpdate = ps.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }    
}
