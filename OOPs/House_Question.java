//PRA question 3
//Question: You have to create a class "House" with houseId(int), houseAddres(String), hosuePin(int), housePrice(double) and you have to encapsulate these. Now you have to create 2 method to find the average price of given house address and search a house details with a given house pin.
import java.util.*;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  //How many object you want to create
        ArrayList<House> arr = new ArrayList<>();
      
      //Taking inputs and creating the object and pushing them into ArrayList
        for(int i=0; i<num; i++){
            int id = sc.nextInt();  //Input houseID
            sc.nextLine();  
            String address = sc.nextLine();  //Input houseAddress
            int pin = sc.nextInt();  //Input housePin
            double price = sc.nextDouble();  //Input hosuePrice
            House obj = new House(id, address, pin, price);  //Creating Object
            arr.add(obj);  //Pushing object into ArrayList
        }
        sc.nextLine();
        String str = sc.nextLine();  //Taking the address input for search the average price
        int searchPin = sc.nextInt();  //Taking the pin input to search the house details

      //Calling first method
        double avg = fintTheAveragePriceForHouseInASpecificAddress(arr, str);
        if(avg == -1)   System.out.println("No House Found");
        else    System.out.println("Average: " + avg);

      //Calling the second method
        House searchedPin =  findHouseBasedOnPin(arr, searchPin);
        if(searchedPin == null)   System.out.println("No House Found");
        else{
            System.out.println("Id: " + searchedPin.getHouseId());
            System.out.println("Address: " + searchedPin.getHouseAddress());
            System.out.println("Price: " + searchedPin.getHousePrice());
        }
    }

  //First Method
    static double fintTheAveragePriceForHouseInASpecificAddress(ArrayList<House> arr, String str){
        double count = 0, sum = 0;
        for(House i: arr){
            if(i.getHouseAddress().equals(str)){
                count++;
                sum = sum + i.getHousePrice();
            }
        }
        if(count == 0)  return -1;
        return sum/count;
    }

  //Second Method
    static House findHouseBasedOnPin(ArrayList<House> arr, int searchPin){
        for(House i: arr){
            if(i.getHousePin() == searchPin)    return i;
        }
        return null;
    }
}

//Creating the class
class House{
    private final int houseId;
    private final String houseAddress;
    private final int housePin;
    private final double housePrice;

  //Creating the constructor
    House(int id, String address, int pin, double price){
        this.houseId = id;
        this.houseAddress = address;
        this.housePin = pin;
        this.housePrice = price;
    }

  //Creating the Getter methods
    int getHouseId(){
        return this.houseId;
    }
    String getHouseAddress(){
        return this.houseAddress;
    }
    int getHousePin(){
        return this.housePin;
    }
    double getHousePrice(){
        return this.housePrice;
    }
}
