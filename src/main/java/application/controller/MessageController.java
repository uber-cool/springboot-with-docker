package application.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;

import application.model.Message;
import application.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/app")
@Api("Message Controller")
@Slf4j
public class MessageController {

  @Autowired
  private MessageService messageService;

  @RequestMapping(method = RequestMethod.GET, path = "/message/{messageId}")
  @ApiOperation(value="Returns message from the request", nickname="helloWorldController.getMessage")
  public ResponseEntity<Message> getMessage(@PathVariable("messageId") String messageId){
    Message message = messageService.get(messageId);
    return message==null ? new ResponseEntity<>(NOT_FOUND) : new ResponseEntity<>(message, OK);
  }

  @RequestMapping(method = RequestMethod.POST, path = "/message")
  @ApiOperation(value="Create new message", nickname="helloWorldController.createMessage")
  public ResponseEntity<Message> createMessage(@RequestBody() Message message){
    return new ResponseEntity<>(messageService.createMessage(message), CREATED);
  }

  @RequestMapping(method = RequestMethod.GET, path = "/message")
  @ApiOperation(value="List all messages", nickname="helloWorldController.getAllMessages")
  public List<Message> getAllMessages(){
    return messageService.getAllMessages();
  }
}
