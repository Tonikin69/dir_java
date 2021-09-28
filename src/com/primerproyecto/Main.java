package com.primerproyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

        String clave="Users";
        Boolean flag=false;
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "cd \"C:\\\" && dir");

            ProcessBuilder builder2= new ProcessBuilder(
                    "cmd.exe", "/c", "cd \"C:\\\" && dir " + clave);


            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = r.readLine()) != null ) {
                if (line.contains(clave)){
                    Process c = builder2.start();
                    flag=true;
                } else System.out.println("Esta palabra no esta para hacerla un dir");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (flag=true){

            try {


                ProcessBuilder builder2= new ProcessBuilder(
                        "cmd.exe", "/c", "cd \"C:\\\" && dir " + clave);


                builder2.redirectErrorStream(true);
                Process p = builder2.start();
                BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line;
                while ((line = r.readLine()) != null ) {
                    System.out.println(line);

                }

            } catch (IOException e) {
                e.printStackTrace();
            }



        }

    }
}
