/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bubblesort2;

/**
 *
 * @author vince
 */
public class bubbleSortTest {
    public static void test(){
        int[] test = {5,2,7,3,4,9,10,8,1};
        BubbleSort.bubbleSort(test);
        System.out.print("{" + test[0]);
        for(int i = 1; i < test.length-1; i++){
            System.out.print(","+ test[i]);
        }
        System.out.print("," + test[test.length-1] + "}");
    }
    
    public static void main(String[] args){
        test();
    }
    
}
