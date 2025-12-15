package indradwiprabowo.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MerchantTest {

    @Test
    void testMerchant() {
        var merchant = Merchant.create("001");
        merchant.setName("indra");

        Assertions.assertEquals("001", merchant.getId());
        Assertions.assertEquals("indra", merchant.getName());
    }

}
