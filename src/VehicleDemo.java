// A program that uses the Vehicle Class

class Vehicle {
  int passengers; // number of passengers
  int fuelcap; // fuel capacity in gallons
  int mpg; // fuel consumption in miles per gallon

}

class VehicleDemo{
  public static void main(String[] args) {
    Vehicle coupe = new Vehicle(); // create a Vehicle object named coupe
    int range;

    //assign values to fields in coupe
    coupe.passengers = 2;
    coupe.fuelcap = 12;
    coupe.mpg = 35;
    range = coupe.fuelcap * coupe.mpg;

    // state the passenger amount and compute the range of a  coupe assuming a full tank of gas
    System.out.println("A coupe carries " + coupe.passengers + " passengers and can travel "
        + range + " miles on a full tank of gas.");
  }
}
