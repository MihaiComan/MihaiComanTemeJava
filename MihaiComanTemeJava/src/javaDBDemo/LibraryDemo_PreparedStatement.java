/*
 * Demo App to test C.R.U.D operations using Prepared Statement
 */
package javaDBDemo;
import java.sql.*;

/**
 *
 * @author Mihai
 */
public class LibraryDemo_PreparedStatement {

    
    public static void insertAuthors(String sSSN, String sFirst_Name, String sFamily_Name) throws SQLException {
        
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
            
            String DML = "INSERT INTO BOOK_AUTHORS (SSN,FIRST_NAME,FAMILY_NAME)VALUES (?,?,?)";
            PreparedStatement pstmnt = connection.prepareStatement(DML);
            pstmnt.setString(1,sSSN);
            pstmnt.setString(2,sFirst_Name);
            pstmnt.setString(3,sFamily_Name);
            pstmnt.execute();
        
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

    
        
    public static void insertBooks(String sISBN, String sName, String sType, String sPaperQuality, String sGenre, int sPages) throws SQLException {
        
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
            
            String DML = "INSERT INTO EBOOKS (ISBN,NAME,ID_TYPE,ID_QUALITY,ID_GENRE,PAGES)VALUES (?,?,?,?,?,?)";
            PreparedStatement pstmnt = connection.prepareStatement(DML);
            pstmnt.setString(1,sISBN);
            pstmnt.setString(2,sName);
            pstmnt.setString(3,sType);
            pstmnt.setString(4,sPaperQuality);
            pstmnt.setString(5,sGenre);
            pstmnt.setInt(6,sPages);
            pstmnt.execute();
        
            System.out.println("A new book is inserted into BOOKS table!");
            resultSet = statement.executeQuery("SELECT * FROM EBOOKS");
            
            boolean resultSetHasRows = resultSet.next(); 
            if (resultSetHasRows)
            {
                String currentISBN = "";
                String currentName = "";
                String currentType = "";
                String currentPaperQuality = "";
                String currentGenre = "";
                int currentPages = 0;
                System.out.println("ISBN    NAME                    TYPE          PAPERQUALITY           GENRE       PAGES");
                System.out.println("=============================================================================");
               do {
                    currentISBN = resultSet.getString(1);
                    currentName = resultSet.getString(2); 
                    currentType = resultSet.getString(3);
                    currentPaperQuality = resultSet.getString(4);
                    currentGenre = resultSet.getString(5);
                    currentPages = resultSet.getInt(6);
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

    public static void deleteBooks(String sISBN) throws SQLException {
        
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
            
            String DML = "DELETE FROM EBOOKS WHERE ISBN=? ";
            PreparedStatement pstmnt = connection.prepareStatement(DML);
            pstmnt.setString(1,sISBN);
            /*pstmnt.setString(2,sName);
           /pstmnt.setString(3,sType);
            pstmnt.setString(4,sPaperQuality);
            pstmnt.setString(5,sGenre);
            pstmnt.setInt(6,sPages);*/
            pstmnt.execute();
        
            System.out.println("The book number: " + sISBN+ " was deleted from the database!");
            
            resultSet = statement.executeQuery("SELECT * FROM EBOOKS");
            
            boolean resultSetHasRows = resultSet.next(); 
            if (resultSetHasRows)
            {
                String currentISBN = "";
                String currentName = "";
                String currentType = "";
                String currentPaperQuality = "";
                String currentGenre = "";
                int currentPages = 0;
                System.out.println("ISBN    NAME                    TYPE          PAPERQUALITY           GENRE       PAGES");
                System.out.println("=============================================================================");
               do {
                    currentISBN = resultSet.getString(1);
                    currentName = resultSet.getString(2); 
                    currentType = resultSet.getString(3);
                    currentPaperQuality = resultSet.getString(4);
                    currentGenre = resultSet.getString(5);
                    currentPages = resultSet.getInt(6);
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

    public static void displayBooks() throws SQLException {
        
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
            
            resultSet = statement.executeQuery("SELECT * FROM EBOOKS");
            
            boolean resultSetHasRows = resultSet.next(); 
            if (resultSetHasRows)
            {
                String currentISBN = "";
                String currentName = "";
                String currentType = "";
                String currentPaperQuality = "";
                String currentGenre = "";
                int currentPages = 0;
                System.out.println("ISBN    NAME                    TYPE          PAPERQUALITY           GENRE       PAGES");
                System.out.println("=============================================================================");
               do {
                    currentISBN = resultSet.getString(1);
                    currentName = resultSet.getString(2); 
                    currentType = resultSet.getString(3);
                    currentPaperQuality = resultSet.getString(4);
                    currentGenre = resultSet.getString(5);
                    currentPages = resultSet.getInt(6);
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

    public static void displayRecords() throws SQLException {
        
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
            
            resultSet = statement.executeQuery("SELECT EBOOKS.ISBN, EBOOKS.NAME, BOOK_AUTHORS.FIRST_NAME, BOOK_AUTHORS.FAMILY_NAME, EBOOKS.ID_TYPE, EBOOKS.ID_QUALITY, EBOOKS.ID_GENRE, EBOOKS_USERS_RATINGS.ID_RATINGS\n" +
"FROM EBOOKS,BOOK_AUTHORS, EBOOKS_USERS_RATINGS,EBOOKS_AUTHORS,BOOK_TYPES,BOOK_PAPER_QUALITIES,BOOK_GENRES,RATINGS,USERS\n" +
"WHERE EBOOKS.ISBN=EBOOKS_USERS_RATINGS.ID_ISBN AND EBOOKS.ISBN=EBOOKS_AUTHORS.ID_ISBN AND EBOOKS_AUTHORS.ID_SSN=BOOK_AUTHORS.SSN AND EBOOKS.ID_TYPE=BOOK_TYPES.TYPE AND \n" +
"EBOOKS.ID_QUALITY=BOOK_PAPER_QUALITIES.QUALITY AND EBOOKS.ID_GENRE=BOOK_GENRES.GENRE AND EBOOKS_USERS_RATINGS.ID_SSN=USERS.SSN AND EBOOKS_USERS_RATINGS.ID_RATINGS=RATINGS.RATING");
            
            boolean resultSetHasRows = resultSet.next(); 
            if (resultSetHasRows)
            {
                String currentISBN = "";
                String currentName = "";
                String currentFirst_Name="";
                String currentFamily_Name="";
                String currentType = "";
                String currentPaperQuality = "";
                String currentGenre = "";
                String currentRating="";
                
                System.out.println("ISBN    NAME               AUTHOR            TYPE          PAPERQUALITY           GENRE       RATING");
                System.out.println("====================================================================================================");
               do {
                    currentISBN = resultSet.getString(1);
                    currentName = resultSet.getString(2); 
                    currentFirst_Name = resultSet.getString(3);
                    currentFamily_Name= resultSet.getString(4);
                    currentType = resultSet.getString(5);
                    currentPaperQuality = resultSet.getString(6);
                    currentGenre = resultSet.getString(7);
                    currentRating = resultSet.getString(8);
                    System.out.println(currentISBN +"     "+currentFirst_Name+"     "+currentFamily_Name+"      "+currentName+"      "+currentType+"       "+currentPaperQuality+"       "+currentGenre+"       "+currentRating);
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
    public static void addRating(int sID, String sRating, String sSSN, String sISBN) throws SQLException {
        
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
            String DML = "INSERT INTO EBOOKS_USERS_RATINGS (ID, ID_RATINGS, ID_SSN, ID_ISBN)VALUES (?,?,?,?)";
            PreparedStatement pstmnt = connection.prepareStatement(DML);
            pstmnt.setInt(1,sID);
            pstmnt.setString(2,sRating);
            pstmnt.setString(3,sSSN);
            pstmnt.setString(4,sISBN);
            pstmnt.execute();
        
            System.out.println("A new book was rated!");
            resultSet = statement.executeQuery("SELECT * FROM EBOOKS_USERS_RATINGS");
            
            boolean resultSetHasRows = resultSet.next(); 
            if (resultSetHasRows)
            {
                int currentID = 0;
                String currentRating = "";
                String currentUser = "";
                String currentISBN = "";
                System.out.println("ID     RATING      USER      ISBN");
                System.out.println("=================================");
               do {
                    currentID = resultSet.getInt(1);
                    currentRating = resultSet.getString(2); 
                    currentUser = resultSet.getString(3);
                    currentISBN = resultSet.getString(4);
                    System.out.println(currentID +"     "+currentRating+"      "+currentUser+"     "+currentISBN);
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
                 
			//insertAuthors("1700921310358", "IGOR",  "BERGLER");
                        //insertBooks("135","The Lord of the Rings","NOVEL","N/A","ADVENTURES",1000);
                        //deleteBooks("135");
                        //displayBooks();
                        //addRating(3,"****","1122334455667","135");
                        displayRecords();
		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}
    }
    
    }
    
