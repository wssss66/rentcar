package rentcar.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import rentcar.config.kafka.KafkaProcessor;
import rentcar.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    PointRepository pointRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Reserved'"
    )
    public void wheneverReserved_IncreasePoint(@Payload Reserved reserved) {
        Reserved event = reserved;
        System.out.println(
            "\n\n##### listener IncreasePoint : " + reserved + "\n\n"
        );

        // Sample Logic //
        Point.increasePoint(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
