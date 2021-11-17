package model;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import users.User;

public class FileLocal implements model.File{

	
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
	
	public void createMultiple(String path, String name, int amount) {
		// TODO Auto-generated method stub
		for(int i = 0; i < amount;i++) {
			create(path, name + (i+1));
		}
		
	}

	public void delete(String path, String name) {

		Path path2 = Paths.get(path + "\\" + name);
		//Path path3 = Paths.get(name);
				
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
				e.printStackTrace();
			}
		}
	}

	public File[] lookup(String path, String name) { //tj. find
		
		java.io.File file = new File(path);
		final String string = path;
		File[] matches = file.listFiles(new FilenameFilter()
		{
			public boolean accept(File dir, String name)
			{
				return name.startsWith(string); //&& name.endsWith(); za ekstenzije 
			}
		});
		return matches; // nzm ne radi
		
		/*
		File[] list = file.listFiles();
        if(list!=null)
        for (File fil : list)
        {
            if (fil.isDirectory())
            {
                findFile(name,fil);
            }
            else if (name.equalsIgnoreCase(fil.getName()))
            {
                System.out.println(fil.getParentFile());
            }
        }
        */
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
	
	public void downloadDrive(String name, String id) {
		
	}

	public void uploadDrive(String name, String id) {
		
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
