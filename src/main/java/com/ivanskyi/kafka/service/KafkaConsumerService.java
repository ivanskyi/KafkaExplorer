package com.ivanskyi.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "mms", groupId = "mms1")
    public void listen(String message) {
        log.info("Got message: {}", message);
    }
}
