/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

import java.util.Arrays;
import static java.util.Arrays.*;

//advance bubble sort , for normal bubbles sort replace i in line 21 with 1 . to get full steps . 
public class BubleSort {
    public static void main (String [] args) {
 
  int []  arr = {70,40,50,10};
    System.out.println("Unsorted Array "+Arrays.toString(arr));

  int temp =0;
  for (int i = 1; i <arr.length ;i++){  // outer loop number of passes 
  for (int j = 0; j<arr.length - i; j++ ){ // inner loop number of comparisons or iterations in each pass n-i  
  if ( arr[j]>arr[j+1]){
      temp = arr[j]; arr[j]=arr[j+1];arr[j+1]=temp;
          System.out.println("Swaping"+ arr[j]+ "with"+ arr[j+1]);

  } else  System.out.println("No change" + arr[j] + "and" + arr[j+1]);

  }
      System.out.println(Arrays.toString(arr));

  }
  
  System.out.println("Sorted Array:  "+Arrays.toString(arr));
    }
    
}
