package model;

import users.User;

public class FileLocal implements File{

	
	private String name;
	private Directory directory;
	
	public FileLocal(String name) {
		super();
		this.name = name;
	}
	
	public FileLocal(String name, Directory directory) {
		super();
		this.name = name;
		this.directory = directory;
	}


	public void create(String path, String name) {
		
	}

	public void delete(String path, String name) {
		
	}

	public void move(String path, String name) {
		
	}

	public void lookup(String path, String name) {
		
	}

	public void download(String path, String name) {
		
	}

	public void lookupAllFilesinDir(String path, String name) {
		
	}

	public void lookupAllFilesInWholeDir(String path, String name) {
		
	}

	public void lookupAllFilesWithExtension(String path, String name) {
		
	}

	public void lookupAllFilesSortedName(String path, String name) {
		
	}

	public void lookupAllFilesSortedDate(String path, String name) {
		
	}

	public void lookupAllFilesSortedEdit(String path, String name) {
		
	}

	public void lookupAllFilesInDate(String path, String name) {
		
	}

	public void checkPrivilegeFile(User user) {
		
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
