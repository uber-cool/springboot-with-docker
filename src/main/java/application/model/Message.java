package application.model;

import java.util.UUID;
import lombok.Data;

@Data
public class Message {

  private UUID messageId;
  private String messageText;
}
