package main;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.*;

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
	        
	        r.close();
	        
		} catch (IOException e) {
	        throw new RuntimeException(e);
		}
		 
		r.close();
		
		return res.toString();
	}
	
	public boolean write(String path, String text, boolean append) throws IOException//(file, )
	{
		
		OutputStreamWriter r = null;
		try {
			r = new OutputStreamWriter(new FileOutputStream(path, append), "UTF-8");
			r.write(text);

			r.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public void copy(String from, String to) throws IOException
	{	
		try{
			write(to, read(from), false);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return;
	}
	
	public boolean copy(String from, String to, int maxSize) throws IOException
	{
		String s = "";
		String a[];
		StringBuilder r = new StringBuilder();

		try {
			s = read(from);
			a = s.split("\\R");
			
			int i;			
			for (i = 0; i < a.length; i++)
			{
				if (a[i].length() == 0)
					continue;
				
				if ((a[i].trim().isEmpty()))
					continue;
				
				r.setLength(0);
				r.append(a[i]);
				if (a[i].length() < maxSize)
				{
					if (a[i].contains("v"))
						write(to, r.append(System.getProperty("line.separator")).toString(), true);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	public void readZip(String name) throws IOException
	{
		try {
			ZipFile zipf = new ZipFile(name);
			FileInputStream file = new FileInputStream(name);
			ZipInputStream zip = new ZipInputStream(new BufferedInputStream(file));
			
			ZipEntry entry;
			
			while ((entry = zip.getNextEntry()) != null)
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(zipf.getInputStream(entry), "UTF-8"));			
				
				String s;
				while ((s = br.readLine()) != null)
					System.out.println(s);
				
			}
			
			zip.close();
			zipf.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
