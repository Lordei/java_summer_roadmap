package day03;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, I'm Ibrahim!");
        System.out.println("I'm a new student and i will do the day03 task! ^_^");
        Student student = new Student("Ibrahim", 20, 5.0);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGpa());
        //-----------------set-------------------
        student.setName("Ibrahim Ali");
        student.setAge(21);
        student.setGpa(4.0);
        //---------------------------------------
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGpa());
        System.out.println("Is student Ibrahim ali excellent? : " + student.isExcellent());
        System.out.println(student);

        //----------

        BankAccount user1 = new BankAccount("Ibrahim", 1000);
        System.out.println(user1);
        user1.deposit(500);
        System.out.println(user1);
        user1.withdraw(1000);
        System.out.println(user1);
        //get balance test
        user1.deposit(2500);
        System.out.println(user1.getBalance());

        //----- ArraysHelper -----
        int[] myNumbers = {15, 8, 22, 7, 10, 3};

        ArrayHelper helper = new ArrayHelper();

        System.out.println("Max number: " + helper.findMax(myNumbers));
        System.out.println("Average: " + helper.calculateAverage(myNumbers));
        System.out.println("Even numbers count: " + helper.countEvens(myNumbers));
    }
}
