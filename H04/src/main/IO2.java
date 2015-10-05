package main;

import java.util.ArrayList;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

class TFile {
	
	public boolean __open;
	public int id;
	public Path path;
	private String name;
	
	public ArrayList<TFile> __files; //the whole opened files array.
	
	public TFile()
	{
		
	}
	
	public Path toPath(String path)
	{
		return Paths.get(path);
	}
	
	public boolean isOpen(String name, int ID)
	{
		if (__files.size() == 0)
			return false;
		
		int i;		
		for (i = 0; i < __files.size(); i++)
			if ((__files.get(i).name == name) || (__files.get(i).id == ID))
				return true;
		
		return false;
	}
	
	public boolean open(String path)
	{
		
		
		return true;
	}
	
	public boolean close(int ID)
	{
		
		return true;
	}
	
	public boolean close(String name)
	{
		
		
		return true;
	}
}

public class IO2 {
	
	private TFile __file = new TFile();
	
	public IO2() 
	{
		
	}
	
	public String read(String path) throws IOException
	{
		//if (__file.isOpen(file, -1))
			//__file.open(path + file);
		 
		StringBuilder res = new StringBuilder();
		InputStreamReader r = null;
		try {
		 	r = new InputStreamReader(new FileInputStream(path), "UTF-8");
		 	int c = 0; 
	        while ((c = r.read()) != -1) 
	            res.append((char) c);
	        
		} catch (IOException e) {
	        throw new RuntimeException(e);
		}
		 
		r.close();
		
		return res.toString();
	}
	
	public boolean write(String path, String text) throws IOException//(file, )
	{
		
		OutputStreamWriter r = null;
		try {
			r = new OutputStreamWriter(new FileOutputStream(path), "UTF-8");
			r.write(text);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return true;
	}
	
	public boolean write(String path, String text, int maxSize)
	{
		
		
		return true;
	}
	
}
