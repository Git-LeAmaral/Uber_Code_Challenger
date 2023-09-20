package com.leandro.emailservice.aplication;

import com.leandro.emailservice.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGatway emailSenderGatway;

    @Autowired
    public EmailSenderService(EmailSenderGatway emailGatway) {
        this.emailSenderGatway = emailGatway;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {

    }
}
