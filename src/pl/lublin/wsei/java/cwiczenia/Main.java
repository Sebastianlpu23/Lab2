package pl.lublin.wsei.java.cwiczenia;


import static pl.lublin.wsei.java.cwiczenia.StrongPasswordGenerator.Generate;

public class Main {

    public static void main(String[] args) {


        for (int i = 0; i < 7; i++)
        { Generate(20, true,true,true,true,"!@#$%^&*()");
            System.out.print("\n"); }
    }}