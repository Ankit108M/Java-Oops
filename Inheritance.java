
    // Parent class
    class Dad {
        String car = "Honda City";
        String house = "2BHK Flat";
    }

    // Child class
    class Son extends Dad {
        String bike = "Yamaha R15";
    }

    // Main class
    public class Inheritance {
        public static void main(String[] args) {
            // Create Son object
            Son mySon = new Son();

            // Accessing inherited properties from Dad
            System.out.println("Son got car: " + mySon.car);
            System.out.println("Son got house: " + mySon.house);

            // Accessing Son's own property
            System.out.println("Son has bike: " + mySon.bike);
        }
    }


