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
public class SelectionSort {
      public static void main (String [] args) {
 
  int []  arr = {70,60,50,40};
    System.out.println("Unsorted Array "+Arrays.toString(arr));
int min,i,j,temp;
    for ( i = 0; i < arr.length;i++){
        min = i;
        for (j = i+1 ; j<arr.length;j++){
            if (arr[j]<arr[min]){   min = j;  }
               System.out.println("Minimum Value is"+arr[min]);
    }
    
        temp = arr[i]; arr[i] = arr[min]; arr[min] = temp;
        System.out.println(i + "Processed "+Arrays.toString(arr));


    }
    System.out.println("Sorted Array "+Arrays.toString(arr));

      } 
}


