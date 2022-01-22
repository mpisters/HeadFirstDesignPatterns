package LifeChangingApp;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(event -> System.out.println("You might regret it"));
        button.addActionListener(event -> System.out.println("Do it!"));
    }

}
