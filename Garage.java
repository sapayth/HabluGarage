/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HabluGarage;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author sapaythhossain
 */
public class Garage {

    private final String garageName;
    private LinkedList<String> carsQueue;
    private ArrayList<String> allServed;

    public Garage(String name) {
        carsQueue = new LinkedList<>();
        allServed = new ArrayList<>();
        this.garageName = name;
    }

    // add new car to the queue
    public void newCar(String car) {
        carsQueue.add(car);
    }

    // list all cars on the queue
    public void allQueue() {
        System.out.println("All cars in the queue right now:");
        for (String c : carsQueue) {
            System.out.println(c);
        }
    }

    // remove served cars from the queue
    public void servedCar() {
        String removed = carsQueue.pop();
        System.out.printf("Removed from queue: %s%n", removed );
        allServed.add(removed);
    }
    
    public void showAllServed() {
        System.out.println("All the served cars are:");
        for(String c : allServed) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Garage g = new Garage("Hablu Garage");
        g.newCar("Toyota");
        g.newCar("Hundai");
        g.newCar("Honda");
        g.newCar("Hundai");

        g.allQueue();
        System.out.println("");
        g.servedCar();
        System.out.println("");
        g.allQueue();
        g.showAllServed();
    }
}