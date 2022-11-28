package com.davidosantos.kafka.kafka;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableKafkaStreams
@EnableScheduling
 public class KafkaConfiguration {

}