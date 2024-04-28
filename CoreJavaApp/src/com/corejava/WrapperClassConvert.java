package com.corejava;

import java.util.Scanner;

public class WrapperClassConvert {

    public Object convertToWrapper(Object input) {
        if (input instanceof Integer) {
            return (Integer) input;
        } else if (input instanceof Double) {
            return (Double) input;
        } else if (input instanceof Float) {
            return (Float) input;
        } else if (input instanceof Long) {
            return (Long) input;
        } else if (input instanceof Short) {
            return (Short) input;
        } else if (input instanceof Byte) {
            return (Byte) input;
        } else if (input instanceof Character) {
            return (Character) input;
        } else if (input instanceof Boolean) {
            return (Boolean) input;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WrapperClassConvert converter = new WrapperClassConvert();

        if (scanner.hasNextInt()) {
            int intValue = scanner.nextInt();
            Integer result = (Integer) converter.convertToWrapper(intValue);
            System.out.println( result);
        } else if (scanner.hasNextDouble()) {
            double doubleValue = scanner.nextDouble();
            Double result = (Double) converter.convertToWrapper(doubleValue);
            System.out.println(result);
        } else if (scanner.hasNextFloat()) {
            float floatValue = scanner.nextFloat();
            
            Float result = (Float) converter.convertToWrapper(floatValue);
            System.out.println(result);
        } else if (scanner.hasNextLong()) {
            long longValue = scanner.nextLong();
           
            Long result = (Long) converter.convertToWrapper(longValue);
            System.out.println(result);
        } else if (scanner.hasNextShort()) {
            short shortValue = scanner.nextShort();
            Short result = (Short) converter.convertToWrapper(shortValue);
            System.out.println(result);
        } else if (scanner.hasNextByte()) {
            byte byteValue = scanner.nextByte();
            Byte result = (Byte) converter.convertToWrapper(byteValue);
            System.out.println(result);
        }  else if (scanner.hasNextBoolean()) {
            boolean boolValue = scanner.nextBoolean();
            Boolean result = (Boolean) converter.convertToWrapper(boolValue);
            System.out.println(result);
        } else {
            System.out.println("Give proper primitive type as input");
        }

        scanner.close();
    }
}
