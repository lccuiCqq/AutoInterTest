package com.demo.servlet;

public class Puppy {
    int puppyAge;
    public Puppy(String name){
        System.out.println("Puppy's name: " + name);
    }

    public void setPuppyAge(int age){
        puppyAge = age ;
    }

    public int getPuppyAge() {
        System.out.println("puppy's: " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy("lucy");

        int puppyAge = puppy.getPuppyAge();
        puppy.setPuppyAge(20);
        System.out.println("puppy'age" + puppy.puppyAge);
    }
}
