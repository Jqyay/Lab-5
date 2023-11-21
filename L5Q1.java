/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jiaqi
 */
import java.util.Scanner;
import java.util.Random;
public class L5Q1 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = sc.nextInt(), lowest= Integer.MAX_VALUE, highest = Integer.MIN_VALUE, average, sum=0 ;
        int[] score = new int[num];
        
            for (int k =0;k<num;k++){
                score[k] = rand.nextInt(101);
                sum+=score[k];
                if (score[k]>highest)
                    highest = score[k];
                if (score[k]< lowest)
                    lowest = score[k];
            }
        average = sum/num;
        System.out.print("Score: ");
        for (int j =0;j<num;j++)
            System.out.print(score[j]+" ");
        System.out.println();
        System.out.println("Highest score: "+ highest);
        System.out.println("Lowest score: "+ lowest);
        System.out.println("Average score: "+ average);
    }
}