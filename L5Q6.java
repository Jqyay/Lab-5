/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jiaqi
 */
import java.util.Scanner;
public class L5Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int row = sc.nextInt();
        int [][] pascal = new int[row][row];
        for (int i =0; i<row;i++){
            pascal[i][0]=1 ;
            for (int j=0; j<=i;j++){
                if (i==j)
                    pascal[i][j]=1 ;
            }
        }
        for (int i=2; i<row;i++){
            for (int j=1;j<i;j++)
                pascal[i][j]= pascal[i-1][j-1]+pascal[i-1][j];
        }
        String pascalInt = String.valueOf(pascal[row-1][row/2]);
        int length = pascalInt.length()+2;
        System.out.format("The Pascal Triangle with %d %s%n", row, ((row>1)?"rows":"row"));
        for(int [] p: pascal){
            for (int q: p)
                System.out.format("%"+ length + "d", q);
            System.out.println();
        }
    }
}
