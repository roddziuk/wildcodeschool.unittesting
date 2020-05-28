package fr.wildcodeschool.unittesting;

public class StringUtils {
    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */

    public static String vowels(String candidate) {

        if (candidate.equals(null)) {
            throw new NullPointerException("Exception: candidate is null!");
        }

        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {

            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
            }
        }
        return vowels;
    }


    public static String uniqueVowels(String candidate) {

        if (candidate.equals(null)) {
            throw new NullPointerException("Exception: candidate is null!");
        }
        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length() ; i++) {

            if (ALL_VOWELS.indexOf(letters[i]) >= 0 && vowels.indexOf(letters[i]) == -1) // check if a char already exist,
                // if not exist then return -1
            {
                vowels += letters[i];
            }
        }
        return vowels;
    }
}




