package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import users.User;

public class FileLocal implements File{

	
	private String name;
	private Directory directory;
	
/*	public FileLocal(String name) {
		super();
		this.name = name;
	}
	
	public FileLocal(String name, Directory directory) {
		super();
		this.name = name;
		this.directory = directory;
	}
*/

	public void create(String path, String name) {
		Path path2 = null;
		if(path != null && path.length() > 0)
			path2 = Paths.get(path);
		
		Path path3 = Paths.get(path2 + java.io.File.separator + name);
		
		if(Files.exists(path2) && Files.exists(path3) == false) {
			try {
				Files.createFile(path3);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	public void delete(String path, String name) {

		Path path2 = Paths.get(path);
				
		if(Files.exists(path2)) {
			try {
				Files.delete(path2);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	public void move(String path1, String path2) {
		Path start = Paths.get(path1);
		Path finish = Paths.get(path2);
		
		if(Files.exists(start) && Files.exists(finish)) {
			try {
				Files.move(start, Paths.get(finish + java.io.File.separator + 
											path1.substring(path1.lastIndexOf(java.io.File.separator) + 1)), 
											StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void lookup(String path, String name) {
		
	}
	
	public void downloadDrive(String name, String id) {
		
	}

	public void uploadDrive(String name, String id) {
		
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
