package algorithm.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class OrderDetails {
    int customerNumber;
    int orderNumber;
    int preparationTime;

    public OrderDetails(int customerNumber, int orderNumber, int preparationTime) {
        this.customerNumber = customerNumber;
        this.orderNumber = orderNumber;
        this.preparationTime = preparationTime;
    }

    public int getServeTime() {
        return orderNumber + preparationTime;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
}

public class _8_JimAndOrder {
    int[] jimOrders(int[][] orders) {
        List<OrderDetails> orderDetailsList = new ArrayList<>();
        for (int i = 0; i < orders.length; i++) {
            OrderDetails orderDetails = new OrderDetails(
                    (i + 1),
                    orders[i][0],
                    orders[i][1]
            );
            orderDetailsList.add(orderDetails);
        }
        return orderDetailsList.stream()
                .sorted(Comparator
                        .comparingInt(OrderDetails::getServeTime)
                        .thenComparingInt(OrderDetails::getCustomerNumber)
                ).mapToInt(OrderDetails::getCustomerNumber)
                .toArray();
    }
}
