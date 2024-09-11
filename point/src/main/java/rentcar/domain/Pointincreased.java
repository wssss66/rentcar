package rentcar.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import rentcar.domain.*;
import rentcar.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Pointincreased extends AbstractEvent {

    private Long id;

    public Pointincreased(Point aggregate) {
        super(aggregate);
    }

    public Pointincreased() {
        super();
    }
}
//>>> DDD / Domain Event
