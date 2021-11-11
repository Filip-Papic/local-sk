package model;

import java.io.File;

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

	public Directory rootDirectory(String path) {
		
		File file = new File(path);
		Directory rootDirectory = new DirectoryLocal(); ///nzm
		
		file.mkdirs();
						//.....
		return null;
	}
	
}















