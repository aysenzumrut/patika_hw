package org.example;

import java.util.Scanner;

public class Calculator {

/*1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı*/

    static int toplama(int a, int b){
        int result = a+b ;
        System.out.println("Sonuç : "+result);
        return result;
    }

    static int cikarma(int a, int b){
        int result=0;
        if (a>b) {
            result= a-b;
            System.out.println("Sonuç : "+result);
            return result;
        }
        else {
            result=b-a;
            System.out.println("Sonuç : "+result);
            return result;
        }
    }

    static int carpma(int a,int b){
        int result=a*b;
        System.out.println("Sonuç : "+result);
        return result;
    }

    static int bolme(int a, int b){
        int result;
        if (b==0) System.out.println("Bölen Sıfır Olamaz!");
        result = a/b;
        System.out.println("Sonuc : "+result);
        return result;
    }

    static int ustAlma(int a,int b){
        int result = 1;
        for (int i=1;i<=b;i++){
            result *= a;
        }
        System.out.println("Sonuc : "+result);
        return result;
    }

    static int mod(int a,int b){
        int result=a%b;
        System.out.println("Sonuc : "+result);
        return result;
    }

    static int alan(int a, int b){
        int result=carpma(a,b);
        return result;
    }

    static int cevre(int a,int b){
        int result=2*(a+b);
        System.out.println("Sonuc : "+result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan\n"
                + "8- Dikdötrgen Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();

            if (select==0) break;

            System.out.print("İlk Sayı : ");
            int a = scan.nextInt();
            System.out.print("İkinci Sayı : ");
            int b= scan.nextInt();

            switch (select) {
                case 1:
                    toplama(a,b);
                    break;
                case 2:
                    cikarma(a,b);
                    break;
                case 3:
                    carpma(a,b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    ustAlma(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    alan(a,b);
                    break;
                case 8:
                    cevre(a,b);
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }



    }
}
