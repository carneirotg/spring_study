package spring.cop.domain;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
public class NotificationMessageService implements MessageService {

    @Bean(name = "messageService")
    @ConditionalOnProperty(prefix = "message", name = "service", havingValue = "notification")
    public MessageService messageService() {
        return new NotificationMessageService();
    }

    @Override
    public void process(String type) {

    }
}
