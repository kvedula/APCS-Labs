/*
 * Kamesh Vedula
 * Time: 1hr 10min
 * Description: This lab was really fun to do. All that took time was calling the methods
 * in the driver class. Other than that making the constructors and the getter and setter 
 * methods. This took not too much time and was enjoyable creating your own two methods. 
 * 
 */


class P3_Vedula_Kamesh_VirtualFriend {


    // Attributes
    
    private String myName;
    private int myAge;
    private int myFood; // range: 0-3 (0 is starving, 3 is full)
    private String myFavColor;


    // Constructors:
    
    P3_Vedula_Kamesh_VirtualFriend() {
        myName = "Larry";
        myAge = 5;
        myFood = 2;
    }   

    P3_Vedula_Kamesh_VirtualFriend(String newName, int newAge) {
        myName = newName;
        myAge = newAge;
        myFood = 2;
    }
    
    P3_Vedula_Kamesh_VirtualFriend(String newName, int newAge, String newFavColor) {
        myName = newName;
        myAge = newAge;
        myFavColor = newFavColor;
        myFood = 3;
    }

    // Getter and Setter Methods:
    
    String getName() {
        return myName;
    }

    void setName(String newName) {
        myName = newName;
    }
    
    int getAge() {
        return myAge;
    }

    void setAge(int newAge) {
        myAge = newAge;
    }
    
    String getFavColor() {
        return myFavColor;
    }

    void setFavColor(String newFavColor) {
        myFavColor = newFavColor;
    }
 

    // Other Methods

    int add(int a, int b) {
        return a + b;
    }

    void printName() {
        System.out.println("My name is " + myName);
    }
    
    
    void printFavoriteColor(){
        System.out.println("My favorite color is " + myFavColor);
    }
    
    void playSoccer(){
        System.out.println("Lizzy is playing soccer! Whee!");
        increaseHunger();
    }
    
    void greet(P3_Vedula_Kamesh_VirtualFriend other) {
        String friendName = other.getName();
        System.out.print("Hi there " + friendName + ". ");
        System.out.print("It's nice to meet you.  My name is " + myName + ".\n");
    }
    
    void goRun(){
        System.out.println(myName + " is out for a run! WooHooooo!");
        increaseHunger();
    }
    
    void dance(){
        System.out.println(myName + " is dancing. She is getting her move on!!! WOOOOOO. dun-ts dun-ts dun-ts.");
        increaseHunger();
    }

    void feed() {
        System.out.print("Feeding " + myName + "...");
        if (myFood < 3) {
            System.out.print("<<Munch munch>> ");
            myFood = myFood + 1;
        }
        else {
            System.out.print("No thanks.  I'm full.");
        }
        printHungerLevel();
    }

    void sleep() {
        System.out.println(myName + " is sleeping...zzzz....");
        increaseHunger();
    }

    void printHungerLevel() {
        switch (myFood) {
            case  0: System.out.println("I'm starving! Feed me!");
                     break;
            case  1: System.out.println("I'm hungry!");
                     break;
            case  2: System.out.println("I'm a little hungry.");
                     break;
            case  3: System.out.println("I'm full.");
                     break;
            default: System.out.println("Your VirtualFriend has been " + 
                     "given an invalid hunger value...\n");
                     System.out.println("Your VirtualFriend has died!");
                     System.exit(0);
        }
    }

    private void increaseHunger() {
        if (myFood >= 0)
            myFood--;
        else
            System.out.println(myName + " is starving!");
    }

}
