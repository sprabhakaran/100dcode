package connect.user;

public class UserStore {

    public static User getCurrentUser(){
        User user = UserFactory.getUser(1L);
        if(user == null){
            user = UserFactory.create(1L, "user1", "user@gmail.com");
        }
        return user;
    }
}
