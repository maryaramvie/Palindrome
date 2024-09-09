/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.palindrome.business;

/**
 * This class defines methods for the project.
 * @author Mariana Arámbula
*/
public class Palindrome {
    
    
    /**
     * Checks if the given phrase is a palindrome.
     * @param phrase The phrase to check.
     * @return True if the phrase is a palindrome, False otherwise.
     */
    public boolean isPalindrome(String phrase){
        
        /* 
        NOTE TO MYSELF:
        
        [^a-zA-Z0-9]: This expression removes all non-alphanumeric characters.
        
        [^]: his symbol at the beginning of a character set within 
        square brackets inverts its meaning. Instead of matching 
        the characters inside the set, it will match any character 
        that is NOT inside that set.
        
        a-z, A-Z, 0-9: These ranges represent all lowercase letters, 
        uppercase letters, and digits from 0 to 9, respectively.
        */
        try {
            
            String cleanedPhrase = phrase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            char[] characters = cleanedPhrase.toCharArray();

            for (int i = 0, length = characters.length - 1; i < length; i++, length--) {
                if (characters[i] != characters[length]) {
                    return false;
                }
            } 
            return true;
            
        } catch (Exception e){
            System.err.println("An error has ocurred: " + e.getMessage());
            return false;
        }
        
        }
    }

    


    // This is the example seen in class, please ignore.
    
    /**
     * Suma dos números enteros.
     * @param a El primer número a sumar.
     * @param b El segundo número a sumar.
     * @return Resultado de la suma de los dos valores ingresados.
     */
    /*
    public int sumar(int a, int b){
        return a+b;
    }*/