# One UP Front-end interview 2016

## Exercice 1: Algorithm

Write in pseudocode or in your favorite language an algorithm that find and return the middle element of a linked list.

Indicate the complexity of the algorithm you wrote using the Big O notation.

*Suggested effort: 10 minutes*

## Exercice 2: Legacy refactoring

A co-worker wrote this (terrible) method 10 years ago.
The method goes across all Orders and return the ones that contains the Product `p` in parameter.

1. Do a code review of this method. What would be your feedbacks to the author?
2. Refactor this method according to your feedbacks.

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
}
```
*Suggested effort: 20 minutes*

## Exercice 3: GWT and Boostrap

For this exercice you will need Eclipse, GWT SDK and GWT eclipse plugin.

Download GWT plugin for Eclipse here: http://www.gwtproject.org/usingeclipse.html#eclipse

Download GWT SDK: http://www.gwtproject.org/download.html

Once everything is setup, import the project `AddressBook` in eclipse. Do a right click on the project and do `Run As` -> `Web Application (GWT Super Dev Mode)`.

Open the URL http://127.0.0.1:8888/AddressBook.html in a browser and you should see this :

 ![](https://github.com/myERP/interview-frontend/raw/master/screenshots/Screenshot-3.0.png)

This application is a very basic address book. The list of contact is static and defined in `ContactServiceImpl.java`.

The list is requested and accessible in the GWT front-end in the component `Book.java`.

Starting from this, your tasks are:

1. Build a component that list all the `Contact`.
2. Implement the feature: clicking a contact card should open the detailed view of the contact
3. Implement the feature: Hovering a contact should display a delete button. When the button delete is clicked:
  * the contact card is removed from the DOM
  * a request is made to the server to remove the `Contact` from the static List
4. Use Bootstrap CSS to give a simple look to your UI.

The expected UI should be close from this screenshot :

 ![](https://github.com/myERP/interview-frontend/raw/master/screenshots/Screenshot-3.1.png)


*Suggested effort: 60 to 90 minutes*

## Exercice 4: HTML/CSS/JS

Write a HTML page displaying a modal with an image, a text and a button. Clicking the button should remove it and display “Redirecting to google…” instead. After a few seconds, the page should redirect to google.com.

On mobile devices, the modal must take the full height and width.

 ![](https://github.com/myERP/interview-frontend/raw/master/screenshots/Screenshot-4.1.png)

  ![](https://github.com/myERP/interview-frontend/raw/master/screenshots/Screenshot-4.2.png)

*Suggested effort: 30 to 60 minutes*
