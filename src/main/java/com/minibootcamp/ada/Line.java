package com.minibootcamp.ada;

public class Line {

    public static double calculateLength(int x1, int y1, int x2, int y2) {
        if (x1 == 0 && x2 == 0 && y1 != y2) {
            return Math.abs(y2 - y1);
        } else if (y1 == 0 && y2 == 0 && x1 != x2) {
            return Math.abs(x2 - x1);
        }

        return 0.0;
    }
}
