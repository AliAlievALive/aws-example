package com.halal.awsimageupload.datastore;

import com.halal.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("7996a80e-9ada-447e-a75a-b6266cf618c9"), "user1", "7996a80e-9ada-447e-a75a-b6266cf618c9"));
        USER_PROFILES.add(new UserProfile(UUID.fromString("bc911d8c-07ad-45d1-8d45-0dbad4524e35"), "user2", "bc911d8c-07ad-45d1-8d45-0dbad4524e35"));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
