package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.expression.spel.ast.OpOr;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);
//
		/*
		 * // User user = new User(); // user.setName("Durgesh Kumar Tiwari"); //
		 * user.setCity("Delhi"); // user.setStatus("I am java programmer"); // User
		 * user1 = userRepository.save(user); // // System.out.println(user1);
		 * 
		 * // Create object of User // User user1=new User(); // user1.setName("Uttam");
		 * // user1.setCity("City1"); // user1.setStatus("Python Programmer"); // //
		 * User user2=new User(); // user2.setName("Ankit"); // user2.setCity("City2");
		 * // user2.setStatus("Java Programmer"); //
		 * 
		 * // saving single user // User resultUser = userRepository.save(user2); //
		 * List<User> users = List.of(user1,user2); // save multiple objects //
		 * Iterable<User> result = userRepository.saveAll(users); // //
		 * result.forEach(user->{ // System.out.println(user); // }); // // ////
		 * System.out.println("saved user "+resultUser); // System.out.println("done");
		 * 
		 * //
		 * 
		 * // update the user of id 11 // Optional<User> optional =
		 * userRepository.findById(11); // User user = optional.get(); //
		 * user.setName("Ankit Tiwari"); // User result = userRepository.save(user); //
		 * System.out.println(result);
		 * 
		 * // how to get the data // findById(id)- return Optional Containing your data
		 * // // Iterable<User> itr = userRepository.findAll(); // Iterator<User>
		 * iterator = itr.iterator();
		 * 
		 * // while(iterator.hasNext()) // { // User user=iterator.next(); //
		 * System.out.println(user); // }
		 * 
		 * // itr.forEach(user->{System.out.println(user);});
		 * 
		 * // Deleting the user element // userRepository.deleteById(11); //
		 * System.out.println("deleted");
		 * 
		 * // Iterable<User> allusers = userRepository.findAll(); // //
		 * allusers.forEach(user->System.out.println(user)); // //
		 * userRepository.deleteAll(allusers); // // List<User> users =
		 * userRepository.findByNameAndCity("Durgesh", "Kanpur"); // //
		 * users.forEach(e->System.out.println(e));
		 * 
		 * List<User> allUser = userRepository.getAllUser();
		 * 
		 * allUser.forEach(e->{ System.out.println(e); });
		 * System.out.println("______________________________________");
		 * 
		 * List<User> userByName = userRepository.getUserByName("Karan","delhi");
		 * userByName.forEach(e->{ System.out.println(e); });
		 * 
		 * System.out.println("______________________________________");
		 * userRepository.getUsers().forEach(e->System.out.println(e));
		 */
		
	
		/*
		 * User user=new User(); user.setName("John"); user.setStatus("Gre Tutor");
		 * user.setCity("New York"); //userRepository.save(user);
		 */
		
//Save to DB
System.out.println("________________________________________________");
		
		
		
		User user=new User();
		user.setName("John");
		user.setCity("New York");
		user.setStatus("Tutor");
		user.setAge(32);
	System.out.println(userRepository.save(user));
	
	User user1=new User();
	user1.setName("Greg");
	user1.setCity("Cali");
	user1.setStatus("Programmer");
	user1.setAge(40);

	User user2=new User();
	user2.setName("Haider");
	user2.setCity("Dallas");
	user2.setStatus("Backend");
	user2.setAge(25);
	
	userRepository.deleteAll();
	
	
	List<User> list=List.of(user,user1,user2);
	
	
	List<User> saved_vals=(List<User>) userRepository.saveAll(list);
	
	
	saved_vals.forEach(i->{System.out.println(i);});
	

	
	//FETCH VALUES
	
	System.out.println("___________________________________________________________________________");

Optional<User> fetch_val=userRepository.findById(2);	
	
System.out.println(fetch_val.get());//This is of user type

List<User> all_val=(List<User>) userRepository.findAll();
	
	all_val.forEach(i->{System.out.println(i);});
	
	
	
	//delete delete has void return type 
	
	//userRepository.deleteById(1);
	


	//Custom Methods
	System.out.println("___________________________________________________________________________");
	
	
	
	  List<User> user_by_age=userRepository.findByAgeBetween(20, 35);
	  
	  user_by_age.forEach(i->{System.out.println(i);});
	 	 
	
	  
 List<User> name_starting=userRepository.findByNameStartingWith("Hai");
	  
 name_starting.forEach(i->{System.out.println(i);});

	
 List<User> name_containing=userRepository.findByNameContaining("re");
 
 name_containing.forEach(i->{System.out.println(i);});
	
	
	
	}

}
