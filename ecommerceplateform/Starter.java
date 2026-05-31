package ecommerceplateform;

import java.io.FilterOutputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Starter {
    public static void main(String[] args)
    {
        OrderData obj1 = new OrderData();
        List<Order> ls = obj1.getData();
        //all orders whose amount > 10000
        ls.stream().filter(e->e.amount>10000).forEach(e->System.out.println(e));

        //Get names of all customers
        ls.stream().forEach(e->System.out.println(e.customerName));

        //Count total orders
        long size =ls.stream().count();
        System.out.println(size);

        //Get distinct product categories
       long size1 = ls.stream().collect(Collectors.groupingBy(e->e.productCategory)).size();
       System.out.println(size1);
        ls.stream()
                .map(o -> o.productCategory)
                .distinct()
                .forEach(System.out::println);
        //Total revenue generated

        double totalAmount=ls.stream().mapToDouble(e->e.amount).sum();
        System.out.println(totalAmount);

        //Average order amount
        OptionalDouble average = ls.stream().mapToDouble(e->e.amount).average();
        System.out.println(average);

        //Highest order amount
       DoubleSummaryStatistics obj= ls.stream().mapToDouble(e->e.amount).summaryStatistics();
        System.out.println(obj.getMax());

        //Lowest order amount
        System.out.println(obj.getMin());

        //Sort orders by amount descending
        ls.stream()
                .sorted((e1,e2)->(int)(e2.amount-e1.amount))
                .forEach(System.out::println);

        //Top 3 highest orders
        ls.stream().
                sorted((e1,e2)->(int)(e2.amount-e1.amount))
                .limit(3)
                .forEach(e-> System.out.println(e));

        //Count orders per category
       Map<String,Long> mp = ls.stream()
               .collect(Collectors.groupingBy(e->e.productCategory,Collectors.counting()));
        System.out.println(mp);
        //Total sales per category
        Map<String,Double>mp1 = ls.stream()
                .collect(Collectors.groupingBy(e->e.productCategory,Collectors.summingDouble(e->e.amount)));
        System.out.println(mp1);


        //Total quantity sold per category
        Map<String,Double>mp2 = ls.stream().
                collect(Collectors.groupingBy(e->e.productCategory,Collectors.summingDouble(e->e.quantity)));
        System.out.println(mp2);

        //Average amount per category
        Map<String,Double>mp3 = ls.stream()
                .collect(Collectors.groupingBy(e->e.productCategory,Collectors.averagingDouble(e->e.amount)));
        System.out.print(mp3);

        //Orders grouped by customer
        Map<String,List<Order>> mp4 = ls.stream().collect(Collectors.groupingBy(e->e.customerName));
        System.out.println(mp4);

        //Customer who spent the most
        Map<String,Double> mp5 =ls.stream().collect(Collectors.groupingBy(e->e.customerName,Collectors.summingDouble(e->e.amount)));
        Map.Entry<String,Double> max =mp5.entrySet()
                .stream()
                .max((e1,e2)->(int)(e1.getValue()-e2.getValue()))
                .get();
        System.out.println(max);

        //Highest order in each category
        Map<String,Optional<Order>> mp6 = ls.stream()
                .collect(Collectors.groupingBy(e->e.productCategory,Collectors.maxBy((e1,e2)->(int)(e1.amount-e2.amount))));
        System.out.println(mp6);

        //Customer-wise total spending
        Map<String,Double> mp7 = ls.stream()
                .collect(Collectors.groupingBy(e->e.customerName,Collectors.summingDouble(e->e.amount
                )));
        System.out.println(mp7);

        //Category generating maximum revenue
        Map<String,Double> mp8 = ls.stream()
                .collect(Collectors.groupingBy(e->e.productCategory,Collectors.summingDouble(e->e.amount)));
        Map.Entry<String,Double>max1 = mp8.entrySet().stream().max((e1,e2)->(int)(e1.getValue()-e2.getValue())).get();
        System.out.println(max1);


        //Second highest order amount
       Order secondHighest= ls.stream().sorted((e1,e2)->(int)(e2.amount-e1.amount)).skip(1).findFirst().get();
        System.out.println(secondHighest);
    }
}
