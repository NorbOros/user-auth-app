package org.corebulb.userprofile.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class UserProfile {

  @Indexed(unique = true)
  private final String email;

}
