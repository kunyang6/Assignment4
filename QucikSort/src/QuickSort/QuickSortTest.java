/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort;

/**
 *
 * @author vince
 */
public class QuickSortTest {
    public static void test(){
        Integer[] test = {7, 7,2,1,6,8,5,3,4};
        QuickSort.quickSort(test, 0, test.length - 1);
        printArray(test);
    }
    
    public static void main(String[] args){
        test();
    }
    
    public static <E extends Comparable<E>> void printArray(E[] a){
        System.out.print("{" + a[0]);
        for(int i = 1; i < a.length-1; i++){
            System.out.print("," + a[i]);
        }
        System.out.print("," + a[a.length-1] + "}\n");
    }
}
