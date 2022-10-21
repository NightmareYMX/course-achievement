package com.school.course_achievement.utils;

public abstract class DegreeUtils {
    public double maxDegree(double...args) {
        double max = args[0];
        for (double element: args) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public double minDegree(double...args) {
        double min = args[0];
        for (double element: args) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public double avgDegree(double...args) {
        double sum = 0;
        for (double element: args) {
            sum += element;
        }
        return sum/args.length;
    }
}
