package displayPackage;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

import studentPackage.studentClass;

public class displayClass {

	public static void main(String[] args) {
	    Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    studentClass student=(studentClass)factory.getBean("studentbean");  
	    student.displayInfo();  
	}

}
