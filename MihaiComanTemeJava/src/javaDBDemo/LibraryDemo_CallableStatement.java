/*
 * Demo App to test C.R.U.D operations using Callable Statement
 */
package javaDBDemo;

import java.sql.*;

/**
 *
 * @author Mihai
 */
public class LibraryDemo_CallableStatement {
    
    public static void insertAuthor(String sSSN, String sFirst_Name, String sFamily_Name) throws SQLException {
    
        String user = "Mihai";
        String password = "Mihai";
        String url = "jdbc:derby://localhost:1527/eBookStoreDB;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            CallableStatement storedProcedureInsertAuthor = connection.prepareCall("{call INSERT_AUTHOR(?,?,?)}"); 
            storedProcedureInsertAuthor.setString("SSN", sSSN); 
            storedProcedureInsertAuthor.setString("First_Name", sFirst_Name); 
            storedProcedureInsertAuthor.setString("First_Name", sFamily_Name);
            storedProcedureInsertAuthor.executeUpdate(); 
             

            System.out.println("A new author is inserted into BOOK_AUTHORS table!");
            resultSet = statement.executeQuery("SELECT * FROM BOOK_AUTHORS");
            
            boolean resultSetHasRows = resultSet.next(); 
            if (resultSetHasRows)
            {
                String currentSSN = "";
                String currentFirst_Name = "";
                String currentFamily_Name = "";
                System.out.println("SSN    FIRST_NAME            FAMILY_NAME");
                System.out.println("========================================");
               do {
                    currentSSN = resultSet.getString(1);
                    currentFirst_Name = resultSet.getString(2); 
                    currentFamily_Name = resultSet.getString(3);
                    System.out.println(currentSSN +"   "+currentFirst_Name+"      "+currentFamily_Name);
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
            throw new SQLException(); 
        }
        finally
        {
            if (resultSet != null)
            {
                try
                {
                    resultSet.close();
                }
                catch (Exception ex){ex.printStackTrace();}
            }
            if (statement != null)
            {
                try
                {
                    statement.close();
                }
                catch (Exception ex){ex.printStackTrace();}
            }	
            if (connection != null)
            {
                try
                {
                    connection.close();
                }
                catch (Exception ex){ex.printStackTrace();}
            
            }
        }
    }
      
    public static void main(String[] args){
    
               
        try {
                 
			insertAuthor("1740605298997", "NARCIS DORIN",  "ION");
                

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}
    }
    
    }
    