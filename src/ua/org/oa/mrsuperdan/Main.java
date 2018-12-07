package ua.org.oa.mrsuperdan;

public class Main {

    public static void main(String[] args) {

        //ShowOverloadedTasks someObj = new ShowOverloadedTasks(12.5, 2, 3);
        //someObj.getVolume();
        //someObj.overloadMethod(2,4);

        System.out.println("-----------------------------");

        StudentsInfo group = new StudentsInfo();
        group.fillArrayStudents();
        group.countTotalAverage();

        group.moreThanAverage();
        group.lessThanAverage();
        System.out.println(" ");
        group.moreThanFixGrade();
        group.lessThanFixGrade();

        System.out.println("-----------------------------");

        System.out.println(group.toString());
    }
}
