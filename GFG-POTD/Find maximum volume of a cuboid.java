class Solution {

    double maxVolume(double perimeter, double area) {
        // code here
         double length = (perimeter - Math.sqrt(perimeter * perimeter - 24 * area)) / 12;
        double breadth = length;
        double height = (perimeter / 4) - 2 * length;
        return length * breadth * height;
    }
}
