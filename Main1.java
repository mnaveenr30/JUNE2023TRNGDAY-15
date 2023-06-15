public class Main1{
    static void checkAge(int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("Access denained-You must be at lest 18 Years Old");
        }
        else{
            System.out.println("Access granted-You are old enoughf!");
        }
    }
    public static void main(String args[]){
        checkAge(19);
    }
}