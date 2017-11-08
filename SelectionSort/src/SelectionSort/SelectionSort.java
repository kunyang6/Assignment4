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
public class SelectionSort {
    public static void selectionSort(int[] a){
        for(int i=0; i < a.length-1; i++){
            int min = i;
            for(int j = i+1; j < a.length; j++){
                if( a[min] > a[j]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
    
}
