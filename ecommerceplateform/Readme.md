# Java Stream API Practice - E-Commerce Order Management

## Dataset

An online shopping platform stores the following information:

- Order ID
- Customer Name
- Product Category
- Quantity
- Amount
- Order Date

Use Java Stream API to solve the following problems.

---

# Beginner Level

## 1. Find all orders whose amount is greater than 10,000.

**Objective:** Practice `filter()`.

---

## 2. Get names of all customers.

**Objective:** Practice `map()`.

---

## 3. Count total number of orders.

**Objective:** Practice `count()`.

---

## 4. Get all distinct product categories.

**Objective:** Practice `distinct()` and `map()`.

---

# Intermediate Level

## 5. Calculate total revenue generated.

**Objective:** Practice `mapToDouble()` and `sum()`.

---

## 6. Calculate average order amount.

**Objective:** Practice `average()`.

---

## 7. Find the order with the highest amount.

**Objective:** Practice `max()` and `Comparator`.

---

## 8. Find the order with the lowest amount.

**Objective:** Practice `min()` and `Comparator`.

---

## 9. Sort orders by amount in descending order.

**Objective:** Practice `sorted()`.

---

## 10. Find top 3 highest-value orders.

**Objective:** Practice `sorted()` and `limit()`.

---

# GroupingBy Questions

## 11. Count the number of orders in each product category.

**Objective:** Practice `groupingBy()` and `counting()`.

---

## 12. Calculate total sales amount for each category.

**Objective:** Practice `groupingBy()` and `summingDouble()`.

---

## 13. Calculate total quantity sold per category.

**Objective:** Practice `groupingBy()` and `summingInt()`.

---

## 14. Calculate average order amount per category.

**Objective:** Practice `groupingBy()` and `averagingDouble()`.

---

## 15. Group all orders by customer name.

**Objective:** Practice `groupingBy()` returning `List<Order>`.

---

# Advanced Interview Questions

## 16. Find the customer who spent the most money.

**Objective:** Combine `groupingBy()`, `summingDouble()`, and `max()`.

---

## 17. Find the highest-value order in each category.

**Objective:** Practice `groupingBy()` with `maxBy()`.

---

## 18. Calculate total spending by each customer.

**Objective:** Practice `groupingBy()` and `summingDouble()`.

---

## 19. Find the category generating the maximum revenue.

**Objective:** Combine `groupingBy()`, `summingDouble()`, and `max()`.

---

## 20. Find the second highest-value order.

**Objective:** Practice `sorted()`, `skip()`, and `findFirst()`.

---

# Bonus Industry-Level Questions


# Concepts Covered

By solving these problems, you will master:

- Stream Creation
- filter()
- map()
- flatMap()
- distinct()
- sorted()
- limit()
- skip()
- count()
- reduce()
- max()
- min()
- Optional
- Collectors
- groupingBy()
- partitioningBy()
- counting()
- summingInt()
- summingDouble()
- averagingDouble()
- maxBy()
- minBy()
- mapping()
- collectingAndThen()
- Comparator
- Map Processing
- EntrySet Streaming

---

# Goal

Complete all 20 core questions first.

After that, solve the 10 bonus industry-level questions without looking at solutions. If you can solve them independently, you are ready for most Java Stream API interview questions asked in internships and software engineering roles.