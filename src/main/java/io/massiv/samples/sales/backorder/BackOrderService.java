package io.massiv.samples.sales.backorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class BackOrderService {

    @Autowired
    protected JmsTemplate jmsTemplate;

    @JmsListener(destination = "backorder.queue")
    public void receiveMessage(final String message) {
        System.out.println("Received <" + message + ">");
    }
}