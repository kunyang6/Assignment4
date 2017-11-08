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
public class BubbleSort {
    
    public static void bubbleSort(int[] a){
        for(int i = 0; i < a.length-1; i++){
            for(int j = 0; j < a.length-i-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    
    public static void bubbleSort2(int[] a){
        boolean sorted = true;
        int arraySize = 0;
        while(sorted){
            sorted = false;
            for(int i = 1; i < a.length-arraySize; i++){
                if(a[i-1] > a[i]){
                    int temp = a[i-1];
                    a[i-1] = a[i];
                    a[i] = temp;
                    sorted = true;
                }
            }
            arraySize++;
        }
    }
}
