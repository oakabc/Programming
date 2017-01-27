/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author oakabc
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] score = new double[11];
        System.out.println("โปรดกรอกคะแนนจำนวน " + score.length + " คะแนน");
        for (int i = 0; i < score.length; i++) {
            System.out.println("โปรดกรอกคะแนนที่ " + (i + 1) + " :");
            score[i] = input.nextDouble();

        }

        double sum = 0;
        for (int i = 0; i < score.length; i++) {

            sum += score[i];

        }
        System.out.println("ค่าเฉลี่ยเท่ากับ " + sum / score.length);

        Arrays.sort(score);

        System.out.println("ค่าที่น้อยที่สุดคือ " + score[0]);

        System.out.println("ค่าที่มากที่สุดคือ " + score[score.length - 1]);

        System.out.println("คะแนนที่มากกว่าค่าเฉลี่ยคือ");

        for (int i = 0; i < score.length; i++) {

            if (sum / score.length < score[i]) {
                System.out.println(score[i]);
            }

        }

    }

}
