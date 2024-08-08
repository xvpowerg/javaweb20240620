package tw.com.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.websocket.OnMessage;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;
import tw.com.beans.Msg;

@ServerEndpoint("/websocket")
public class WebSocketServer {
	private static Map<String,Session> sessionMap = new HashMap<>();
	@OnMessage
	public void onMessage(String message,Session session) throws IOException {
			ObjectMapper objMap = new ObjectMapper();
			Msg msg = objMap.readValue(message, Msg.class);
			session.getBasicRemote().sendText("我收到訊息:"+message);
			sessionMap.putIfAbsent(msg.getFromUser(), session);
			
			if (sessionMap.containsKey(msg.getToUser())) {
				sessionMap.get(msg.getToUser()).
							getBasicRemote().sendText(msg.getMsg());
			}else {
				session.getBasicRemote().sendText("無法傳送給:"+msg.getToUser());
			}
			
		
	}

}
