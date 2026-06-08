package org.corebulb.userprofile.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "org.corebulb.userprofile.repository")
public class MongoConf {

}
