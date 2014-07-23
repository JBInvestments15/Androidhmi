package com.example.paul.trendpointmetering;

import net.wimpi.modbus.msg.ReadInputRegistersResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SQLiteJDBC
{
  public static void ConnectToDatabase()
  {
    Connection c = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("TrendpointData.db");
    } catch ( Exception e ) {
      //System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    //System.out.println("Opened database successfully");
  }


public static void CreateTable( String args[] )
{
  Connection c = null;
  Statement stmt = null;
  try {
    Class.forName("org.sqlite.JDBC");
    c = DriverManager.getConnection("TrendpointData.db");
    //System.out.println("Opened database successfully");

    stmt = c.createStatement();
    String sql = "MeterDataLog " +
                 "(timeStamp      TEXT      NOT NULL," +
                 " id             TEXT      NOT NULL, " + 
                 " Data           REAL      NOT NULL,) " ; 
    stmt.executeUpdate(sql);
    stmt.close();
    c.close();
  } catch ( Exception e ) {
    //System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    System.exit(0);
  }
  //System.out.println("Table created successfully");
}





public static void WriteToDatabase(ReadInputRegistersResponse data, String id)
{
  Connection c = null;
  Statement stmt = null;
  try {
    Class.forName("org.sqlite.JDBC");
    c = DriverManager.getConnection("TrendpointData.db");
    c.setAutoCommit(false);
    //System.out.println("Opened database successfully");

    stmt = c.createStatement();
    String sql = "INSERT INTO COMPANY (timeStamp,id,Data) " +
                 "VALUES (DEFAULT CURRENT_TIMESTAMP, id, Data);"; 
    stmt.executeUpdate(sql);

   

    stmt.close();
    c.commit();
    c.close();
  } catch ( Exception e ) {
    //System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    System.exit(0);
  }
  //System.out.println("Records created successfully");
}


public String[] getDatasetFromDB(  )
{
  String[] results = new String[3];
  Connection c = null;
  Statement stmt = null;
  try {
    Class.forName("org.sqlite.JDBC");
    c = DriverManager.getConnection("TrendpointData.db");
    c.setAutoCommit(false);
    //System.out.println("Opened database successfully");

    stmt = c.createStatement();
    ResultSet rs = stmt.executeQuery( "SELECT * FROM MeterDataLog;" );
    while ( rs.next() ) {
       results[0] = rs.getString("timeStamp");
       results[1] = rs.getString("id");
       results[2]  = rs.getString("Data");
       
           }
    rs.close();
    stmt.close();
    c.close();
  } catch ( Exception e ) {
    System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    System.exit(0);
  }
  return results;
  //System.out.println("Operation done successfully");
}





public String getSingleDataPointFromDB(String column  )
{
  String results = null;
  Connection c = null;
  Statement stmt = null;
  try {
    Class.forName("org.sqlite.JDBC");
    c = DriverManager.getConnection("TrendpointData.db");
    c.setAutoCommit(false);
    //System.out.println("Opened database successfully");

    stmt = c.createStatement();
    ResultSet rs = stmt.executeQuery( "SELECT * FROM MeterDataLog;" );
    while ( rs.next() ) {
       results = rs.getString(column);
       
       
           }
    rs.close();
    stmt.close();
    c.close();
  } catch ( Exception e ) {
    System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    System.exit(0);
  }
  return results;
  //System.out.println("Operation done successfully");
}



}