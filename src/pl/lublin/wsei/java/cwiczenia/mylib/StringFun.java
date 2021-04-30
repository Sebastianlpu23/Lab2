package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class StringFun {
    public static boolean isPalidroneTese(String tekst) {
        return true;
    }

    public static String anarchize(String tekst) {
        StringBuilder builder = new StringBuilder();

        boolean nextCase = Character.isUpperCase(tekst.charAt(0));
        nextCase = !nextCase;

        builder.append(tekst.charAt(0));

        for(int i = 1; i < tekst.length(); i++){
            if (nextCase){
                builder.append(Character.toUpperCase(tekst.charAt(i)));
            }else{
                builder.append(Character.toLowerCase(tekst.charAt(i)));
            }
            nextCase = !nextCase;
        }

        return builder.toString();
    }
    public static String camelize(String tekst) {
        String output = "";
        String[] words = tekst.split(" ");

        for(int i=0; i < words.length; i++){
            words[i] = StringUtils.capitalize(words[i]);
            output = StringUtils.join(words);
        }
        return output;
    }

    public static String shufle(String word){


        char[] chartab = word.toCharArray();
        char[] chartabstring = chartab;
        Random rnd = new Random();
        for(int i = 0; i < chartab.length; i++){
            System.out.println();
            chartabstring[i] += chartab[rnd.nextInt(chartab.length-1)];
        }
        String output = new String(chartabstring);
        return output;
    }

}
    
    