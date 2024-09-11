package rentcar.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import rentcar.domain.*;
import rentcar.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Notavailable extends AbstractEvent {

    private Long id;

    public Notavailable(Point aggregate) {
        super(aggregate);
    }

    public Notavailable() {
        super();
    }
}
//>>> DDD / Domain Event
