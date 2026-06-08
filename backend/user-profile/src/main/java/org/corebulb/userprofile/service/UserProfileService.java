package org.corebulb.userprofile.service;

import lombok.RequiredArgsConstructor;
import org.corebulb.userprofile.domain.UserProfile;
import org.corebulb.userprofile.domain.req.UserProfileReq;
import org.corebulb.userprofile.exception.UserNotFoundException;
import org.corebulb.userprofile.repository.UserProfileRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProfileService {

  private final UserProfileRepository userProfileRepository;

  public UserProfile saveUser(UserProfileReq userProfileReq) {
    return userProfileRepository.save(new UserProfile(userProfileReq.email()));
  }

  public UserProfile getUserByEmail(String email) {
    return userProfileRepository.findUserProfileByEmail(email)
        .orElseThrow(() -> new UserNotFoundException("User not found by email: " + email));
  }
}
