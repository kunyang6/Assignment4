/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectionSort;

/**
 *
 * @author vince
 */
public class SelectionSortTest {
    public static void test(){
        int[] test1 = {3,5,2,7,1,6,4};
        SelectionSort.selectionSort(test1);
        print(test1);
    }
    
    public static void print(int[] test){
        System.out.print("{" + test[0]);
        for(int i = 1; i < test.length-1; i++){
            System.out.print("," + test[i]);
            
        }
        System.out.println(","+ test[test.length-1] + "}");
    }
    
    public static void main(String[] args){
        test();
    }
    
}
