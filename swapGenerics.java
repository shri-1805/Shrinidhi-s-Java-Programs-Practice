/*
This program makes use of Person class defined in another file "Person.java"
*/
public class swapGenerics{

    public static void swap(Object x, Object y)
    {
        Object t=x;
        x=y;
        y=t;
        System.out.println(x+" "+y);
    }
    public static void main(String[] args)
    {
        Object p1=new Person("Smart", 99.5);
        Double p2=Double.valueOf(4512.54);
        System.out.println(p1+" "+p2);
        swap(p1, p2);
        System.out.println(p1+" "+p2);
    } 
}
