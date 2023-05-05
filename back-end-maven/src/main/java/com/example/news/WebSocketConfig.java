package com.example.news;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocket;


@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(newsHandler(), "/ws/news").setAllowedOrigins("*");
    }
    
    @Bean
    public WebSocketHandler newsHandler() {
        return new NewsHandler();
    }
}