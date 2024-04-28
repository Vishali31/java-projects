package com.corejava;

import java.util.Scanner;

public class ShapeService {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter shape name");
        String shapeName = sc.next();
        sc.close();
        
        Shape s = null;
        if(shapeName.equals("circle")){
                s = new Circle();
        }
        else if(shapeName.equals("triangle")) {
                s = new Triangle();
        }
        else if(shapeName.equals("rectangle")) {
                s = new Rectangle();
        }
        else {
                System.out.println("Invalid option");
        }
        if(s!=null){
                s.area();
        }
}


		

	}


