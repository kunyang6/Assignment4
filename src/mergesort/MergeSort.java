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
    public static void mergeSort(int[] a){
        int n = a.length;
        //cutting the array into smaller parts, if the array is less than or equal to one
        //the recursion will not run, hence ending the sorting
        if(n > 1){
            //fiding the mid point
            int mid = n / 2;
            //cutting the array into two parts, based on the piviot point mid
            //
            int[] left = new int[mid];
            int[] right = new int[n-mid];
            
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
    public static void merge(int[] left,int[] right,int[] a){
        int mA = left.length;
        int mB = right.length;
        int i = 0;
        int j = 0;
        int k = 0;
        
        //assign the smallest contents from left or right array into the original array
        while(i < mA && j < mB){
            if(left[i] <= right[j]){
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
