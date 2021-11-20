package model;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import users.User;

public class FileT implements model.File{

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

	public List<String> lookup(String path, String name) { //tj. find
		
		List<String> result = null;

        try (Stream<Path> walk = Files.walk(Paths.get(path))) {
            result = walk
                    .filter(p -> !Files.isDirectory(p))
                    .map(p -> p.toString().toLowerCase())
                    .filter(f -> f.endsWith(name))
                    .collect(Collectors.toList());
        } catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println(result);
        return result;
	}

	@Override
	public Set<String> lookupAllFilesinDir(String path) {
		Set<String> fileList = new HashSet<>();
	    try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(path))) {
	        for (Path path2 : stream) {
	            if (!Files.isDirectory(path2)) {
	                fileList.add(path2.getFileName()
	                    .toString());
	            }
	        }
	    } catch (IOException e) {
			e.printStackTrace();
		}
	    System.out.println(fileList);
	    return fileList;
	}

	@Override
	public void lookupAllFilesWithExtension(String path, String ext) {
		List<String> files = lookup(path, ext);
        files.forEach(x -> System.out.println(x));
        System.out.println(files);
	}

	@Override
	public void lookupAllFilesSortedName(String path) {
		Set<String> files = lookupAllFilesinDir(path);
		List<String> sortedList = new ArrayList<>(files);
		Collections.sort(sortedList);
        sortedList.forEach(x -> System.out.println(x));
        System.out.println(sortedList);
	}

	@Override
	public void lookupAllFilesSortedDate(String path) {
		File file = new File(path);
		File[] files = file.listFiles();

		Arrays.sort(files, new Comparator<File>(){
		    public int compare(File f1, File f2)
		    {
		        return Long.valueOf(f1.lastModified()).compareTo(f2.lastModified());
		    } });
		for (File file1 : files) {
			System.out.println(" " + file1.getName() + " " + file1.lastModified());
		}

	}

	@Override
	public void lookupAllFilesSortedEdit(String path) {
		File file = new File(path);
		File[] files = file.listFiles();

		Arrays.sort(files, new Comparator<File>(){
		    public int compare(File f1, File f2)
		    {
		        return Long.valueOf(f1.lastModified()).compareTo(f2.lastModified());
		    } });
		for (File file1 : files) {
			System.out.println(" " + file1.getName() + " " + file1.lastModified());
		}
	}

	@Override
	public void lookupAllFilesInDate(String path, Date date) {
		//nzm
	}

	@Override
	public void lookupAllFilesInWholeDir(String path, String name) {
		//vec ima gore
	}
	
	@Override
	public void checkPrivilegeFile(User user) {
		//useri
	}

	@Override
	public void download(String path) {
		//drive
	}

	@Override
	public void upload(String path, String dest) {
		//drive
	}

	@Override
	public void downloadDrive(String name, String id) {
		//drive
	}

	@Override
	public void uploadDrive(String name, String id) {
		//drive
	}

}
