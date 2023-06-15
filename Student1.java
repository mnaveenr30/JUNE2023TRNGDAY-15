class Person{
    private String fname="John";
    private String lname="Doe";//private method not inherited
    private int age=24;
}
class Student1 extends Person{
    private int graduationYear=2018;
    public static void main(String args[]){
        Student1 myObj=new Student1();
        System.out.println("Name :"+myObj.fname+" "+myObj.lname);
        System.out.println("Age :"+myObj.age);
        System.out.println("Graduation Year :"+myObj.graduationYear);
    }
}