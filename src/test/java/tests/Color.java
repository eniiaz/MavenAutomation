package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Color {

    @BeforeAll
    public static void welcome(){
        System.out.println("The beginning of all tests");
    }


    @BeforeEach
    public void setup(){
        System.out.println("Setting up the environment for test: BeforeEach");
    }


    @Test
    public void login(){
        System.out.println("Logging in to App");
    }

    @Test
    public void signUp(){
        System.out.println("Signing up for the App");
    }

    @Test
    public void filterVerification(){
        System.out.println("Verifying the filter of the App");
    }
}
