package edu.nbcc.factory;

public class UserFactory {
	public static User getInstance(UserType userType) {
		switch(userType) {
		case ADMIN:
			return new Admin();
		case CUSTOMER:
			return new Customer();
		default:
			return new Customer();
		}
	}
}
