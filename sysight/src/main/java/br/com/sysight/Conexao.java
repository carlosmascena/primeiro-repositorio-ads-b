package br.com.sysight;

import org.apache.commons.dbcp2.BasicDataSource;


public class Conexao {

 private BasicDataSource datasource;

public Conexao() {
        this.datasource = new BasicDataSource();
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        //com.microsoft.sqlserver.jdbc.SQLServerDriver
        datasource.setUrl("jdbc:mysql://172.17.0.2:3306/banco1" +
                //ip do container
                //jdbc:sqlserver://banco-de-dados-sysight.database.windows.net;
                    "");
        //databaseName=Sysight;
        datasource.setUsername("banco1");
        //Grupo5
        datasource.setPassword("urubu100");
        //Sysight5
    }

 

 public BasicDataSource getDatasource() {
  return datasource;
 }

}