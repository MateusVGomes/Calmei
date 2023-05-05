package com.example.news;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.springframework.stereotype.Component;
@Component
public class NewsHandler extends TextWebSocketHandler {
    
    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Implemente o método para lidar com as mensagens recebidas do cliente
    }
    
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // Implemente o método para lidar com a conexão estabelecida com o cliente
    }
    
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        // Implemente o método para lidar com a conexão fechada com o cliente
    }
}
