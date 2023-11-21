/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jiaqi
 */
import java.util.ArrayList;
import java.util.Random;
public class L5Q2 {
    public static void main(String[] args){
        ArrayList <Integer> rand = new ArrayList(); 
        Random rd = new Random();
        for (int i =0; i<10;i++){
            int Rand = rd.nextInt(21);
            boolean isFirst = true;
            for (int j=0;j<rand.size();j++){
                if (rand.get(j)==Rand){
                    isFirst = false;
                    
                    break;
                }
            }
            if (isFirst)
                rand.add(Rand);
            else
                i--;
        }
        for (int p: rand)
            System.out.print(p + " ");
    }
}
