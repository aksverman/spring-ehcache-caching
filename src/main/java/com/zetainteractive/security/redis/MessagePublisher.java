package com.zetainteractive.security.redis;

public interface MessagePublisher {
	void publishCache(String cacheName);
	void subscribeCache(String cacheName);
}
