package OOPS;

 class Student {
    int age;
    String name;


    Student(int age, String name) {
        this.age = age;
        this.name = name;

    }

    void assignValue(){
        System.out.println("Name " + name + ","+ " Age "+ age);
    }


    public static void main(String[] args) {

        Student s = new  Student(1, "Jack");
        s.assignValue();
        Student s2 = new Student(55, "om");
        s2.assignValue();

    }
}
