package javaadvanced._6;

import static javaadvanced._6.Operator.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Days today =  Days.WEDNESDAY;

        for (Days day : Days.values()) {
            System.out.println(day);
        }
        }
    enum Days {
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SAUTRDAY(true),
        SUNDAY(true);

        private boolean isWeekend;

        Days(boolean isWeekend) {
            this.isWeekend = isWeekend;
        }
        public boolean theWeekend() {
            return this.isWeekend;
        }


    }

    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        enum Seasons {
            SPRING,
            SUMMER,
            FALL,
            WINTER;

            public  String getMonths() {
                switch (this) {
                    case SPRING:
                        return "March - May";
                    case SUMMER:
                        return "June - August";
                    case FALL:
                        return "September - November";
                    case WINTER:
                        return "December - February";
                    default:
                        return "";
                }
            }

        }
        for (Seasons season : Seasons.values()) {
            System.out.println(season.getMonths());
        }
    }


        /**
         * 3:
         *
         *
         * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
         *
         * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
         *
         */
        private static void exercise3 () {
            System.out.println("\nExercise 3: ");
            // Your code here


            TrafficLight currentLight = TrafficLight.RED;
            for (int i = 0; i < 3; i++) {
                System.out.println(currentLight);
                currentLight = trafficLightToString(currentLight);
            }


        }
    enum TrafficLight {
        RED,
        YELLOW,
        GREEN
    }
        public static TrafficLight trafficLightToString (TrafficLight trafficLight) {
            switch (trafficLight) {
                case RED:
                    return TrafficLight.GREEN;
                case YELLOW:
                    return TrafficLight.RED;
                case GREEN:
                    return TrafficLight.YELLOW;
                default :
                    return null;

            }
        }

        /**
         * 4:
         *
         * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
         *
         * Write an if statement that prints weekend or weekday based on the enum
         */
        private static void exercise4 () {
            System.out.println("\nExercise 4: ");
            // Your code here
           for(Days d : Days.values()){
               if(d.theWeekend()){
                   System.out.println(d + " is weekend");
               } else {
                   System.out.println(d + " is weekday");
               }
           }
        }

        /**
         * 5:
         *
         *
         * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
         *
         * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
         */
        private static void exercise5 () {
            System.out.println("\nExercise 5: ");
            // Your code here
            double num1 = 5;
            double num2 = 2;
            /*Operator op = Operator.ADD;
            double result = calculate(num1, num2, op);
            System.out.println(result);
            Operator op2 = Operator.SUBTRACT;
            double result2 = calculate(num1, num2, op2);
            System.out.println(result2);*/
            for (Operator op : Operator.values()) {
                double result = calculate(num1, num2, op);
                String output = num1 + " " + op + " " + num2 + " = " + result;
                System.out.println(output);
            }



        }

    public static double calculate (double num1, double num2, Operator op) {
        switch (op) {
            case ADD:
                return num1 + num2;
            case SUBTRACT:
                return num1 - num2;
            case MULTIPLY:
                return num1 * num2;
            case DIVIDE:
                return num1 / num2;
            default:
                System.out.println("Invalide operator");
        }
        return 0.0;
    }

    }

