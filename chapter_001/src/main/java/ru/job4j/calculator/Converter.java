package ru.job4j.calculator;

/**
 * Корвертор валюты.
 */
public class Converter {
    private int result;
    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    int Usd = 60;
    int Eu = 70;

    public int rubleToEuro(int value) {
        this.result = value / Eu;
        return this.result;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        this.result = value / Usd;
        return this.result;
    }

    /**
     * Конвертируем евро в рубли.
     *
     * @param value рубли.
     * @return Доллоры
     */
    public int dollarToRuble(int value) {
        this.result = value * Usd;
        return this.result;
    }

    /**
     * Конвертируем доллары в рубли.
     *
     * @param value рубли.
     * @return Доллоры
     */
    public int euroToRuble(int value) {
        this.result = value * Eu;
        return this.result;
    }
}
