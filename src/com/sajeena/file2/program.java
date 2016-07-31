/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.file2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
    String fileName="";
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Enter the file name");
            fileName=input.next();
            
            if(new File(fileName).exists()){
                break;
            
            }}
            BufferedReader reader= new BufferedReader(new FileReader(fileName));
            String link="";
            int i=1;
            while((link=reader.readLine())!=null){
                URL url=new URL(link);
                URLConnection conn=url.openConnection();
                System.out.println("Reading URL "+ link);
                System.out.println("=====================");
                
                BufferedReader ur=new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line="";
                StringBuilder content=new StringBuilder();
                while((line=ur.readLine())!=null){
                    content.append(line);
                    
            }
                ur.close();
                FileWriter writer=new FileWriter("c:/Users/Admin/Desktop/output/url_"+i+".html");
            writer.write(content.toString());
            writer.close();
            i++;
        }
            reader.close();
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
    
}
