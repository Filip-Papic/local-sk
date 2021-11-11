package model;

import users.User;

public class DirectoryLocal implements Directory{

	private String name;
	private Directory directory;
	//private boolean isRoot;
	
	public void create(String path, String name) {
		
	}

	public void delete(String path, String name) {
		
	}

	public int fileCount(int fileCount) {
		return 0;
	}

	public boolean makeConnection(User user) {
		return false;
	}

	public void checkPrivilegeDir(User user) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Directory getDirectory() {
		return directory;
	}

	public void setDirectory(Directory directory) {
		this.directory = directory;
	}

}
