package model;

import java.io.File;

import users.User;

public class StorageT implements Storage {

	private String path;
    private String name;
    private User user;
    
    
    @SuppressWarnings("deprecation")
	public void create(String path, String name){
    	// TODO Auto-generated method stub
		FileT file;
		try {
			file = (FileT) Class.forName("model.FileT").newInstance();
			file.create(path, name);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	
    }
    
	public String getPath() {
		return path;
	}

	public String getName() {
		return name;
	}

	public User getUser() {
		System.out.println("test");
		return null;
	}

	public boolean auth(String username, String password) {
		if(username.equals("u") && password.equals("p")){
			return true;
		}
		return false;
	}

	public Directory rootDirectory(String path) {
		
		File file = new File(path);
		Directory rootDirectory = new DirectoryT(); ///nzm
		
		file.mkdirs();
						//.....
		return null;
	}

	public int setSize(int size) {
		return 5;
	}

	public void createDir(String path, String name) {
		// TODO Auto-generated method stub
		
	}

	public void createMultipleDirs(String path, String name, int i) {
		// TODO Auto-generated method stub
		
	}

	public void deleteDir(String path, String name) {
		// TODO Auto-generated method stub
		
	}

	public void moveDir(String path1, String path2) {
		// TODO Auto-generated method stub
		
	}

	public void createFile(String path, String name) {
		// TODO Auto-generated method stub
		
	}

	public void createMultipleFiles(String path, String name, int i) {
		// TODO Auto-generated method stub
		
	}

	public void deleteFile(String path, String name) {
		// TODO Auto-generated method stub
		
	}

	public void moveFile(String path1, String path2) {
		// TODO Auto-generated method stub
		
	}

	public void uploadFile(String dest, String... paths) {
		// TODO Auto-generated method stub
		
	}

	public void downloadFile(String... paths) {
		// TODO Auto-generated method stub
		
	}

	public void listFilesInDir(String fileID) {
		// TODO Auto-generated method stub
		
	}

	public void listDirsInDir(String fileID) {
		// TODO Auto-generated method stub
		
	}

	public Directory rootDirectory() {
		// TODO Auto-generated method stub
		return null;
	}
	
}















