package com.primerproyecto;

public class Main {

    public static void main(String[] args) {
	    String nom="Antonio";
        String ape1="Martinez";
        String ape2="Garcia";
        int eda = 19;

        persona obj = new persona(nom,ape1,ape2,eda);
        persona obj2 = new persona(nom,ape1,eda);


        System.out.println(obj.getcom());
        System.out.println(obj2.getcom());



    }
}
