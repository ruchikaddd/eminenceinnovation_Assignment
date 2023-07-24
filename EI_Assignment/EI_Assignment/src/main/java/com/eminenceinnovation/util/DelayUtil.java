package com.eminenceinnovation.util;

import java.util.Random;

public class DelayUtil {
    public static void introduceDelay() {
        try {
            int delay = new Random().nextInt(4000) + 3000; // Random delay between 3 to 6 seconds
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

