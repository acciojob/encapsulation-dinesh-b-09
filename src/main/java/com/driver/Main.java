package com.driver;

public class Main
{
    public static void main(String[] args) {
        RWOnly obj = new RWOnly("Initial Name");

        // Error: The variable 'name' is private and cannot be accessed directly
        // obj.name = "New Name"; // This line will result in an error

        // Error: The variable 'name' is private and cannot be accessed directly
        // System.out.println(obj.name); // This line will result in an error

        // Using setter to set a new name
        obj.setName("New Name");

        // Using getter to access the name and print it
        System.out.println(obj.getName());

    }

