package OOPs;
import java.util.Scanner;

class Car {
    // Private attributes
    private String carNum;
    private int carQuan;
    private String carModel;
    private double carOnRoadPrice;

    // Parameterized constructor in the sequence of attributes
    public Car(String carNum, int carQuan, String carModel, double carOnRoadPrice) {
        this.carNum = carNum;
        this.carQuan = carQuan;
        this.carModel = carModel;
        this.carOnRoadPrice = carOnRoadPrice;
    }

    // Getter and Setter methods
    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public int getCarQuan() {
        return carQuan;
    }

    public void setCarQuan(int carQuan) {
        this.carQuan = carQuan;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getCarOnRoadPrice() {
        return carOnRoadPrice;
    }

    public void setCarOnRoadPrice(double carOnRoadPrice) {
        this.carOnRoadPrice = carOnRoadPrice;
    }

    // Method to find the car with the minimum on-road price
    public static Car findMinOnRoadPrice(Car[] cars) {
        if (cars == null || cars.length == 0) {
            return null;
        }

        Car minPriceCar = cars[0];
        for (Car car : cars) {
            if (car.getCarOnRoadPrice() < minPriceCar.getCarOnRoadPrice()) {
                minPriceCar = car;
            }
        }
        return minPriceCar;
    }

    // Method to search for a car model
    public static Car searchCarModel(Car[] cars, String model) {
        if (cars == null || cars.length == 0 || model == null || model.isEmpty()) {
            return null;
        }

        for (Car car : cars) {
            if (car.getCarModel().equalsIgnoreCase(model)) {
                return car;
            }
        }
        return null;
    }
}

public class OOPs1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of car objects
        System.out.print("Enter the number of car objects: ");
        int numberOfCars = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Car[] cars = new Car[numberOfCars];

        // Loop to take input for each car object
        for (int i = 0; i < numberOfCars; i++) {
            System.out.println("\nEnter details for car " + (i + 1) + ":");

            // Taking user input for carNum
            System.out.print("Enter car number: ");
            String carNum = scanner.nextLine();

            // Taking user input for carQuan
            System.out.print("Enter car quantity: ");
            int carQuan = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            // Taking user input for carModel
            System.out.print("Enter car model: ");
            String carModel = scanner.nextLine();

            // Taking user input for carOnRoadPrice
            System.out.print("Enter car on-road price: ");
            double carOnRoadPrice = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            // Create an instance of Car with user input and store it in the array
            cars[i] = new Car(carNum, carQuan, carModel, carOnRoadPrice);
        }

        // Display the details of each car
        System.out.println("\nCar Details:");
        for (int i = 0; i < numberOfCars; i++) {
            System.out.println("\nDetails of car " + (i + 1) + ":");
            System.out.println("Car Number: " + cars[i].getCarNum());
            System.out.println("Car Quantity: " + cars[i].getCarQuan());
            System.out.println("Car Model: " + cars[i].getCarModel());
            System.out.println("Car On-Road Price: " + cars[i].getCarOnRoadPrice());
        }

        // Find and display the car with the minimum on-road price
        Car minPriceCar = Car.findMinOnRoadPrice(cars);
        if (minPriceCar != null) {
            System.out.println("\nCar with the minimum on-road price:");
            System.out.println("Car Number: " + minPriceCar.getCarNum());
            System.out.println("Car Quantity: " + minPriceCar.getCarQuan());
            System.out.println("Car Model: " + minPriceCar.getCarModel());
            System.out.println("Car On-Road Price: " + minPriceCar.getCarOnRoadPrice());
        } else {
            System.out.println("\nNo cars available to find the minimum on-road price.");
        }

        // Search for a car model
        System.out.print("\nEnter the car model to search: ");
        String searchModel = scanner.nextLine();
        Car searchResultCar = Car.searchCarModel(cars, searchModel);
        if (searchResultCar != null) {
            System.out.println("\nCar found:");
            System.out.println("Car Number: " + searchResultCar.getCarNum());
            System.out.println("Car Quantity: " + searchResultCar.getCarQuan());
            System.out.println("Car Model: " + searchResultCar.getCarModel());
            System.out.println("Car On-Road Price: " + searchResultCar.getCarOnRoadPrice());
        } else {
            System.out.println("\nCar model not found.");
        }

        scanner.close();
    }
}
