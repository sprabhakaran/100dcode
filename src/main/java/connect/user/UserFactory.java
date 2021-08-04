package connect.user;

import java.util.HashMap;
import java.util.Map;

public class UserFactory {
    private static Map<Long, User> USERS = new HashMap<>();

    public static User getUser(Long id){
        return USERS.get(id);
    }

    public static User create(Long id, String name, String email){
        return USERS.put(id, new User(id, name, email));
    }
}
