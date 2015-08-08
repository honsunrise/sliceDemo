package demoslice.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import static java.util.Collections.singletonList;

/**
 * Created by iCoderc on 2015/8/8.
 */
@Configuration
@EnableMongoRepositories(basePackages = {"demoslice.repository"})
public class MongoDBConfig extends AbstractMongoConfiguration {
    @Override
    public String getDatabaseName() {
        return "database";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(singletonList(new ServerAddress("127.0.0.1", 27017)));
    }
}