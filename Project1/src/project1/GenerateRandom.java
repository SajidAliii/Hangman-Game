/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

import javafx.util.Pair;

/**
 *
 * @author muaz6
 */
public class GenerateRandom {
public Pair <String, String> Guess() {     
   FilesConnect file = new FilesConnect();
  
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
 //  System.out.println("This is" + array[index]);
  //   System.out.println("Hint is" + array[index2]);

 //int index = (int)(Math.random() * array.length);
   // System.out.println("This is" + index + "Size is "+ array.length);
    return new Pair (array[index],array[index2]);
}
public Pair <String, String> Guessh() {     
   FilesConnect file = new FilesConnect();
  
 String [] array = file.readPvMh();
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
 //  System.out.println("This is" + array[index]);
  //   System.out.println("Hint is" + array[index2]);

 //int index = (int)(Math.random() * array.length);
   // System.out.println("This is" + index + "Size is "+ array.length);
    return new Pair (array[index],array[index2]);
}}

