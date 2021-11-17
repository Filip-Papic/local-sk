package model;

import java.io.File;

import users.User;

public class StorageLocal implements Storage {

	private String path;
    private String name;
    private User user;
    
    
    public void create(String path, String name){
    	// TODO Auto-generated method stub
    	@SuppressWarnings("deprecation")
		FileLocal file;
		try {
			file = (FileLocal) Class.forName("model.FileLocal").newInstance();
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
		Directory rootDirectory = new DirectoryLocal(); ///nzm
		
		file.mkdirs();
						//.....
		return null;
	}

	public int setSize(int size) {
		return 5;
	}
	
}















