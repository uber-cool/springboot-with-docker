package application.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import model.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
  private static Map<String, Message> messages = new HashMap<>();

  public Message get(String messageId){
    return messages.get(messageId);
  }

  public Message createMessage(Message message) {
    UUID messageId = UUID.randomUUID();
    message.setMessageId(messageId);
    messages.put(messageId.toString(), message);
    return message;
  }

  public List<Message> getAllMessages() {
    return new ArrayList<>(messages.values());
  }
}
