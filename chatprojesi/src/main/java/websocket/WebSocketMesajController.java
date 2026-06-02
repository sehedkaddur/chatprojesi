package websocket;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
@Controller
public class WebSocketMesajController { @MessageMapping("/mesaj")
    @SendTo("/topic/mesajlar")
    public String mesajGonder(String mesaj) {
    return mesaj;}}