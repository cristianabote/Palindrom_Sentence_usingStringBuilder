package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// implementează o metodă (i.e. isPalindromIgnoreCasePRO(String)) care determină dacă o propoziție este palindrom,
        // ignorând diferențele de litere mari / mici și toate caracterele care nu sunt litere.
        // Metoda va returna true dacă șirul de caractere este palindrom, sau false în caz contrar.

        System.out.println("The sentence *red is a color* is a Palindrom: "+isPalindromIgnoreCasePRO("red is a color"));
        System.out.println("The sentence *red is id er* is a Palindrom: "+isPalindromIgnoreCasePRO("red is id er"));
        System.out.println("The sentence *Red rum, sir, is murder!* is a Palindrom: "+isPalindromIgnoreCasePRO("Red rum, sir, is murder!"));
        System.out.println("The sentence *Was it a cat I saw* is a Palindrom: "+isPalindromIgnoreCasePRO("Was it a cat I saw?"));

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the sentence: ");
        String sentence = scan.nextLine();
        System.out.println("The sentence *"+sentence+"* is a Palindrom: "+isPalindromIgnoreCasePRO(sentence));
    }
    public static boolean isPalindromIgnoreCasePRO(String sentence){
        String lowerCaseSentence=sentence.toLowerCase();

        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0; i<lowerCaseSentence.length(); i++){
            if(Character.isLetter(lowerCaseSentence.charAt(i))){
                stringBuilder.append(lowerCaseSentence.charAt(i));
            }
        }
        String onlyLetters=stringBuilder.toString();
        String reverseOnlyLetters=stringBuilder.reverse().toString();
        if (onlyLetters.equals(reverseOnlyLetters)){
            return true;
        }
        return false;
    }
}
