import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        UserProfile p = svc.createMinimal("u1", "a@b.com");
        System.out.println("Before: " + p.getEmail());
        UserProfile p2 = new UserProfile(
            p.getId(), "evil@example.com", p.getPhone(), p.getDisplayName(),
            p.getAddress(), p.isMarketingOptIn(), p.getTwitter(), p.getGithub()
        );
        System.out.println("After:  " + p2.getEmail());
        System.out.println("=> In the solution, setters disappear and object becomes immutable.");
    }
}