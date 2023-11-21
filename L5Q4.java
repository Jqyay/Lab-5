/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jiaqi
 */
public class L5Q4 {
    public static void main(String[] args){
        int[][] matrix = {{1,5,7},{3,6,9},{5,3,8}};
        System.out.println("3 by 3 Matrix");
        for (int[] p : matrix){
            for (int q :p)
                System.out.print(q +"  ");
            System.out.println();
        }
        System.out.println("\nAfter rotates 90 degrees clockwise ");
        for (int j=0; j<matrix[0].length;j++){
            for (int i =matrix.length-1;i>=0;i--)
                System.out.print(matrix[i][j]+"  ");
            System.out.println();
        }
    }
}
