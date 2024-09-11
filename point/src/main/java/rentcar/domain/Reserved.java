package rentcar.domain;

import java.util.*;
import lombok.*;
import rentcar.domain.*;
import rentcar.infra.AbstractEvent;

@Data
@ToString
public class Reserved extends AbstractEvent {

    private Long id;
    private String userid;
    private String reservedt;
}
