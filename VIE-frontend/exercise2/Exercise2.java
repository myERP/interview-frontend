import com.dummy.package.Product;
import com.dummy.package.Order;
import java.util.ArrayList;
import java.util.LinkedList;

public class Exercise2 {
  
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
  
  // write your review here
  // 1-
  // 2-
  // 3-
  // ...
  
  
  
  // rewrite the findOrdersForProduct method here
  public ... {
    
  }
}