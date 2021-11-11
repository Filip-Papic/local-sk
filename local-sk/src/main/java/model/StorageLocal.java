package model;

import users.User;

public class StorageLocal implements Storage{

	public String getPath() {
		return null;
	}

	public String getName() {
		return null;
	}

	public User getUser() {
		return null;
	}

	public boolean auth(String username, String password) {
		return false;
	}

	public int setSize(int size) {
		return 0;
	}
	
}
