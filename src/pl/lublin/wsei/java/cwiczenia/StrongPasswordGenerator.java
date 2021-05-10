package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Random;

public class StrongPasswordGenerator {
    public StrongPasswordGenerator(int i,
                                   boolean b,
                                   boolean b1,
                                   boolean b2,
                                   boolean b3, String s) {

    }

    public StrongPasswordGenerator() {

    }

    public static void Generate(int dlugosc, boolean maleLitery, boolean wielkieLitery, boolean cyfry, boolean znakiSpecjalne, String dozwoloneZnakiSpecjalne) {
        Random random = new Random();
        String haslo = "";
        for (int i = 0; i < dlugosc; i++)
        {
            if (maleLitery)
            {
                haslo += LosowaMalaLitera();
            }
            if (wielkieLitery)
            {
                haslo += LosowaWielkaLitera();
            }
            if (cyfry)
                haslo += LosowaCyfra();
            if(znakiSpecjalne)
            {
                int lenght = dozwoloneZnakiSpecjalne.length();
                int ran = random.nextInt(lenght);

                char znakiSpecjalneChar[] = dozwoloneZnakiSpecjalne.toCharArray();

                haslo += znakiSpecjalneChar[ran];

            }
        }   StringFun.Shuffle(haslo);
        haslo = haslo.substring(0, dlugosc);
        StringFun.Shuffle(haslo);
        System.out.print(haslo);
    }

    static char LosowaMalaLitera() {
        Random random = new Random();

        String maleLitery = "qwertyuiopasdfghjklzxcvbnm";
        char maleLiteryChar[] = maleLitery.toCharArray();
        int maleLiteryLenght = maleLitery.length();

        int ran = random.nextInt(maleLiteryLenght);
        return maleLiteryChar[ran];
    }

    static char LosowaWielkaLitera() {
        char lWL = LosowaMalaLitera();
        return Character.toUpperCase(lWL);
    }

    static char LosowaCyfra() {
        Random random = new Random();

        String cyfry = "1234567890";
        char cyfryChar[] = cyfry.toCharArray();
        int cyfryLenght = cyfry.length();

        int ran = random.nextInt(cyfryLenght);
        return cyfryChar[ran];
    }

    public String generate() {
        return null;
    }
}