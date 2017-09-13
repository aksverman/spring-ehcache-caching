package com.zetainteractive.security.redis;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MessagePublisherImpl implements MessagePublisher {

	/**
	 * Logger
	 */
	private static final Logger logger 	= Logger.getLogger(MessagePublisher.class);
	private final String	URL_REDIS 	= "http://localhost:8090/redispubsub/redis";
	
	
	@Override
	public void publishCache(String cacheName) {
		try {
			RestTemplate  restTemplate = new RestTemplate();
			HttpHeaders	headers	= new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<?>	httpEntity = new HttpEntity<>(cacheName, headers);
			//restTemplate.exchange(URL_REDIS + "/add", responseType)
		} catch( Exception e ) { logger.error("Excepiton while publishing redis !"); }
	}

	@Override
	public void subscribeCache(String cacheName) {

	}

}
