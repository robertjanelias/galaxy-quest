package nl.eliascc.galaxyquest.challenge3;

import nl.eliascc.galaxyquest.Stage3;

public class SearchAlienShip {
    public static void main(String[] args) throws Exception {
        Stage3.run(SearchAlienShip::detectLocation);
    }

    /*
    * Finally we arrived at the other side of the wormhole in search of new life forms.
    * We are picking up unknown signals that might be of alien origin.
    * Our enhanced radar provides an image but we need to proces the raw data to find a potential alien ship.
    *
    *                                                            x
    * Search for the following 'cross' pattern in the image:    xxx
    *                                                            x
    */

    /**
     Scan the incoming radar image for the pattern above.
      @param radarImage     2-D array, first coordinate is Y (rows), second coordinate is X (columns)
      @return location      int array with 2 values, first value is found Y of alien spaceship, second value is found X

     You can assume that the entire spaceship is visible in the image.
     */
    private static int[] detectLocation(char[][] radarImage) {

        //
        // Add your code here!
        //
        return new int[] { -1, -1 };
    }
}
