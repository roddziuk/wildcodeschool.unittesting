package fr.wildcodeschool.unittestingTest;
import fr.wildcodeschool.unittesting.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testNullPointerException () {
        String candidate = null;
        Assertions.assertThrows(NullPointerException.class, ()->StringUtils.vowels(candidate));
    }

    @Test
    public void testMissingLetter() {
        String missingVowel = "ymami";
        Assertions.assertEquals("yai",StringUtils.vowels(missingVowel));
    }
    @Test
    public void testEmptyWord() {
        String emptyWord = "";
        Assertions.assertEquals("",StringUtils.uniqueVowels(emptyWord));
    }
    @Test
    public void testTwoWordsDoubleVowel() {
        String twoWords = "coach ella";
        Assertions.assertEquals("oae",StringUtils.uniqueVowels(twoWords));
    }
    @Test
    public void testNoVowel() {
        String noVowel ="mmqhrk";
        Assertions.assertEquals("",StringUtils.uniqueVowels(noVowel));
    }
    @Test
    public void testVowelsOnly () {
        String vowelsOnly = "aooaoaoeeiiYY";
        Assertions.assertEquals("aoeiY",StringUtils.uniqueVowels(vowelsOnly));
    }
}
