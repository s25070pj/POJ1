package com.company;

import java.util.LinkedList;

public class Pizza {
    private int spiciness;
    private String name;
    private String elements;
    private int numberOfElements;

    private String size;
    private int price;
    private LinkedList<String> ingredients = new LinkedList<String>();
    private int delivery;

   public Pizza(){

    }



    public Pizza(int spiciness, String name, String elements, int numberOfElements, int price){

        this.spiciness = spiciness;
        this.name = name;
        this.elements = elements;
        this.numberOfElements = numberOfElements;
        ingredients.add("szynka");
        ingredients.add("cebula");
        ingredients.add("pieczarki");
        ingredients.add("ananas");
        ingredients.add("kukurydza");
        ingredients.add("czosnek");
        ingredients.add("chilli");
        this.price = price;
    }

    public int getSpiciness(){
        return this.spiciness;
    }
    public String getSize(){
        return this.size;
    }
    public int getPrice(){
        return this.price;
    }
    public int getNumberOfElements(){
        return this.numberOfElements;
    }
    public String getElements(){
        return this.elements;
    }
    public String getName(){
        return this.name;
    }
    public LinkedList<String> getIngredients() {
        return ingredients;
    }
    public int getDelivery(){
        return this.delivery;
    }

    public void setSpiciness(int spiciness) {
        this.spiciness = spiciness;
    }

    public void setElements(String elements) {
        this.elements = elements;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDelivery(int delivery) {this.delivery = delivery;}


    public String Podsumowanie() {
        return "Pizza{" +
                "spiciness=" + spiciness +
                ", size=" + size +
                ", price=" + price +
                ", elements='" + elements + '\'' +
                ", name='" + name + '\'' +
                ", numberOfElements=" + numberOfElements +
                '}';
    }
}
