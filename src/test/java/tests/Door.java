package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Door {

    @Test
    public void testingAddMethod(){
        int expectedResult = 60;
        int actual = add(10, 20, 30);
        Assertions.assertEquals(expectedResult, actual, "Addition method is wrong");
        Assertions.assertEquals(4, add(-1, -5, 10));
    }

    @Test
    public void testingReverse(){
        String actual = reverse("James");
        Assertions.assertEquals("semaJ", actual, "James reverse string failed");

        Assertions.assertEquals("ta", reverse("at"));

        Assertions.assertEquals("a", reverse("a"));
        Assertions.assertEquals("", reverse(""));
        Assertions.assertEquals("jbdrtrjdksldjcndlsna", reverse("ansldncjdlskdjrtrdbj"));


    }

    @Test
    public void cutTest1(){
        String actual = cut("Codewise");
        Assertions.assertEquals("odewis", actual, "Cut method failed");
    }

    @Test
    public void cutTest2(){
        String actual = cut("table ");
        Assertions.assertEquals("abl", actual, "Cut method failed");
    }

    @Test
    public void cutTest3(){
        String actual = cut("t");
        Assertions.assertEquals("t", actual, "Cut method failed");
    }

    @Test
    public void ageVerification(){
        boolean validAge = isValidAge(75);
        Assertions.assertTrue(validAge, "Age validation failed");
    }

    @Test
    public void ageVerificationNegative(){
        boolean validAge = isValidAge(101);
        Assertions.assertFalse(validAge, "Age verification failed for negative test");
    }




    public int add(int a, int b, int c){
        return a+b+c;
    }

    // Create a method that reverses the String
    // james -> semaj
    public String reverse(String word){
        String newWord = "";
        for (int i = word.length()-1; i >= 0; i--){
            newWord+= word.charAt(i);
        }
        return newWord;
    }

    // Create a method that cuts the first and last letter and return the result
    public String cut(String word){
        word = word.trim();
        if (word.length() < 2){
            Assertions.fail("Invalid Input. Please enter word at least with 2 letters");
        }
        String newWord = word.substring(1, word.length()-1);
        return newWord;
    }

    public boolean isValidAge(int age){
        if (age > 0 && age < 101){
            return true;
        }else{
            return false;
        }
    }

}
