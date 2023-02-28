package sauceDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Blazer {

    @Test
    public void login(){
        System.out.println("Blazer Login test");
    }
    @Tag("ui")
    @Test
    public void signUp(){
        System.out.println("Blazer Sign up test");
    }

    @Tag("ui")
    @BeforeEach
    public void setup(){
        System.out.println("Before Each Blazer");
    }
}
