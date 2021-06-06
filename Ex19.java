/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */
import java.util.*;
import java.text.DecimalFormat;
public class Ex19
{

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int height , weight ;
        double BMI;

        //if(!kb.hasNextInt()){
        System.out.println("Enter your height(in inches) ");
        height = kb.nextInt();


        //height = kb.nextInt();
        System.out.println("Enter your weight(in pounds) ");
        weight = kb.nextInt();

   /* if(!kb.hasNextInt()){
      System.out.print("Enter your weight(in pounds) ");
      weight = kb.nextInt();
    }
      //weight = kb.nextInt();*/

        BMI = (double)weight / (height * height) * 703 ;
        DecimalFormat df = new DecimalFormat("#.#");

        System.out.println("Your BMI is " + df.format(BMI));

        if(BMI >= 18.5 && BMI <= 25)
        {
            System.out.println("You are within the ideal weight range. ");
        }
        else
        {
            System.out.println("You are overweight. You should see your doctor.");
        }


    }
}