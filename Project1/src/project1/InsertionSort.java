/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

import java.util.Arrays;

/**
 *
 * @author muaz6
 */
public class InsertionSort {
     public static void main (String [] args) {
 
  int []  arr = {70,40,50,10};
    System.out.println("Unsorted Array "+Arrays.toString(arr));

  int temp;
  for (int i = 1; i <arr.length ;i++){  // outer loop number of passes 
      temp = arr[i];
  for (int j = i; j> 0 && temp < arr[j-1]; j-- ){ // inner loop number of comparisons only check if temp is lesser as rest of the array is sorted 
   System.out.println("Swaping"+ temp+ "with"+ arr[j-1]);
      if ( temp < arr[j-1]){ arr[j] = arr[j-1]; arr[j-1] = temp;
     
         

  } else  System.out.println("No change" + temp + "and" + arr[j-1]);
 
  }
 
      System.out.println(Arrays.toString(arr));

  }
  
  System.out.println("Sorted Array:  "+Arrays.toString(arr));
    }
    
}

    

