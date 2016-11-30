package io.github.othman853.menu;


public class Menu {

    private final String greeting;

    public Menu(String greeting) {
        this.greeting = greeting;
    }

    public String show() {
        return greeting;
    }
}
