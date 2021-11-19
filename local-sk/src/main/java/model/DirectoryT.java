package model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.io.FileUtils;

import users.User;

public class DirectoryT implements Directory{

	private String name;
	private String path;
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
        Path dirPath = Paths.get(path);
        if(Files.exists(dirPath)){
            try{
                java.io.File file = new File(path);
                FileUtils.deleteDirectory(file);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
	}

	public void move(String path1, String path2) {
		Path start = Paths.get(path1);
		Path finish = Paths.get(path2);
		
		if(Files.exists(start) && Files.exists(finish)) {
			try {
				FileUtils.moveDirectory(new File(path1), new File(path2 + java.io.File.separator + 
											path1.substring(path1.lastIndexOf(java.io.File.separator) + 1)));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void createMultiple(String path, String name, int amount) {
		for(int i = 0; i < amount;i++) {
			create(path, name + (i+1));
		}
		
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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
