package stringMethods;

import utilities.ScannerHelper;

public class _12_contains {
    public static void main(String[] args) {

        /*
        Ask user to enter an address
        If address contains "chicago" in any way, then print "You are in the club"
        else, print "You are not in the club"

        Chicago, CHICAGO, cHIcaGO
         */

        String address = ScannerHelper.getAStringFromUser();
        System.out.println(address.toLowerCase().contains("chicago") ? "You are in the club" : "You are not in the club");
    }
}
