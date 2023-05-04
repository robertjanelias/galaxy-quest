package nl.eliascc.galaxyquest.challenge1;

import nl.eliascc.galaxyquest.Stage1;

public class LaunchTheRocket {
    public static void main(String[] args) throws Exception {
        Stage1.run(LaunchTheRocket::calculateNewSpeed);
    }

    /*
     * For the rocket to launch properly we need the method below to calculate the new speed
     * based on the current speed, acceleration and elapsed time.
     *
     * Complete the method below and run the main method.
     * HINT: be aware of the different measurement units.
     */

    /**
     Calculate (and return) the new speed (km/h) based on acceleration and time difference

     @param currentSpeed     km/h
     @param acceleration     m/s^2
     @param deltaTime        millisec

     @return newSpeed        km/h
     */
    private static double calculateNewSpeed(double currentSpeed, double acceleration, int deltaTime) {
        //
        //  Add your code here!
        //
        return 0;
    }
}