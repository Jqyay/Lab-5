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
public class L5Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Enter the number of employees: ");
        int num = sc.nextInt();
        int[][] workHour = new int[num][7];
        for (int i =0;i<workHour.length;i++){
            for (int j=0;j<workHour[i].length;j++)
                workHour[i][j]=rd.nextInt(8)+1;
        }
        System.out.println();
        String [] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday", "Sunday"};
        for (int i=0; i<num;i++){
            int sum=0;
            System.out.format("Employee %d%n", (i+1));
            for (int j=0;j<7;j++){
                System.out.format("%-10s %d %s%n", day[j],workHour[i][j], (workHour[i][j]>1)?"hours":"hour");
                sum+=workHour[i][j];
            }
            System.out.format("Total hours of working: %d hours%n%n", sum);
        }
    }
}
