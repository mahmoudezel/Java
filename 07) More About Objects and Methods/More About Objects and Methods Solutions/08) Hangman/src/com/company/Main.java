package com.company;

class Hangman {
    private final String secretWord;
    private String disguisedWord;
    private int numberOfGuesses;
    private int numberOfIncorrectGuesses;

    Hangman(String secretWord, String disguisedWord) {
        this.secretWord = secretWord;
        this.disguisedWord = disguisedWord;
        this.numberOfGuesses = 0;
        this.numberOfIncorrectGuesses = 0;
    }

    public void makeGuess(char c) {
        if (secretWord.indexOf(c) != -1) {
            for (int i = 0; i < secretWord.length(); i++) {
                if (disguisedWord.charAt(i) == '?' && secretWord.charAt(i) == c)
                    disguisedWord = disguisedWord.substring(0, i) + c + disguisedWord.substring(i + 1);
            }
        } else
            numberOfIncorrectGuesses++;
        numberOfGuesses++;
    }

    public String getDisguisedWord() {
        return disguisedWord;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public int getGuessCount() {
        return numberOfGuesses;
    }

    public boolean isFound() {
        return disguisedWord.indexOf('?') == -1;
    }
}

public class Main {

    public static void main(String[] args) {
        Hangman hangman = new Hangman("abracadabra", "ab?a?a?ab?a");
        System.out.printf("%s\n", hangman.getDisguisedWord());
        hangman.makeGuess('r');
        System.out.printf("%s\n", hangman.getDisguisedWord());
        hangman.makeGuess('c');
        System.out.printf("%s\n", hangman.getDisguisedWord());
        hangman.makeGuess('d');
        System.out.printf("%s\n", hangman.getDisguisedWord());
        System.out.printf("%s\n", hangman.isFound());
        System.out.printf("%s\n", hangman.getGuessCount());
    }
}