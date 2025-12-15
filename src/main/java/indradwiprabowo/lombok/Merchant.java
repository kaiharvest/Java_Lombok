package indradwiprabowo.lombok;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor(staticName = "create")
public class Merchant {

    private final String id;

    private String name;

}
