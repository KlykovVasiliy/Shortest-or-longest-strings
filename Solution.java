package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String textMin;
        String textMax;
        int a = 0;

        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            list.add(reader.readLine());
            a++;
            if(a == 10) {
                break;
            }
        }
        textMin = list.get(0);
        textMax = textMin;
        for(int i = 1; i < list.size() - 1; i++) {
            if(list.get(i).length() < textMin.length()) {
                textMin = list.get(i);
            } else if(list.get(i).length() > textMax.length()) {
                textMax = list.get(i);
            }
        }
        for(int i = 0; i < list.size() - 1; i++) {
            if(textMin.equals(list.get(i))) {
                System.out.println(textMin);
                break;
            } else if(textMax.equals(list.get(i))) {
                System.out.println(textMax);
                break;
            }
        }
        //напишите тут ваш код
    }
}