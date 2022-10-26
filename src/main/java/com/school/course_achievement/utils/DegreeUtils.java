package com.school.course_achievement.utils;

import java.util.List;

public abstract class DegreeUtils {
    public static double highDegree(List<Double> list) {
        double max = list.get(0);
        for (double element: list) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static double lowDegree(List<Double> list) {
        double min = list.get(0);
        for (double element: list) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public static double avgDegree(List<Double> list) {
        double sum = 0;
        for (double element: list) {
            sum += element;
        }
        return sum/list.size();
    }

    public static double lowDegree(double...args) {
        double min = args[0];
        for (double element: args) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
