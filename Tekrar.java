package day09stringmanipulations;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        //Ex 1: Bir Stringteki bir karakterin tekrarlı veya tekrarsız olup omadığını gösteren kodu yazınız.
//        //"Hello"  H= Tekrarsız      e= Tekrarsız       l= Tekrarlı      o= Tekrarlı
//
//
//        System.out.println("Lütfen bir kelime seçiniz");
//        String x = scan.next();
//        System.out.println("Lütfen bir karakter seçiniz");
//        char y = scan.next().charAt(0);
//
//        if (x.indexOf(y)!=x.lastIndexOf(y)){
//            System.out.println("Tekralı");
//        }else {
//            System.out.println("Tekrarsız");
//        }
//
//        //Ex: Verilen bir ismin adının ve soyadının ilk iki harflerini almak için kodu yazınız.
//        //Not: İkinci isim kapsam dışındadır.
//        //Örnek: Tom Hanks ==> ToHa, Mary Star ==> MaSt
//
        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Lütfen Adınızı ve Soyadınızı Giriniz");
//        String fullName = scan2.nextLine();
//        String first = fullName.substring(0,2);
//        String second = fullName.split(" ")[1].substring(0,2);
//        System.out.println(first + second);

        //Ex: Verilen bir ismin adının ve soyadının ilk ve son harflerini almak için kodu yazınız.
        //Örnek: Tom Hanks ==> TmHs, Mary Star ==> MySr
        System.out.println("İsim ve Soyisim Giriniz");
         String fNAme = scan2.nextLine();
         String s1 = fNAme.split(" ")[0],
                s2 = fNAme.split(" ")[1];
           char adIlk =s1.charAt(0),
                adSon = s1.charAt(s1.length()-1),
                soyadILk = s2.charAt(0),
                soyadSon = s2.charAt(s2.length()-1);
        System.out.println("" + adIlk + adSon + " " +soyadILk + soyadSon );















    }
}
