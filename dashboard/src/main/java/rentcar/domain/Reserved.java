package rentcar.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import rentcar.infra.AbstractEvent;

@Data
public class Reserved extends AbstractEvent {

    private Long id;
    private String USERID;
    private String RESERVEDT;
}
