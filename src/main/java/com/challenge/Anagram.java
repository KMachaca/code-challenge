package com.challenge;

public class Anagram {
    Word orderedWord1; 
    Word orderedWord2; 

    public Anagram (Word orderedWord1, Word orderedWord2){
        this.orderedWord1 = orderedWord1;
        this.orderedWord2 = orderedWord2;
    }

    public boolean compareLength (){
        if (orderedWord1.length() == orderedWord2.length()) {
            System.out.println("same lenght " + orderedWord1.length() + orderedWord2.length());
            return true;
        } else {
            System.out.println("different lenght " + orderedWord1.length() + orderedWord2.length());
            return false;
        }
    }

    public void compareEachLetter (){
        boolean flag = false;
        for (int i = 0; i < orderedWord1.length(); i++) {
            char characterWord1 = orderedWord1.getLetters().get(i);
            char characterWord2 = orderedWord2.getLetters().get(i);
            if (Character.compare(characterWord1, characterWord2) != 0) {
                System.out.println(characterWord1 + " compare " + characterWord2);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("The words are anagrams.");
        } else {
            System.out.println("The words are not anagrams.");
        }
    }

    public void compareWords (){
        if (compareLength()) {
            compareEachLetter();
        } else {
            System.out.println("The words are not anagrams.");
        }
    }

}
