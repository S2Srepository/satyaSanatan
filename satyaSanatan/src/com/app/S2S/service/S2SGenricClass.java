package com.app.S2S.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Service
public class S2SGenricClass {
	
public Object saveFile(CommonsMultipartFile[] file,String path ,Object vi,String fileval) throws InstantiationException, IllegalAccessException{
	Class e = vi.getClass();
	String className = e.getName();
	Object obj = e.newInstance();
	try {

	String newPath = "";
	String newfile = "";
	
	if (file != null) {
		for (CommonsMultipartFile fl : file) {
			if (!fl.isEmpty()) {
				File f = new File(path);
				f.mkdirs();
				String filename = fl.getOriginalFilename();
				String ex = filename.substring(filename.lastIndexOf(".") + 1);
				newfile = filename+fileval + "." + ex;
				System.err.println("----" + ex + "-------");
				System.out.println(path + " " + filename);
				newPath = path + "/" + newfile;
				byte[] bytes = fl.getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(new File(path + File.separator + newfile)));
				stream.write(bytes);
				stream.flush();
				
					stream.close();
					Method setfilenameVale =e.getMethod("setFileName", String.class);
					setfilenameVale.invoke(obj, newfile);
					Method setfilepath =e.getMethod("setFilePath", String.class);
					setfilepath.invoke(obj, newPath);
				}
			}
		}
	}
		catch (Exception e1) {
					e1.printStackTrace();
				}
				return obj;
				
			
		
		
	}
}
