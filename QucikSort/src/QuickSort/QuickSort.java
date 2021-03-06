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
public class QuickSort {
    public static <E extends Comparable<E>> int partition(E[] a, int start, int end){
        E pivot = a[end];
        int pIndex = start - 1;
        for(int i = start; i < end; i++){
            if(a[i].compareTo(pivot)<0 || a[i].compareTo(pivot) == 0){
                pIndex++;
                swap(a,i,pIndex);
            }
        }
        swap(a,pIndex + 1,end);
        return pIndex + 1;
    }
    
    public static <E extends Comparable<E>> void quickSort(E[] a, int start , int end){
        if(start < end){
            int pIndex = partition(a,start,end);
            quickSort(a, start, pIndex-1);
            quickSort(a, pIndex + 1, end);
        }
    }
    
    public static <E extends Comparable<E>> void swap(E[]a, int swapFirst, int swapSecond){
        E temp = a[swapFirst];
        a[swapFirst] = a[swapSecond];
        a[swapSecond] = temp;
    }
}
