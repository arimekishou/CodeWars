package com;

import java.util.Arrays;

public class Average {
    static boolean betterThanAverage(final int[] classPoints, final int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }
}
