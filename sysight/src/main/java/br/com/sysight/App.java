package br.com.sysight;

import java.io.IOException;
import java.net.UnknownHostException;
import org.json.JSONObject;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
     public static void main(String args[]) throws UnknownHostException, IOException, InterruptedException {
       JSONObject json = new JSONObject();
       
       //json.put("text", "Olá! Eu sou a Sys! A bot da Sysight!");
       //Slack.enviarMensagem(json);
        
        Conexao con = new Conexao();
        Conexao2 con2 = new Conexao2();
        
        JdbcTemplate config = new JdbcTemplate(con.getDatasource());

        Recurso recurso = new Recurso();

        // Parametros para o primeiro insert
   
        String momento =  recurso.getMomento();
        String consumoRam = String.format("%.2f", recurso.getConsumoRam());
        String consumoCpu = String.format("%.2f", recurso.getConsumoCPU());
        String consumoDisco = String.format("%.2f", recurso.getConsumoDisco());
       
      
        json.put("text", String.format("Olá! Aqui é a Sys, bot da Sysight! "
                + "Estou aqui para mostrar algumas informações sobre seu sistema. "
                + "Vamos lá:\n"
                + "Data e Horario: %s\n"
                + "Memoria RAM: %s%%\n"
                + "Processador: %s%%\n"
                + "Discos: %s%%\n",
                momento,
                consumoRam,
                consumoCpu,
                consumoDisco)); 
        Slack.enviarMensagem(json);
        
        // Texto padrão para insert
        String insertStatement = "INSERT INTO Recurso (fkEquipamento, consumoRam, consumoCpu, consumoDisco, momento) VALUES (?, ?, ?, ?, ?)";
        
                // Utilizamos o comando "update" para inserir e/ou atualizar registros.
                // Podemos utilizar variavéis como o exemplo abaixo:
                //ALTERE A FK DE ACORDO COM SEU EQUIPAMENTO
                config.update(insertStatement, 2,consumoRam, consumoCpu, consumoDisco, momento);

        System.out.println("Dados de recursos inseridos na Azure! :D");
        System.out.println("Dados de recursos inseridos no Mysql! :D");
     }
}