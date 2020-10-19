package com.jesse.test;

public class Walls {

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