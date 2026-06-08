package org.corebulb.userprofile.rest;

import lombok.RequiredArgsConstructor;
import org.corebulb.userprofile.domain.UserProfile;
import org.corebulb.userprofile.domain.req.UserProfileReq;
import org.corebulb.userprofile.service.UserProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
@RequiredArgsConstructor
public class UserProfileController {

  private final UserProfileService userProfileService;

  @PostMapping("/create")
  public ResponseEntity<UserProfile> saveUser(@RequestBody UserProfileReq userProfileReq) {
    return ResponseEntity.ok(userProfileService.saveUser(userProfileReq));
  }

  @GetMapping("/{email}")
  public ResponseEntity<UserProfile> getUserByEmail(@PathVariable String email) {
    return ResponseEntity.ok(userProfileService.getUserByEmail(email));
  }

}
