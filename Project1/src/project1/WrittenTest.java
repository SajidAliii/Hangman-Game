/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author pro
 */
public class WrittenTest {

public static int doSomething(int a, int b)

{

      if (b==1)

return a;

      else

return a + doSomething(a,b-1);

}          



public static void main(String args[]) {

    int list[] = { 12, 31, 4, 100, 4 }; 

    int num = 100;

    int result = doSomething(2, 3);

    if(result == -1)

        System.out.print("Search key is not found");

    else

        System.out.print("Search key is present at index " + result);

}
}