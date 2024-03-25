package fi.arcada.codechallenge;

public class Statistics {

    public static double calcMean(double[]values){

            double sum = 0;
            for (double value : values) {
                sum += value;
            }
            return sum / values.length;
        }
    }

