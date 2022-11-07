package tests;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpression {

    //@Test
    public  void regular(){
        ArrayList<String> names=new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekya");
        names.add("Adam");
        names.add("Ram");
        int count=0;

        for(int i=0;i< names.size();i++){
            String actual=names.get(i);
            if(actual.startsWith("A"))
            {
                count++;
            }
        }

    System.out.println(count);
}

    //@Test
    public  void streamFilter() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekya");
        names.add("Adam");
        names.add("Ram");

        Long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);

        names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
        names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));

    }

    @Test
    public  void streamMap(){

        //ArrayList<String> names=new ArrayList<String>();

        Stream.of("Abhijeeth","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
        .forEach(s->System.out.println(s));

        List<String>names= Arrays.asList("Abhijeeth","Don","Alekhya","Adam","Rama");
        names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    }

    @Test
    public void streamCollect(){

        List<String> ls=Stream.of("Abhijeeth","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(ls.get(0));
    }
}
