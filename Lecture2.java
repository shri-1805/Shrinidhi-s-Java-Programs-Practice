/*
Geneic methods-the function is independent of data type
passed to it

Syntax:

<access_specifier> <return type> Name<typeList>
{
}
*/

public class Lecture2<T> {
    void genericPrint(T s)
    {
        System.out.println(s);
    }
    static <T> void swap(T a,T b)
    {
        T temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args)
    {
        Integer a=Integer.valueOf(45);
        Integer b=Integer.valueOf(89);
        //genericPrint("hello");
        swap(a,b);
        System.out.println(a+" "+b);
    }
}
