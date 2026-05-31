package ecommerceplateform;

import java.util.Arrays;
import java.util.List;

public class OrderData {
    public List<Order> getData()
    {
        return Arrays.asList(
                new Order(101, "Arpit", "Electronics", 2, 50000, "2025-01-10"),
                new Order(102, "Rahul", "Books", 5, 2500, "2025-01-11"),
                new Order(103, "Aman", "Electronics", 1, 30000, "2025-01-12"),
                new Order(104, "Arpit", "Clothing", 3, 4500, "2025-01-15"),
                new Order(105, "Priya", "Books", 4, 2000, "2025-01-18"),
                new Order(106, "Rahul", "Electronics", 1, 70000, "2025-01-20"),
                new Order(107, "Priya", "Clothing", 2, 3000, "2025-01-22"),
                new Order(108, "Aman", "Books", 6, 3600, "2025-01-25")
        );
    }
}
