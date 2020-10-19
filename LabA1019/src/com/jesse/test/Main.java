package com.jesse.test;

public class Main {

    // Field is the term for class members / variables
    // This class can be stateful with static members

//        public static int x = 4;
//
//        // This field cannot be directly accessed, needs some form of encapsulation
//
//        private static int y = 2;
//
//        public static void myMethod(){
//
//            // This is not a field because it's within it's own class. myMethod owns int y.
//
//            int y = 5;
//        }

    // In any OOP compiled language the entry point is the Main method, otherwise its known as scripting language
    // Public is access modifier
    // Static means changing its state.. like a 3 can be a 4 later. Belongs to class implementation.
    //

    public static void main(String[] args) {

            // Creates an instance

        Main myMain = new Main ();

        Main otherMain = new Main();


        System.out.println (myMain.x);
        System.out.println (otherMain.x);



    }
    private static int amountOfWalls = 0;

    private String paintColor;
    private boolean hasWallpaper;

    public Wall(String paintColor, boolean hasWallpaper) {
        this.hasWallpaper = hasWallpaper;
        this.paintColor = paintColor;
        setAmountOfWalls(getAmountOfWalls() + 1);
    }

    public String getPaintColor() {
        return paintColor;
    }

    public boolean getWallpaper() {
        return hasWallpaper;
    }

    public void setPaintColor(String paintColor) {
        this.paintColor = paintColor;
    }
    public void setHasWallpaper(boolean hasWallpaper) {
        this.hasWallpaper = hasWallpaper;
    }

    public static int getAmountOfWalls() {
        return amountOfWalls;
    }

    public static void setAmountOfWalls(int amountOfWalls) {
        Wall.amountOfWalls = amountOfWalls;
    }
}