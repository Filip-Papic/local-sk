package model;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import users.User;

public class DirectoryLocal implements Directory{

	private String name;
	private Directory directory;
	//private boolean isRoot;
	
	public void create(String path, String name) {
		Path path2 = null;
		if(path != null && path.length() > 0) 					//!!!!!
			path2 = Paths.get(path);
		
		Path path3 = Paths.get(path2 + java.io.File.separator + name);
		
		if(Files.exists(path2) && Files.exists(path3) == false) {
			try {
				Files.createDirectory(path3);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
/*		if (f.mkdir()) {
            System.out.println("Directory is created");
        }
        else {
            System.out.println("Directory cannot be created");
        }
*/	}

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
