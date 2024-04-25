package assignment6Software.firstEx;

import java.util.ArrayList;
import java.util.List;

public class UserManagementSystem {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }
}
