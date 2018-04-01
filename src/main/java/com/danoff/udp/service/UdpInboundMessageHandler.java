package com.danoff.udp.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Headers;


@MessageEndpoint
public class UdpInboundMessageHandler {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(UdpInboundMessageHandler.class);
	
	@ServiceActivator(inputChannel = "inboundChannel")
	public void handeMessage(Message message, @Headers Map<String, Object> headerMap) {
		LOGGER.info("Received UDP message: {}", new String((byte[]) message.getPayload()));
	}
}
