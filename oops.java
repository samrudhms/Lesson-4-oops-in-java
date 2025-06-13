class Student{
    int phoneno;
    String name;
    Float grade;

    public Student() {
        System.out.println();
        phoneno=998234816;
        name="Samrudh";
        grade= 8f;


    }
    void displayDetails(){
        System.out.println(phoneno+","+name+","+grade);
    }

    
    
}
class oops{
    public static void main(String[] args) {
        Student e1= new Student();
        e1.displayDetails();
    }
}
 