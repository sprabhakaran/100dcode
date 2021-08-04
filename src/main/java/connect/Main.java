package connect;

import connect.repo.ArticleRepo;
import connect.user.User;
import connect.user.UserStore;

public class Main {
    public static void main(String[] args) {
        User user = UserStore.getCurrentUser();
        Article art = new Article();
        art.setTitle("Title Group");
        art.setBody("Body content");
        art.setUser(user);

        ArticleRepo.insert(art);
    }
}
