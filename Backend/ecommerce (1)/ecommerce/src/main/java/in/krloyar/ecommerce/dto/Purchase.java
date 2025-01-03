package in.krloyar.ecommerce.dto;

import in.krloyar.ecommerce.entity.Address;
import in.krloyar.ecommerce.entity.Customer;
import in.krloyar.ecommerce.entity.Order;
import in.krloyar.ecommerce.entity.OrderItem;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
