package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

class IsPalindromeTest {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nWprowadź tekst do wylosowania litery," + "aby zakonczyć wprowadź  '0' ");
            String sentence = scanner.nextLine();
            if (sentence.equals("0")) break;
            System.out.print(StringFun.Shuffle(sentence));
        }
        while (true);
        return;

    }
}