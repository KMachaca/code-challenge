package com.challenge;

import java.util.ArrayList;
import java.util.List;

public class Word {
    public String content;
    List<Character> letters = new ArrayList<>();

    public Word(String word) {
        this.content = word;
    }

    public boolean containsOnlyLetters (){
        int letterCount = 0;
        for (int i = 0; i < content.length(); i++) {
            char character = content.charAt(i);
            if (Character.isLetter(character)) {
                letterCount++;
            }
        }
        if (letterCount == content.length()) {
            return true;
        }else{
            return false;
        }
    }

    public void stringToListConversion(){
        for (char letter : content.toCharArray()) {
            letters.add(letter);
        }
        System.out.println(letters);
    }

    public void validation(){
        if (containsOnlyLetters()) {
            stringToListConversion();
        }else{
            System.out.println("You must enter a valid word (only with uppercase or lowercase letters, no spaces, no special characters).");
        }
    }

}
