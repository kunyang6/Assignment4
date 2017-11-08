/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bubblesort;

/**
 *
 * @author vince
 */
public class BubbleSortTest {
    public static void test(){
        Integer[] test = {5,2,7,3,4,9,10,8,1};
        sorting(test);
        Integer[] test2 = {5,2,7,3,4,9,10,8,1};
        secondSorting(test2);
    }
    
    public static <E extends Comparable<E>> void sorting(E[] test){
        BubbleSort.bubbleSort(test);
        System.out.print("{" + test[0]);
        for(int i = 1; i < test.length-1; i++){
            System.out.print(","+ test[i]);
        }
        System.out.print("," + test[test.length-1] + "}");
    }
    
    public static<E extends Comparable<E>> void secondSorting(E[] test){
        BubbleSort.bubbleSort2(test);
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
