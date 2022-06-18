package com.company;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.SortedMap;


public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("PIZZERIA");
        System.out.println("Wybierz jedną z naszych bestsellerów lub stworz wlasnaa");
        System.out.println("1: Wegetariańska (szpinak, pomidor, sos, ser)");
        System.out.println("2: Capriciosa (pieczarki, szynka, sos, ser)");
        System.out.println("3: Pepperoni(salami, papryka, sos, ser)");
        System.out.println("4: Stworz wlasną");
        int pizzaSelection = scanner.nextInt();
        Pizza pizza = new Pizza();


        switch (pizzaSelection) {
            case 1 -> pizza = new Pizza(1, "wegetarianska", "sos, ser, szpinak, pomidor", 4, 25);
            case 2 -> pizza = new Pizza(1, "capriciosa", "sos, ser, pieczarki, szynka", 4, 28);
            case 3 -> pizza = new Pizza(2, "pepperoni", "sos, ser, salami, papryka", 4, 30);
            case 4 -> pizza = new Pizza(0, "wlasna", "sos, ser", 2, 21);
            default -> {
                System.out.println("coś poszlo nie tak");
                System.exit(0);
            }
        }


        System.out.println("Wybierz rozmiar pizzy");
        System.out.println("1: Mała");
        System.out.println("2: Srednia");
        System.out.println("3: Duża");
        int pizzaSize = scanner.nextInt();
        switch (pizzaSize) {
            case 1 -> pizza.setSize("mała");
            case 2 -> pizza.setSize("średnia");
            case 3 -> pizza.setSize("duża");
            default -> {
                System.out.println("coś poszlo nie tak");
                System.exit(0);
            }

        }
        pizza.setPrice(pizza.getPrice() + 5 * pizzaSize - 5);

        LinkedList<Ingredient> ingredient = new LinkedList<Ingredient>();
        ingredient.add(new Ingredient(3, 1, "szynka"));
        ingredient.add(new Ingredient(1, 3, "cebula"));
        ingredient.add(new Ingredient(2, 0, "pieczarki"));
        ingredient.add(new Ingredient(2, 0, "ananas"));
        ingredient.add(new Ingredient(1, 0, "kukurydza"));
        ingredient.add(new Ingredient(1, 3, "czosnek"));
        ingredient.add(new Ingredient(3, 5, "chilli"));

        if (pizza.getName().equals("wlasna")) {
            System.out.println("wpisz składnik ktory chciałbyś dodac do swojej pizzy");
            for(int i = 0; i <= ingredient.size()-1; i++) {
                System.out.println(ingredient.get(i).getIngredientName()+ " - " +ingredient.get(i).getIngredientPrice()+ "zł");
            }
            System.out.println("wpisz \"koniec\" jesli wybrales juz wszystkie składniki");
        }
           // System.out.println();
           // System.out.println("szynka - 3zł");
           // System.out.println("cebula - 1zł");
           // System.out.println("pieczarki - 2zł");
           // System.out.println("ananas - 2zł");
           // System.out.println("kukurydza - 1zł");
           // System.out.println("czosnek - 1zł");
           // System.out.println("chilli - 3zł");



            for(int i = 0; i <= ingredient.size()-1; i++){
                String addElements = scanner.next();
                for (int j = 0; j <= ingredient.size()-1; j++) {
                    if (ingredient.get(j).getIngredientName().equals(addElements)) {
                        System.out.println("Dodano: "+ addElements);

                        pizza.setElements(pizza.getElements() + ", " + addElements);
                        pizza.setSpiciness(pizza.getSpiciness() + ingredient.get(j).getIngredientSpiciness());
                        pizza.setPrice(pizza.getPrice() + ingredient.get(j).getIngredientPrice());
                    }
                    else if(addElements.equals("koniec")){
                        j=j+100;
                        i=i+100;
                    }
                }

                // }
            /*
            for (int i = 0; i <= pizza.getIngredients().size(); i++){
                String addElements = scanner.next();

                switch (addElements) {
                    case "cebula", "czosnek" -> {
                        pizza.setElements(pizza.getElements() + ", " + addElements);
                        pizza.setSpiciness(pizza.getSpiciness() + 1);
                        pizza.setPrice(pizza.getPrice() + 1);
                    }
                    case "chilli" -> {
                        pizza.setElements(pizza.getElements() + ", " + addElements);
                        pizza.setSpiciness(pizza.getSpiciness() + 3);
                        pizza.setPrice(pizza.getPrice() + 3);
                    }
                    case "szynka" -> {
                        pizza.setElements(pizza.getElements() + ", " + addElements);
                        pizza.setPrice(pizza.getPrice() + 3);
                    }
                    case "pieczarki", "ananas" -> {
                        pizza.setElements(pizza.getElements() + ", " + addElements);
                        pizza.setPrice(pizza.getPrice() + 2);
                    }
                    case "kukurydza" -> {
                        pizza.setElements(pizza.getElements() + ", " + addElements);
                        pizza.setPrice(pizza.getPrice() + 1);
                    }
                    case "koniec" -> i=i+50;


                    }
                } */
            }


            System.out.println("W jaki sposob chcesz odebrac pizze");
            System.out.println("1: Odbior w restauracji");
            System.out.println("2: Dostawa do domu");
            int delivery = scanner.nextInt();

            switch (delivery) {
                case 1 -> {
                    System.out.println("Twoja pizza to: " + pizza.getName() + ", " + pizza.getSize() + ", (" + pizza.getElements() + "), " + pizza.getPrice() + "zł");

                }
                case 2 -> {
                    System.out.println("Podaj odległość w km na ktora mamy dostarczyć twoja pizze");
                    int deliveryLength = scanner.nextInt();
                    if (deliveryLength < 2) {
                        System.out.println("Twoja pizza to: " + pizza.getName() + ", " + pizza.getSize() + ", (" + pizza.getElements() + "), " + pizza.getPrice() + "zł, dostawa darmowa :)");

                    } else {
                        pizza.setDelivery(deliveryLength * 2);
                        System.out.println("Twoja pizza to: " + pizza.getName() + ", " + pizza.getSize() + ", (" + pizza.getElements() + "), " + pizza.getPrice() + "zł + koszta dostawy: " + pizza.getDelivery() + "zł");
                    }
                }
                default -> {
                    System.out.println("coś poszlo nie tak");
                    System.exit(0);
                }
            }

            System.out.println("Ostrość twojej pizzy wynosi " + pizza.getSpiciness() + " w skali pizzeriniego");


        }
    }

