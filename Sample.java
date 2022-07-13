/*
Map, filter and reduce equivalents in JAVA
*/

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
//import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class Sample
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        //String list
        List<String> cities=Arrays.asList("london","hong kong","paris","newyork");
        System.out.println("String list\nOriginal list: "+cities);
        System.out.println("Transformed list: "+transform(cities));
        System.out.println("Older version: "+beforeVersion(cities));
        //integer list
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> squares=numbers.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println("Original list: "+numbers);
        System.out.println("Transformed square list: "+squares);

        sc.close();
    }

    public static List<String> beforeVersion(List<String> listOfString)
    {
        List<String> coll=new ArrayList<>();
        for(String str: listOfString)
        {
            coll.add(str.toUpperCase());
        }
        return coll;
    }

    public static List<String> transform(List<String> listOfString)
    {
        return listOfString.stream().map(String::toUpperCase).collect(toList());
    }
}
