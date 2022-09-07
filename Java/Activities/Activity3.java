package com.ibm.activities;

public class Activity3 {

    public static void main(String[] args) {
        double seconds = 1000000000;

        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;

        double EarthYears = seconds / EarthSeconds;
        double MercuryYears = MercurySeconds * EarthYears;
        double VenusYears = VenusSeconds * EarthYears;
        double MarsYears = MarsSeconds * EarthYears;
        double JupiterYears = JupiterSeconds * EarthYears;
        double SaturnYears = SaturnSeconds * EarthYears;
        double UranusYears = UranusSeconds * EarthYears;
        double NeptuneYears = NeptuneSeconds * EarthYears;

        System.out.println("Mercury Years: " + MercuryYears);
        System.out.println("Venus Years: " + VenusYears);
        System.out.println("Earth Years: " + EarthYears);
        System.out.println("Mars Years: " + MarsYears);
        System.out.println("Jupiter Years: " + JupiterYears);
        System.out.println("Saturn Years: " + SaturnYears);
        System.out.println("Uranus Years: " + UranusYears);
        System.out.println("Neptune Years: " + NeptuneYears);
    }
}
