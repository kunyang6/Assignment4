/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author vince
 */
public class MergeSortTest {
    /**
     * test cases
     */
    public static void test(){
        int[] test = {9,10,3,5,1,15,6,12,11,7,14,4,2,13,8};
        MergeSort.mergeSort(test);
        //printing
        System.out.println(test.length);
        printArray(test);
    }
    
    /**
     * print array
     * @param test 
     */
    public static void printArray(int[] test){
        System.out.print("{" + test[0]+ ",");
        for(int i = 1; i < test.length - 1; i++){
            System.out.print(test[i] + ",");
        }
        System.out.print(test[test.length-1] + "}");
    }
    /**
     * main
     * @param args 
     */
    public static void main(String[] args){
        test();
    }
}
