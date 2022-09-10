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
import javax.swing.JOptionPane;

/**
 *
 * @author Dell4
 */
public class DeleteData {
    int ID;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String query;
    int result1;
    int result2;
    int result3;
    int result4;
    public DeleteData (int id)
    {
        this.ID = id;
    }
    public void Delete() throws ClassNotFoundException
    {
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\OOP Project\\Project\\Mydb.accdb");
            
            query = "Delete from UserPData where ID = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1,ID);
            result1 = ps.executeUpdate();

            query = "Delete from UserRData where ID = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1,ID);
            result2 = ps.executeUpdate();

            query = "Delete from UserLogin where ID = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1,ID);
            result3 = ps.executeUpdate();

            query = "Delete from Bill where ID = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1,ID);
            result4 = ps.executeUpdate();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public int getResult1()
    {
        return result1;
    }
    public int getResult2()
    {
        return result2;
    }
    public int getResult3()
    {
        return result3;
    }
    public int getResult4()
    {
        return result4;
    }
}
