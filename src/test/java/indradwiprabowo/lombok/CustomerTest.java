package indradwiprabowo.lombok;

import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testCustomer() {
        var customer = new Customer();
        customer.setId("100");
        customer.setName("indra");

        System.out.println(customer.getId());
        System.out.println(customer.getName());
    }

}
