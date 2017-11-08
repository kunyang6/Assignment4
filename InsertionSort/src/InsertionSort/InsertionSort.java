/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSort;

/**
 *
 * @author vince
 */
public class InsertionSort {
    public static <E extends Comparable<E>> void insertionSort(E[] a){
        int size = a.length;
        for(int j = 1; j < size; j++){
            E key = a[j];
            int i = j-1;
            while(i >= 0 && a[i].compareTo(key) > 0 ){
                a[i+1] = a[i];
                i = i-1;
            } 
            a[i+1] = key;
        }
        
    }
}
