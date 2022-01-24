package api;

import java.util.ArrayList;

public class Account {
	private int id;
	private String email;
	private String first_name;
	private String last_name;
	private String avatar;
	
	public ArrayList<Object> account(int id, String email, String first_name, String last_name, String avatar) {
		ArrayList<Object> account = null;
		account.add(id);
		account.add(email);
		account.add(first_name);
		account.add(last_name);
		account.add(avatar);
		return account;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getAvatar() {
		return avatar;
	}
}
