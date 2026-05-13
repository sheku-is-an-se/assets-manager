package com.pluralsight;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House mansion = new House("Red mansion, excellent condition","12/01/2024", 2_000_000,"123 Aberton Rd", 1,5000,20000);
        House apartment = new House("green apartment building, excellent condition","11/01/2023", 600_000,"129 Aberton Rd", 1,2500,10000);

        Vehicle hondaVehicle = new Vehicle("Green Interior, good condition","12/02/2021",29_000,"Honda",2022,95_000);
        Vehicle bugatti = new Vehicle("Black Interior, good condition","08/02/2021",250_000,"Bugatti",2024,35_000);
        assets.add(mansion);
        assets.add(apartment);
        assets.add(hondaVehicle);
        assets.add(bugatti);
        for(int i = 0; i < assets.size(); i++){
            System.out.println("Description: " + assets.get(i).description);
            if (assets.get(i) instanceof House){
                House house = (House) assets.get(i);
                System.out.println(house.getAddress());
            } else if (assets.get(i) instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) assets.get(i);
                System.out.println("Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel());

            }
        }
    }
}