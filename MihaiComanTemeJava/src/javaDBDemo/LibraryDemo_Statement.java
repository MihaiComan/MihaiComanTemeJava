/*
 * Demo App to test C.R.U.D operations using Statement
 */
package javaDBDemo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Mihai
 */
public class LibraryDemo_Statement {

    
    public static void main(String[] args) {
        String user = "Mihai";
        String password = "Mihai";
        String url = "jdbc:derby://localhost:1527/eBookStoreDB";
        //String url = "jdbc:derby:firstdb;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        //String driver = "org.apache.derby.jdbc.ClientXADataSource40";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            System.out.println("Statement is "+statement.toString());
            //statement.execute("INSERT INTO EBOOKS VALUES ('135','The Lord of the Rings','NOVEL','N/A','ADVENTURES', 1000)");
            //statement.execute("DELETE FROM EBOOKS WHERE ISBN='135'");
            resultSet = statement.executeQuery("SELECT * FROM EBOOKS");
            
            boolean resultSetHasRows = resultSet.next(); 
            if (resultSetHasRows)
            {
                String currentISBN = "";
                String currentName = "";
                String currentType = "";
                String currentPaperQuality = "";
                String currentGenre = "";
                String currentPages = "";
                System.out.println("ISBN    NAME                    TYPE          PAPERQUALITY           GENRE       PAGES");
                System.out.println("=============================================================================");
               do {
                    currentISBN = resultSet.getString(1);
                    currentName = resultSet.getString(2); 
                    currentType = resultSet.getString(3);
                    currentPaperQuality = resultSet.getString(4);
                    currentGenre = resultSet.getString(5);
                    currentPages = resultSet.getString(6);
                    System.out.println(currentISBN +"     "+currentName+"      "+currentType+"       "+currentPaperQuality+"       "+currentGenre+"       "+currentPages);
                }
                while(resultSet.next());
            }
            else
            {
                System.out.println("No rows found in ResultSet");
            }
        }
        
        
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            if (resultSet != null)
            {
                try
                {
                    resultSet.close();
                }
                catch (Exception ex){}
            }
            if (statement != null)
            {
                try
                {
                    statement.close();
                }
                catch (Exception ex){}
            }	
            if (connection != null)
            {
                try
                {
                    connection.close();
                }
                catch (Exception ex){}
            }
        }	
    }
}
    
    

