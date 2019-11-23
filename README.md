# Java-Spring-1

Simple Spring application to display a messagge

![alt text](https://user-images.githubusercontent.com/57636419/69020330-17d6ac80-09ef-11ea-8b38-2b971bbfedc7.JPG)

     File created:
     
     studentClass.java (store variables, provide setter & getter)<br>     
     applicationContext.xml (configure bean for studentClass)<br>    
     displayClass.java (display configured bean)   
     
<b>1. Create New Java Project</b>

     File -> New -> Java Project ->
     
     project name: Java-Spring-1<br>     
     execution environment: Java SE 1.8
     
     -> Finish

<b>2. Add Spring JAR Files</b>

     Download from https://static.javatpoint.com/src/sp/spcorejars.zip -> Extract files ->
     
     (Right click project) -> Build Path -> Configure Build Path -> (Libraries tab) ->
     
     Add external JAR :
     
          org.springframework.core-3.0.1.RELEASE-A<br>          
          com.springsource.org.apache.commons.logging-1.1.1<br>       
          org.springframework.beans-3.0.1.RELEASE-A
          
     Apply -> Apply and close
     
<b>3. Create studentClass.java (package: studentPackage.java)</b>
     
     //put inside studentClass method :
     
        private String name;  	  
	public String getName(){ return name; } 	  
	public void setName(String name) { this.name = name; }  	  
	public void displayInfo(){ System.out.println("Hello "+name); }  
	
<b>4. Create applicationContext.xml inside src folder</b>

     //paste in new line :
        
     <beans xmlns="http://www.springframework.org/schema/beans"  	    
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 	    
            xmlns:p="http://www.springframework.org/schema/p"  	    
            xsi:schemaLocation="http://www.springframework.org/schema/beans  	    
                                http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">    
           <bean id="studentbean" class="studentPackage.studentClass">  	   
                <property name="name" value="John Wick"></property>  		
           </bean>    
     </beans>  
     
<b>5. Create displayClass.java (package: displayPackage.java)</b>

     //import these :
     
     import org.springframework.beans.factory.BeanFactory;       
     import org.springframework.beans.factory.xml.XmlBeanFactory;       
     import org.springframework.core.io.ClassPathResource;       
     import org.springframework.core.io.Resource;  
     import studentPackage.studentClass;    


     //add these inside public static void main
     
     Resource resource=new ClassPathResource("applicationContext.xml");       
     BeanFactory factory=new XmlBeanFactory(resource);  	      
     studentClass student=(studentClass)factory.getBean("studentbean");      
     student.displayInfo(); 
     
<b>6. Run the application</b>

