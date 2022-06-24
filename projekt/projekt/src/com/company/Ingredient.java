package com.company;

public class Ingredient {
    String ingredientName;
    int ingredientSpiciness;
    int ingredientPrice;

    public Ingredient(){

    }

    public Ingredient(int ingredientPrice, int ingredientSpiciness, String ingredientName){
        this.ingredientPrice = ingredientPrice;
        this.ingredientSpiciness = ingredientSpiciness;
        this.ingredientName = ingredientName;
    }




    public int getIngredientSpiciness() {
        return ingredientSpiciness;
    }

    public int getIngredientPrice() {
        return ingredientPrice;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientPrice(int ingredientPrice) {
        this.ingredientPrice = ingredientPrice;
    }

    public void setIngredientSpiciness(int ingredientSpiciness) {
        this.ingredientSpiciness = ingredientSpiciness;
    }
}
