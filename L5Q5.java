
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jiaqi
 */

import java.util.Random;
import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;
public class L5Q5 {
    static int found =0;
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        Integer [] arr = new Integer [20];
        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i =0;i<20;i++){
            arr[i]= rand.nextInt(101);
            System.out.format("%d%s", arr[i], ((i==19)?"":", "));
        }
        System.out.println();
                
        int search;
        System.out.print("\nEnter a number to search: ");
        search = sc.nextInt();
        
        //linear search 
        for (int r = 0;r< arr.length;r++){
            if (arr[r]==search){
                System.out.println(search + " found");
                found++;
                System.out.format("Linear Search - %d %s%n", (r+1), ((r>1)?"loops":"loop"));
                break;
            }
        }       
        
        Integer[] arrSort = arr;
        sort(arrSort);
        //binary search
        
        for (int r =1, low =0, high=arrSort.length-1;low<=high;r++){
            int middle = (low+high)/2;
            if (arrSort[middle]==search){
                if (found==0)
                    System.out.println(search + " found");
                System.out.format("Binary Search - %d %s", r, ((r>1)?"loops":"loop"));
            }
            if (search<arrSort[middle])
                low = middle+1;
            else 
                high = middle-1;
        }
    }    
    public static void sort(Integer[] arr){
        System.out.println("\nArray in descending order");
        Arrays.sort(arr, Collections.reverseOrder());
        int i=0;
        for (Integer p: arr)
            System.out.format("%d%s", p, ((i++==19)?"":", "));
        System.out.println();
    }
}

