// creating a class EarthVolume to compute volume of Earth
class EarthVolume {
    public static void main(String[] args) {

        // Taking radius of Earth in kilometers
        double radiusKm = 6378;

        // Value of pi
        double pi = 3.14159;

        // Calculating volume in cubic kilometers
        long volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

        // Converting radius from kilometers to miles
        double radiusMiles = radiusKm * 0.621371; //// converted radiusKm to radiusMiles

        // Calculating volume in cubic miles
        long volumeMiles = (4.0 / 3.0) * pi * radiusMiles * radiusMiles * radiusMiles;

        // Displaying the result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
