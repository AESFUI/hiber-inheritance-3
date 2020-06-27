package ml.sadriev.inheritance.api.service;

import java.util.List;
import java.util.UUID;
import ml.sadriev.inheritance.model.Groups;
import ml.sadriev.inheritance.model.Messages;
import ml.sadriev.inheritance.model.Users;

public interface MessagesService {

    boolean sendMessage(String message);

    Messages readMessage(String message);

    List<Messages> readMessagesByUserName(Users user);

    List<Messages> readMessagesByGroupName(Groups group);

    Messages editMessageById(UUID groupId);

    boolean removeMessage();
}
