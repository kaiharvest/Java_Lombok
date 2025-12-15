package indradwiprabowo.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@ToString(exclude = "price")
@AllArgsConstructor
public class Product {

    private final String id;

    private String name;

    private Long price;

}
