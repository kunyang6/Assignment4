/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Arrays;

/**
 *
 * @author vince
 */
public class MergeSort {
    /*
    mergeSort
    */
    public static<E extends Comparable<E>> void mergeSort(E[] a){
        int n = a.length;
        //cutting the array into smaller parts, if the array is less than or equal to one
        //the recursion will not run, hence ending the sorting
        if(n > 1){
            //fiding the mid point
            int mid = n / 2;
            //cutting the array into two parts, based on the piviot point mid
            //
            E[] left = (E[])new Comparable[mid];
            E[] right = (E[])new Comparable[n-mid];
            
            //assign the left and right array witht the contents from the original array
            for(int i = 0; i < mid; i++){
                left[i] = a[i];
            }
            for(int j = mid; j < n; j++){
                right[j-mid] = a[j];
            }
            //recrusively cutting the array into smaller parts
            //sorting the left part
            mergeSort(left);
            //sorting the right part
            mergeSort(right);
            //merging two arrays, and over writting the contents inside the original array
            merge(left,right,a);
        }
    }
    
    /*
    merging two arrays
    */
    public static <E extends Comparable<E>>void merge(E[] left,E[] right,E[] a){
        int mA = left.length;
        int mB = right.length;
        int i = 0;
        int j = 0;
        int k = 0;
        
        //assign the smallest contents from left or right array into the original array
        while(i < mA && j < mB){
            if(left[i].compareTo(right[j]) < 0){
                a[k] = left[i];
                i = i + 1;
            } else {
                a[k] = right[j];
                j = j + 1;
            }
            k = k + 1;
        }
        
        //if one of the both array are not done sorting, then attach the rest to the original array
        //hence the rest of the contents will be sorted during recursive calls
        //left case
        while(i < mA){
            a[k] = left[i];
            i = i+1;
            k = k+1;
        }
        //right case
        while(j < mB){
            a[k] = right[j];
            j = j+1;
            k = k+1;
        }
    }
}
