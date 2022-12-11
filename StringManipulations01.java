package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        String str = "Java is easy";
        // indexOf() methodu verilen karakter veya karakterlerin ilk görünümünün indexini verir.
        int idxA1 = str.indexOf("a");
        System.out.println(idxA1);

        //lastIndexOf() methodu verilen karakter veya karakterlerin son görünümünün indexini verir.

        int idxA2 = str.lastIndexOf("a");
        System.out.println(idxA2);

        String str2 = "Kara kara düşünme Ankara";
        int idxKara = str2.indexOf("kara");
        System.out.println(idxKara);
        int idxKara2 = str2.lastIndexOf("kara");
        System.out.println(idxKara2);

        //             012345678910
        String str3 = "Mississippi";
        int idxChar = str3.indexOf('i');
        int idxChar2 = str3.lastIndexOf("i");
        System.out.println("İlk İndex: " + idxChar +"\nSon İndex: " + idxChar2);
        System.out.println(" ");

        int x = str3.indexOf("iss");
        int y = str3.lastIndexOf("iss");
        System.out.println("İlk Görünümün İlk Karakteri: " + x +"\nSon Görünümün İlk Karakteri: " + y);

        //Ex 1: Bir Stringteki bir karakterin tekrarlı veya tekrarsız olup omadığını gösteren kodu yazınız.
        //"Hello"  H= Tekrarsız      e= Tekrarsız       l= Tekrarlı      o= Tekrarlı

        String t = "Helloooo";
        char c = 'H';
        if(t.indexOf(c)==t.indexOf(c)){
            System.out.println("Tekrarsız");
        }else {
            System.out.println("Tekrarlı");
        }

        //          01234567
        String u = "Learn Java Earn Money";
        int sonuc = u.indexOf("a",6);
        System.out.println("İlk 6 karakteri geçtikten sonraki (a'nın) index(i): " + sonuc);

        //last indexOf() iki parametre ile kullanılırsa ikinci parametrede verilen sayıyıindex olarak kabul edip
        //en baştan bu indexe kadar olan karakterleri kutuya aliniz. ve lastindexof() methodunu sadce
        //kutu içindeki string için kullaniniz.

        String m = "Hello everyone!";
        int e = m.lastIndexOf("e", 7);
        System.out.println(e);


        String v = " ";
        //isEmpty Merhodu bir Stringin boş olup olmadığını kontrol eder.
        // Eğer stringre hiç karakter yoksa isEmpty methodu True return eder.
        // length()==0 demek isEmpty true verir demektir. Bunu kullanmayın çünkü iki iş yapıyor.

        boolean vControl = v.isEmpty();
        System.out.println(vControl);

        String k = " ";
        //isBlank() hem boş string hem de sadece space[birden fazla olabilir] içeren Stringler için true return eder.
        boolean blankMi = k.isBlank();
        System.out.println(blankMi);

        //Ex 2: Kullanıcıdan alınan isim mutlaka spaceten farklı en az 1 karakter içermelidir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen İlk İsminizi Giriniz");
        String ilkİsim = scan.nextLine();
        if (ilkİsim.isBlank()){
            System.out.println("Sana İsmini Gir Dedim..");
        }else {
            System.out.println(ilkİsim);
        }






    }
}
