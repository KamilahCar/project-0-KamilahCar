package Daos;

import java.util.List;

import Models.Transaction;
import Models.User;

public interface UserDao {

	UserDao currentUserImplementation = new UserDaoDatabase();

	int save(User u);	
	int remove(User u);
	List<User> findAll();
	User findById(int id);
	User findByUsernameAndPassword(String username, String password);
	User findByUsername(String username);
	int disableLogin(User loginDelete);
	List<Transaction> findAllTransactions();
	List<Transaction> findTransactionByUserId(int id);


}
