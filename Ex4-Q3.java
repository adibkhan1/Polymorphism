

abstract class Person{
    
    protected String name;
    public Person(){}
    public Person(String n){
        name=n;
    }

    public abstract void getDESC();
}

class Student extends Person{
    private String major;

    public Student(String n,String m){
        name=n;
        major=m;
    }
    public void getDESC(){
        System.out.println("I am "+name+" and I am majoring in "+ major);
    }
}

class Employee extends Person{
    private double salary;

    public Employee(String n,double Salary){
        name=n;
        salary=Salary;
    }
    public void getDESC(){
        System.out.println("I am "+name+" and my salary is "+ salary);
    }

}

class Tester{
    public static void main(String[] args) {
        Student s1= new Student("Shadman", "Computer Science");
        Employee e1 = new Employee("Shadman", 2500);

        s1.getDESC();
        e1.getDESC();
    }
}