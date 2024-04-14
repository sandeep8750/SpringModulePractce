package in.sandeep.test;

import java.nio.file.FileSystem;
import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.sandeep.comp.WishMessageGenerator;

public class TestMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemResource fileSystemResource = new FileSystemResource("in/sandeep/cfg/Application.xml");
		
		XmlBeanFactory BeanFactory = new XmlBeanFactory(fileSystemResource);
		
		WishMessageGenerator wmg = BeanFactory.getBean("wmg" , WishMessageGenerator.class);
		
		
		String message = wmg.generateMessage("sandeep");
		
		System.out.println(message);
		
		
	}		

}

