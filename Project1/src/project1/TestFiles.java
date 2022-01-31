/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.util.Pair;

/**
 *
 * @author muaz6
 */
public class TestFiles {
    public static void main (String [] args){
         
     String user = "user62";
    String name = "Muaz";
    String player2Input = "Malaysia";
    int win = 0,loose = 0, draw = 0;
    String country = null;
    String hint = null;
    String difficulty = "easy";
    char guessChar = 'A';
    
    
//   try {     if (difficulty == "easy")
       GenerateRandom guess = new GenerateRandom();
     //  
       Pair <String, String > g ;
       
       if (difficulty == "easy")
                g= guess.Guess();
       else 
       g = guess.Guessh();
       
       country = g.getKey();
       country = country.toUpperCase();
       hint = g.getValue();
       System.out.println(country+ hint);
      
      
        System.out.print("\n");
       
       char[] wordToChar = new char [country.length()];
       char temp;
       for (int i = 0; i < country.length(); i++){
       wordToChar[i] = country.charAt(i);
       /*if (wordToChar[i] >  wordToChar[i+1])
       { temp = wordToChar[i];
       wordToChar[i] = wordToChar[i+1];
       wordToChar[i+1] = temp;}
       */System.out.println(wordToChar[i]);
       }
      /*  for (int j = 0 ; j < wordToChar.length-1;j++)
       for (int i = 0 ; i < wordToChar.length-1;i++){
      if (wordToChar[i] >  wordToChar[i+1])
       { temp = wordToChar[i];
       wordToChar[i] = wordToChar[i+1];
       wordToChar[i+1] = temp;
       }
      
       } */
        System.out.print(wordToChar);
        ArrayList <Integer> pos = new ArrayList <Integer>();
       
        int n = 0;
        for (int k = 0 ; k < wordToChar.length;k++){
        if ( guessChar == wordToChar[k]){
          pos.add(k);
       n++; }
        }
         int[] position = new int[pos.size()];
         
        for (int z = 0 ; z< pos.size(); z++) {position[z] = pos.get(z);}
        for(int a : position){ System.out.print(a);}
        System.out.print("\n Number of Matches: "+n +"\n Array" + Arrays.toString(position) );
        char[] dash = new char[wordToChar.length];
        
         for(int i = 0; i < wordToChar.length ; i++){
             dash[i] ='-';
           
         }
         for (int i = 0 ; i <pos.size() ;i++){dash[pos.get(i)] = guessChar;}
                 System.out.print("\n Number of Matches: "+n +"\n Array" + Arrays.toString(dash) );

          
 //  FilesConnect file = new FilesConnect();
 //  file.createFiles();
 //  file.readPvM("easy");
/*
 String [] array = file.readPvM();
  int index = (int)(Math.random() * array.length);
if (index%2 != 0)
    index+=1;
if (index >= array.length)
    index -=2;
//if (index < 0)
  //  index+=1;
int index2 = index+1;
 //int i = 0;
 //while(i<arr.length) i++;
// for (int i = 0; i < array.length ; i++)
   System.out.println("This is" + array[index]);
     System.out.println("Hint is" + array[index2]);

 //int index = (int)(Math.random() * array.length);
    System.out.println("This is" + index + "Size is "+ array.length); */

  // for (int i = 0; i <arr.length ; i++)
//   {System.out.println (arr[i]);}
   //file.PlayerStats(user, name, win, loose, draw);
  // file.createFiles();
  // file.writePvP(player2Input);
 //  } catch (Exception e){System.out.println("Errortest");}
}
    
}
