public class Calculator{
    public static int add(int a,b){
        return a+b;
    }
    public static int sub(int a,b){
        return a-b;
    }
    public static int mult(int a,b){
        return a*b;
    }
    public static double divide(int a,b){
        return a\b;
        
    }
    public static void main(Strings[] args){
        int x=10;
        int y=5;
        int sum=add(x,y);
        int difference=sub(x,y);
        int multiplication=mult(x,y);
        double quotient=divide(x,y);
        System.out.println("addition"+sum);
        System.out.pirntln("Substraction"+difference);
        System.out.println("Product"+multiplication);
        System.out.println("Division"+quotient);

    }
}