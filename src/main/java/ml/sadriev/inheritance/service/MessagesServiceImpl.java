package ml.sadriev.inheritance.service;

import java.util.List;
import java.util.UUID;
import ml.sadriev.inheritance.api.service.MessagesService;
import ml.sadriev.inheritance.model.Groups;
import ml.sadriev.inheritance.model.Messages;
import ml.sadriev.inheritance.model.Users;
import org.springframework.stereotype.Service;

@Service
public class MessagesServiceImpl implements MessagesService {

    public boolean sendMessage(String message) {
        return false;
    }

    public Messages readMessage(String message) {
        return null;
    }

    public List<Messages> readMessagesByUserName(Users user) {
        return null;
    }

    public List<Messages> readMessagesByGroupName(Groups group) {
        return null;
    }

    public Messages editMessageById(UUID groupId) {
        return null;
    }

    public boolean removeMessage() {
        return false;
    }
}
