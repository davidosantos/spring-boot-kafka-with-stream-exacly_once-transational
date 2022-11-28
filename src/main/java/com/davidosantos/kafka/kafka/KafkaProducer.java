package com.davidosantos.kafka.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.andreinc.mockneat.MockNeat;

@AllArgsConstructor
@Component
@Log4j2
public class KafkaProducer {

    private final KafkaTemplate<String, User> kafkaTemplate;

    private final KafkaTemplate<String, Survey> kafkaProducerSurvey;

    private final MockNeat mock = MockNeat.threadLocal();

    @Scheduled(fixedRate = 30_000, initialDelay = 2000)
    @Transactional
    public void generate() {

        User user = User.newBuilder()
        .setId(mock.longs().range(1l, 30l).get())
        .setName(mock.names().get())
        .setEmail(mock.emails().get())
        .build();

        Survey survey = Survey.newBuilder()
        .setId(mock.longs().range(1l, 999999999999999l).get())
        .setUserId(user.getId())
        .setEmail(user.getEmail())
        .setBestActorForMe(mock.actors().get())
        .build();
        
        log.info("Sending message to Kafka: " + user.toString());

        kafkaTemplate.send("users", user.getEmail().toString(), user);

        kafkaProducerSurvey.send("surveys",user.getEmail().toString(),survey);

        try {
            Thread.sleep(10000);
            log.info("Begin message processing commit...");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
}
