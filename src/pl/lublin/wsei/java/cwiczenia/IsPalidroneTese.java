package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class IsPalidroneTese {

    public static class StringFun {

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            do{
                System.out.print("Podaj tekst do sprawdzenia (0, jak Ci sie znudzi): ");
                String tekst = scn.next();
                if (tekst.equals("0")) break;
                System.out.print("Tekst: " + tekst + " " +
                        (pl.lublin.wsei.java.cwiczenia.mylib.StringFun.isPalidroneTese(tekst) ? "" : "nie") +
                        "jest palindromem");

            }while (true);
        }
    }
}
