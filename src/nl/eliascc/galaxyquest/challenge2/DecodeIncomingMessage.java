package nl.eliascc.galaxyquest.challenge2;

import nl.eliascc.galaxyquest.Stage2;

public class DecodeIncomingMessage {
    public static void main(String[] args) throws Exception {
        Stage2.run(DecodeIncomingMessage::decodeMessage);
    }

    /*
     *  Our current speed is much too low, and we will miss our rendezvous with the temporary wormhole
     *  to take as to the other side of the galaxy. Fortunately we received a coded message from mission control
     *  that might solve the issue. But we need to decode it first.
     *
     * Complete the method below to decode the incoming byte array to a string. Then run main().
     * The first byte is the control byte telling you how to handle the following content byte:
     *
     * control byte = 0 : append the following byte (as ASCII character) to the end of the string.
     * control byte = 1 : invert the bits of the following byte and append it (as ASCII) to the end of the string.
     * control byte = 2 : put the following byte (as ASCII) at the front of the string.
     * control byte = 3 : following byte gives an offset to the 'A' ASCII character, append it to the end of the string.
     * control byte = 4 : insert the first following byte (as ASCII) before the first occurrence of the second following
     *                    byte (as ASCII) in the current string.
     *                    e.g. (4, 97, 112) -> insert 'a' (ASCII 97) before first occurrence of 'p' (ASCII 112).
     */

    private static String decodeMessage(byte[] data) {
        //
        //  Add your code here!
        //
        return "";
    }
}
