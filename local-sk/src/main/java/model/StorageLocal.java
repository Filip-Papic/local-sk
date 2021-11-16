package model;

import java.io.File;

import users.User;

public class StorageLocal implements Storage {

	private String path;
    private String name;
    private User user;
    
	public String getPath() {
		return path;
	}

	public String getName() {
		return name;
	}

	public User getUser() {
		return user;
	}

	public boolean auth(String username, String password) {
		if(username.equals("u") && password.equals("p")){
			return true;
		}
		return false;
	}

	public Directory rootDirectory(String path) {
		
		File file = new File(path);
		Directory rootDirectory = new DirectoryLocal(); ///nzm
		
		file.mkdirs();
						//.....
		return null;
	}

	public int setSize(int size) {
		return 5;
	}
	
}















