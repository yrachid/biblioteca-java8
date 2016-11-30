package io.github.othman853;

import io.github.othman853.menu.Menu;
import org.junit.Test;

import static org.junit.Assert.*;


public class MenuTest {

    Menu menu = new Menu("Greetings");

    @Test
    public void executeShouldReturnAGreeting() throws Exception {
        assertEquals("Greetings", menu.show());
    }
}