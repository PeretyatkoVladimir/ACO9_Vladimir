package cw.week4;

public class CloneTest {

    public static void main(String[] args) {

        // case 1.

        TestStudent student1 = new TestStudent("Alex", "Pupkin");
        System.out.println(student1);

        String[] data1 = student1.getData();
        data1[0] = "Vasya";
        data1[1] = "Sokol";

        System.out.println(student1);

        // case 2.

        TestStudent student2 = new TestStudent("Alex", "Pupkin");
        System.out.println(student2);

        String[] data2 = student2.getDataClone();
        data2[0] = "Vasya";
        data2[1] = "Sokol";

        System.out.println(student2);
    }

}
