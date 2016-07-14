# One Up - Front-end interview 2016

You have to complete this test within 3 hours from the moment you got the link to this repository.

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

## Exercise 3: GWT and Boostrap

For this exercise you will need Eclipse, GWT SDK and GWT eclipse plugin.

Download GWT plugin for Eclipse here: http://www.gwtproject.org/usingeclipse.html#eclipse

Download GWT SDK: http://www.gwtproject.org/download.html

Once everything is setup, import the `exercise3/AddressBook` project in eclipse. Do a right click on the project and do `Run As` -> `Web Application (GWT Super Dev Mode)`.

Open the URL http://127.0.0.1:8888/AddressBook.html in a browser and you should see this :

 ![](https://github.com/myERP/interviews/raw/master/VIE-interview/screenshots/Screenshot-3.0.png)

This application is a very basic address book. The contact list is static and defined in `ContactServiceImpl.java`.

The list is requested and accessible in the GWT front-end in the component `Book.java`.

Starting from this, your tasks are:

1. Build a component that list all the `Contact`.
2. Implement the feature: clicking a contact card should open the detailed view of the contact
3. Implement the feature: hovering a contact should display a delete button. When the button delete is clicked:
  * the contact card is removed from the DOM
  * a request is made to the server to remove the `Contact` from the static List
4. Use Bootstrap CSS to give a simple look to your UI.

The expected UI should be close from this screenshot :

 ![](https://github.com/myERP/interviews/raw/master/VIE-interview/screenshots/Screenshot-3.1.png)


*Suggested effort: 60 to 90 minutes*

## Exercise 4: HTML/CSS/JS

Write a HTML page with a simple button. Clicking this button should open a modal with an image, a text and another button. Clicking the button inside the modal should remove this button and display “Redirecting to google…” instead. After a few seconds, the page should redirect to google.com.

On mobile devices, the modal must take the full height and width.

Pure HTML/CSS/JS only (no Bootstrap/jquery/etc)

Directly edit the code in the `exercise4` folder.

 ![](https://github.com/myERP/interviews/raw/master/VIE-interview/screenshots/Screenshot-4.1.png)

 ![](https://github.com/myERP/interviews/raw/master/VIE-interview/screenshots/Screenshot-4.2.png)

*Suggested effort: 30 to 60 minutes*
