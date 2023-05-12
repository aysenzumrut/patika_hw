package org.example;

import java.util.ArrayList;

public class PalindromSayi {
    static boolean PalindromSayi(int num){

        String s=Integer.toString(num);
        StringBuilder sb= new StringBuilder(s);
        String newS = String.valueOf(sb.reverse());
        if (s.equals(newS)) return true;
        return (s.equals(newS))? true:false;

    }
    public static void main(String[] args) {

        System.out.println(PalindromSayi(3));
        System.out.println(PalindromSayi(33633));
        System.out.println(PalindromSayi(101));
        System.out.println(PalindromSayi(99));
        System.out.println(PalindromSayi(323424));
        System.out.println(PalindromSayi(123));
    }
}
