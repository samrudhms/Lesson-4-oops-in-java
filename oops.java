class Employee{
    int phoneno;
    String name;
    Float salary;

    public Employee() {
        System.out.println();
        phoneno=998234816;
        name="Samrudh";
        salary =200000f;


    }
    void displayDetails(){
        System.out.println(phoneno+","+name+","+salary);
    }

    
    
}
class oops{
    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.displayDetails();
    }
}
 