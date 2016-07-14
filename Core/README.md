# One Up - Core Developer interview 2016

You have to complete this test within 2 hours from the moment you got the link to this repository.

Start this interview by cloning the repository on your machine. Make sure to carefully follow the instructions for each exercises.

Once you have completed the test, email us a zip file containing the folder with all the exercises and your name at didier@oneup.com. 

Happy coding!

## Exercise 1: Algorithm

Edit the `exercise1/exercise1.java` file and write in Java, an algorithm that finds and returns the middle element of a linked list.

Indicate the complexity of the algorithm you wrote using the Big O notation.

*Suggested effort: 10 minutes*

## Exercise 2: Legacy refactoring

A co-worker wrote this (terrible) method 10 years ago.
The method goes across all Orders and returns the ones that contain the Product `p` in parameter.

1. Do a code review of this method. What would be your feedbacks to the author? Write your review in the `exercise2/exercise2.java` file.
2. Refactor this method according to your feedbacks in the `exercise2/exercise2.java` file as well.

```java
public LinkedList findOrdersForProduct(Product p, boolean debug) {
  ArrayList l = new ArrayList();
  ArrayList list = getAllOrders();

  for (int i = 0; i < list.size(); i++) {
    Order order = (Order) list.get(0);
    boolean found = false;
    if (order.getProducts().size() > 0) {
      for (int j = 0; j <= order.getProducts().size(); j++) {
        Product p2 = order.getProducts().get(j);
        found = (p2 == p);
      }
      if (found && order != null)
        l.add(order);
    }
  }
  return new LinkedList(l);
}
```
*Suggested effort: 20 minutes*

## Exercise 3: Email validator

Edit the `exercise3/exercise3.java` file and write in Java, a method which returns whether or not the input String is a valid email address.

*Suggested effort: 15 minutes*

## Exercise 4: Reverse a string without using String methods

Edit the `exercise4/exercise4.java` file and write in Java, a method which reverses a string. You cannot use any methods from the String class.

Example: reverse("hello world!"); => !dlrow olleh

*Suggested effort: 15 minutes*

## Exercise 5: Sort a list of employees

Edit the `exercise5/exercise5.java` file and write in Java, a method which sort a list of employees. The employee must be sorted by name.

*Suggested effort: 15 minutes*

## Exercise 6: Removing duplicate elements from a List

Edit the `exercise6/exercise6.java` file and write in Java, a method which removes all duplicate elements from a List.

Example: List("a", "b", "b", "c", "d", "c", "e") => List("a", "b", "c", "d", "e")

*Suggested effort: 15 minutes*

## Exercise 7: MySQL requests

Edit the `exercise7/exercise7.sql` file and write queries in MySQL.

*Suggested effort: 30 minutes*