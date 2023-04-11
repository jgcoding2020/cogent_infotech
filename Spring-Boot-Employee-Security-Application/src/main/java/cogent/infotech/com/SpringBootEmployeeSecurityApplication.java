package cogent.infotech.com;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.User;
import cogent.infotech.com.repository.UserRepository;

@SpringBootApplication
public class SpringBootEmployeeSecurityApplication {

	@Autowired
	UserRepository repository;
	 	@PostConstruct
	    public void initUsers() {
	        List<User> users = Stream.of(
	                new User(101, "user1", "pwd1", "user1@gmail.com"),
	                new User(102, "user2", "pwd2", "user2@gmail.com"),
	                new User(103, "user3", "pwd3", "user3@gmail.com"),
	                new User(104, "user4", "pwd4", "user4@gmail.com")
	        ).collect(Collectors.toList());
	        repository.saveAll(users);
	    }
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeSecurityApplication.class, args);
	}

}