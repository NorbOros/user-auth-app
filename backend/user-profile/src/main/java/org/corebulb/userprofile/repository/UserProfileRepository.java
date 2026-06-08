package org.corebulb.userprofile.repository;

import java.util.Optional;
import java.util.UUID;
import org.corebulb.userprofile.domain.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProfileRepository extends MongoRepository<UserProfile, UUID> {

  Optional<UserProfile> findUserProfileByEmail(String email);
}
