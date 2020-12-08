package com.labs.oop;

public class Main {
//Box(len, height, width
    public static void main(String[] args) {

        /*Box box1 = new Box();


        double box1_area = box1.getSurface_area();
        double box1_vol = box1.getVolume();

        System.out.println("Box 1 area: " + box1_area);
        System.out.println("Box 1 volume: " + box1_vol);

        Box box2 = new Box(2);


        double box2_area = box2.getSurface_area();
        double box2_vol = box2.getVolume();

        System.out.println("Box 2 area: " + box2_area);
        System.out.println("Box 2 volume: " + box2_vol);

        Box box3 = new Box(1, 3, 2);


        double box3_area = box3.getSurface_area();
        double box3_vol = box3.getVolume();

        System.out.println("Box 3 area: " + box3_area);
        System.out.println("Box 3 volume: " + box3_vol);*/

        Queue myQ = new Queue();

        myQ.isNull();
        myQ.push(" huh?");

        for (int i = 0; i < myQ.size(); i++) {
            System.out.println(myQ.get(i));
        }

        myQ.push(" huuh?");
        myQ.push(" huuuuuh?");
        myQ.push(" haaaah?");
        System.out.println(myQ.isNull());
        myQ.pop();
        System.out.println(myQ.notNull());
        for (int i = 0; i < myQ.size(); i++) {
            System.out.print(myQ.get(i));
        }



    }
}
