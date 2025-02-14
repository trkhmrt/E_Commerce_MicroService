package com.tarikhamarat.message.functions;


import com.tarikhamarat.message.dto.MessageDto;
import org.apache.logging.log4j.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class MessageFunctions {

    private static final Logger log = LoggerFactory.getLogger(MessageFunctions.class);

    @Bean
    public Function<MessageDto,MessageDto> mail(){
        return msg -> {
            log.info("Sending email"+msg.toString());
            return msg;
        };
    }

    @Bean
    public Function<MessageDto,Long> sms(){
        return msg -> {
            log.info("Sending sms"+msg.toString());
            return msg.BasketNumber();
        };
    }
}
