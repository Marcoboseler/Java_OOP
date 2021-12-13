package com.acme.utils;

public class ConversionService {

    public static double kilogramToPounds = 2.2046;
    public static int kilogramToGrams = 1000;
    public static double kilogramToOunces = 35.274;

    public static float literToFluidOunce = 33.814f;
    public static float literToGallon = 0.2642f;
    public static float literToPints = 2.1134f;
    public static short litertoMilliliters = 1_000;

    public static double pounds(double kilograms) {
        return kilograms * kilogramToPounds;
    }

    public static int grams(int kilograms) {
        return kilograms * kilogramToGrams;
    }

    public static double ounces(double kilograms) {
        return kilograms * kilogramToOunces;
    }

    public static float fluidOunces(float liters) {
        return liters * literToFluidOunce;
    }

    public static float gallons(float liters) {
        return liters * literToGallon;
    }

    public static float pints(float liters) {
        return liters * literToPints;
    }

    public static int milliliters(int liters) {
        return liters * litertoMilliliters;
    }
}
