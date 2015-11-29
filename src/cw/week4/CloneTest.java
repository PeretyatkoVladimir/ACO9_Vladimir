package cw.week4;

public class CloneTest {

    public static void main(String[] args) {

        // case 1.

        TestStudent student1 = new TestStudent("Vladimir", "Pupkin");
        System.out.println(student1);


        String[] data = student1.getData();
        data[0] = "Vasya";
        data[1] = "Sokolov";

        System.out.println(student1);

        // case 2.

        TestStudent student2 = new TestStudent("Vladimir", "Pupkin");
        System.out.println(student2);

        String[] data2 = student2.getDataClone();
        data[0] = "Vasya";
        data[1] = "Sokolov";

        System.out.println(student2);
    }





}
