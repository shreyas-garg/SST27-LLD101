package com.example.profiles;

/**
 * Assembles profiles with consistent validation and immutability.
 */
public class ProfileService {

    // Returns a fully built immutable profile
    public UserProfile createMinimal(String id, String email) {
        Validation.requireNonBlank(id, "id");
        Validation.requireEmail(email);
        // Other fields set to null or default
        return new UserProfile(id, email, null, null, null, false, null, null);
    }

    // To "update" a profile, return a new instance with the desired changes
    public UserProfile withDisplayName(UserProfile profile, String displayName) {
        if (displayName != null && displayName.length() > 100) {
            displayName = displayName.substring(0, 100);
        }
        return new UserProfile(
            profile.getId(),
            profile.getEmail(),
            profile.getPhone(),
            displayName,
            profile.getAddress(),
            profile.isMarketingOptIn(),
            profile.getTwitter(),
            profile.getGithub()
        );
    }
}
