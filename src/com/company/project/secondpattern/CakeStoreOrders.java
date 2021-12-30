package com.company.project.secondpattern;

import java.util.HashMap;
import java.util.Map;

public class CakeStoreOrders {

    public static void main(String[] args) {
        Cake carrotCake = new CarrotCake();
        carrotCake.setId(1);
        Cake blueberryCake = new BlueberryCake();
        blueberryCake.setId(2);
        Cake cheeseCake = new CheeseCake();
        cheeseCake.setId(3);
        Cake cake = new BlueberryCake();
        cake.setId(4);
        Map<Integer, Cake> cakeMap = new HashMap<>();
        cakeMap.put(carrotCake.getId(), carrotCake);
        cakeMap.put(blueberryCake.getId(), blueberryCake);
        cakeMap.put(cheeseCake.getId(), cheeseCake);
        cakeMap.put(cake.getId(), cake);
        System.out.println("The orders in the store are: ");
        cakeMap.forEach((id, pieceOfCake) -> System.out.println("ID:" + id + " " + pieceOfCake.getCakeType()));
    }
}
