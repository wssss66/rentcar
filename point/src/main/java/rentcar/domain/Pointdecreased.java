package rentcar.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import rentcar.domain.*;
import rentcar.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Pointdecreased extends AbstractEvent {

    private Long id;

    public Pointdecreased(Point aggregate) {
        super(aggregate);
    }

    public Pointdecreased() {
        super();
    }
}
//>>> DDD / Domain Event
