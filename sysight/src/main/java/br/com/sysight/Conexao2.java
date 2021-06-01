/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysight;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author carlo
 */
public class Conexao2 {
    
    private BasicDataSource datasource;
    
    public Conexao2() {
        this.datasource = new BasicDataSource();
        datasource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //
        datasource.setUrl("jdbc:sqlserver://sistem.database.windows.net;" +
                    "databaseName=sistem;");
        datasource.setUsername("sistem");
        datasource.setPassword("#Gf51641290862");
    }
    
     public BasicDataSource getDatasource() {
  return datasource;
 }
}
