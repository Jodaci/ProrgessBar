package main.java.net.jodaci.ProgressBar;

import com.sun.glass.ui.Application;

import static main.java.net.jodaci.ProgressBar.utils.barProgress.barProgress;

public class ProgressBar {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        for (int i = 0; i <= 10; i ++) {
            barProgress(i, 10);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
