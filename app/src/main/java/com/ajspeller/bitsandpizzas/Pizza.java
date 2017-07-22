package com.ajspeller.bitsandpizzas;

/**
 * Created by ny2va on 7/22/2017.
 */

public class Pizza {
    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("Funghi", R.drawable.funghi)
    };
    private String name;
    private int imageResourceId;


    public Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

}
