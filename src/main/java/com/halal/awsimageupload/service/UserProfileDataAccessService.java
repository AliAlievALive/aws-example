package com.halal.awsimageupload.service;

import com.halal.awsimageupload.datastore.FakeUserProfileDataStore;
import com.halal.awsimageupload.profile.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {
    private final FakeUserProfileDataStore faceUserProfileDataStore;

    @Autowired
    public UserProfileDataAccessService(FakeUserProfileDataStore faceUserProfileDataStore) {
        this.faceUserProfileDataStore = faceUserProfileDataStore;
    }

    List<UserProfile> getUserProfiles() {
        return faceUserProfileDataStore.getUserProfiles();
    }
}
