package tw.com.web;

import jakarta.websocket.OnMessage;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/echo")
public class MyWebSocket {
	
		@OnMessage
		public String message(String msg) {
				String upMsg = msg.toUpperCase();
				return upMsg;
		}
}
