// package OOPs;

import java.util.*;

public class Food_Question {
    public static void main(String[] args){
        System.out.println("Enter the number of food: ");
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();

        Food[] food = new Food[number];

        for(int i=0; i<number; i++){
            n.nextLine();
            System.out.print("Enter the name of the food: ");
            String food_name = n.nextLine();

            System.out.print("Enter the category of the food: ");
            String food_category = n.nextLine();

            System.out.print("Enter the net weight of the food: ");
            int food_netWeight = n.nextInt();

            System.out.print("Enter the name of the food: ");
            int food_price = n.nextInt();

            food[i] = new Food(food_name, food_category, food_netWeight, food_price);
        }

        n.close();
        for(int i=0; i<number; i++){
            System.out.println("Food name: " + food[i].getName());
            System.out.println("Food Category: " + food[i].getCategory());
            System.out.println("Food net weight: " + food[i].getNetWeight());
            System.out.println("Food price: " + food[i].getPrice() + "\n");
        }

        Food.veg(food);

        System.out.print("\nNon Veg foods: ");
        List<Food> nonVeg = new ArrayList<>();
        nonVeg = Food.nonveg(food);
        for(Food i : nonVeg){
            System.out.println(i.getName() + " ");
        }
    }    
}

class Food{
    private String name;
    private String category;
    private int NetWeight;
    private int price;

    Food(String name, String category, int NetWeight, int price){
        this.name = name;
        this.category = category;
        this.NetWeight = NetWeight;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String newCategory){
        this.category = newCategory;
    }

    public int getNetWeight(){
        return NetWeight;
    }
    public void setNetWeight(int newNetWeight){
        this.NetWeight = newNetWeight;
    }

    public int getPrice(){
        return price;
    }
    public void setName(int newPrice){
        this.price = newPrice;
    }

    public static void veg(Food[] food){
        System.out.println("Veg foods: ");
        for(int i=0; i<food.length; i++){
            if(food[i].getCategory().equalsIgnoreCase("Veg")){
                System.out.print(food[i].getName() + " ");
            }
        }
    }

    public static List<Food> nonveg(Food[] food){
        List<Food> nonVeg = new ArrayList<>();
        for(int i=0; i<food.length; i++){
            if(food[i]!= null && food[i].getCategory().equalsIgnoreCase("NonVeg")){
                nonVeg.add(food[i]);
            }
        }
        return nonVeg;
    }
}
