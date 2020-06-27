package ml.sadriev.inheritance.api.service;

import java.util.List;
import ml.sadriev.inheritance.model.Groups;
import ml.sadriev.inheritance.model.Users;

public interface GroupsService {

    void createGroup(String ownerName, Groups group) throws Exception;

    void removeGroup(String ownerName, String name) throws Exception;

    void addUserToGroup(Users user, Groups group);

    Groups findGroupByName(String groupName);

    List<Users> getListUsersOfGroup(Groups group);
}
