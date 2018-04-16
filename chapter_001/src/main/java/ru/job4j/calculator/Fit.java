package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
    private double result;
double height;
        /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        this.result=(height-100)*1.15;
        return this.result;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        this.result=(height-110)*1.15;
        return this.result;
    }
}