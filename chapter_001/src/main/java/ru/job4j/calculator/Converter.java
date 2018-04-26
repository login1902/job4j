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
    int usd = 60;
    int eu = 70;

    public int rubleToEuro(int value) {

        return value / eu;
       }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {

        return value / usd;
        }

    /**
     * Конвертируем евро в рубли.
     *
     * @param value рубли.
     * @return Доллоры
     */
    public int dollarToRuble(int value) {
        return value * usd;
        }

    /**
     * Конвертируем доллары в рубли.
     *
     * @param value рубли.
     * @return Доллоры
     */
    public int euroToRuble(int value) {

        return value * eu;
        }
}
