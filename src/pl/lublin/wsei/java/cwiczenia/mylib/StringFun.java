package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class StringFun {

    public static Object Shuffle(String sentence) {
        Random random = new Random();

        int lenght;
        int lenght2 = sentence.length();
        char charSentence[];
        String shuffledSentence = "";
        int randomizedNumber;

        for (int i = 0; i < lenght2; i++) {
            lenght = sentence.length();
            randomizedNumber = random.nextInt(lenght);
            if (randomizedNumber == 0) randomizedNumber++;
            charSentence = sentence.toCharArray();

            shuffledSentence = shuffledSentence + charSentence[randomizedNumber - 1];

            sentence = sentence.substring(0, randomizedNumber - 1) + sentence.substring(randomizedNumber, lenght);

            return shuffledSentence;
        }
        return null;
    }
}