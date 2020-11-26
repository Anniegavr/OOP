package com;

public class Main {
    public static void main(String[] args){
        //MONITORS:
        Monitor monitor1 = new Monitor("Red", "23x17", "1080x720");
        Monitor monitor2 = new Monitor("blue", "18x15", "1080x720");
        //We compare them
        if (monitor1.equals(monitor2)) {
            System.out.println("The monitors are the same, bro. Just pick one already!");
        } else {
            System.out.println("The monitors are not the same, bro, so choose wisely!");
        }

        Student student1;
        Student student2;
        Student student3;
        Student student4;

        Student[] UTM_list = new Student[]{
                student1 = new Student("Mike", 12, 9.8),
                student2 = new Student("Ella", 13, 9.0),
                student3 = new Student("Lisa", 98, 8.9)
        };

        Student[] MIT_list = new Student[]{
                student1 = new Student("John", 124, 9.6),
                student2 = new Student("Ellise", 213, 8.0),
                student3 = new Student("Jina", 978, 8.4)};


        Student[] GOT_list = new Student[]{
                student1 = new Student("Danny", 36, 5.8),
                student2 = new Student("Sansa", 23, 9.9),
                student3 = new Student("Arya", 16, 10.0),
                student4 = new Student("Cercei", 40, 10.0)
        };
        
//        String[] sNames = new String[UTM_list.length];
//        for(int i = 0; i<UTM_list.length; i++){
//            sNames[i] = UTM_list[i].name;
//            System.out.println(sNames[i]);
//        };

        University UTM = new University("UTM", 1156, UTM_list);
        University MIT = new University("MIT", 1156, MIT_list);
        University GOT = new University("GOT", 1156, GOT_list);

        double average;
        average = (UTM.getSum() + MIT.getSum() + GOT.getSum())/(UTM.num_of_Marks()+MIT.num_of_Marks()+GOT.num_of_Marks());
        System.out.print (average);

    }
}