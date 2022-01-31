/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;
import java.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.util.Pair;
/**
 *
 * @author muaz6
 */
public class FilesConnect {
    File wordsPvM = new File ("PvM.txt");
    File wordsPvMh = new File ("PvMHard.txt");
    File wordsPvP = new File ("PvP.txt");
    File playerStats = new File("PlayerStats.txt");
         
    public void createFiles(){
    try {    
    if (!wordsPvM.exists()){
        wordsPvM.createNewFile();
    }
     if (!wordsPvMh.exists()){
        wordsPvMh.createNewFile();
    }
    if (!wordsPvP.exists()){
        wordsPvP.createNewFile();
    }
      if (!playerStats.exists()){
        playerStats.createNewFile();
    }
      
    System.out.println("Successfully created files");
   } catch (Exception e){System.out.println("Error");}
    }
     
    public void writePvP(String file){
    try {
     
        PrintWriter pw = new PrintWriter(wordsPvP);
        pw.println(file);
      pw.close();
          System.out.println("Successfully Written");

   } catch (Exception e){System.out.println("Error");}
    }
   
     public void PlayerStats(String userid, String name, int win, int loose, int draw){
    try {
        PrintWriter pw = new PrintWriter(playerStats);
        pw.println(userid +"\n"+name+"\n"+win+"\n"+loose+"\n"+draw);
        pw.close();
        System.out.println("Successfully updated stats");

   } catch (Exception e){System.out.println("Error");}
    }
    public String[] readPvM(){
         ArrayList<String> Countries = new ArrayList<String>();

    try {
      /*  if (difficulty == "Easy")
           difficulty = "wordsPvM";
        else 
            difficulty = "wordsPvMh";
        */
        Scanner sc = new Scanner (wordsPvM);
       
        while(sc.hasNextLine()){
            Countries.add(sc.nextLine());
     //   System.out.println(sc.nextLine());
       
        }
    } catch (Exception e){}
    String[] country = new String[Countries.size()];
    for (int i = 0 ; i < Countries.size(); i++)
    {
    country[i] = Countries.get(i);
   // System.out.println(country[i]);
    }
    return country;
      
   
    }
    public String[] readPvMh(){
         ArrayList<String> Countries = new ArrayList<String>();

    try {
      /*  if (difficulty == "Easy")
           difficulty = "wordsPvM";
        else 
            difficulty = "wordsPvMh";
        */
        Scanner sc = new Scanner (wordsPvMh);
       
        while(sc.hasNextLine()){
            Countries.add(sc.nextLine());
     //   System.out.println(sc.nextLine());
       
        }
    } catch (Exception e){}
    String[] country = new String[Countries.size()];
    for (int i = 0 ; i < Countries.size(); i++)
    {
    country[i] = Countries.get(i);
   // System.out.println(country[i]);
    }
    return country;
      
   
    }
    
    } 
     
    
