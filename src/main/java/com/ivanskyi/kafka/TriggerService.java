package com.ivanskyi.kafka;

import com.ivanskyi.kafka.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TriggerService implements CommandLineRunner {

    private final KafkaProducerService kafkaProducerService;

    @Override
    public void run(String... args) {
        kafkaProducerService.send("mms", "hello");
    }
}
