package indradwiprabowo.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {

    @Test
    void testConstructorNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            var members = new Member(null, null);
        });
    }

    @Test
    void testSetterMethod() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            var members = new Member("eko", "eko");
            members.setName(null);

            members.sayHello(null);
        });
    }
}
