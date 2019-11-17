# Java-Spring-1

Simple Java Spring Application for novice

To display simple messagge

     File created:
     
     studentClass.java (store variables, provide setter & getter)
     
     applicationContext.xml (configure bean for studentClass)
     
     displayClass.java (display configured bean)   
     

---------------------------
1. Create New Java Project
---------------------------

     File -> New -> Java Project ->
     
     project name: Java-Spring-1
     
     execution environment: Java SE 1.8
     
     -> Finish

------------------------
2. Add Spring JAR Files
------------------------

     Download from file:///C:/Users/User/Downloads/spcorejars.zip -> Extract files ->
     
     (Right click project) -> Build Path -> Configure Build Path -> (Libraries tab) ->
     
     Add external JAR :
     
          org.springframework.core-3.0.1.RELEASE-A
          
          com.springsource.org.apache.commons.logging-1.1.1
          
          org.springframework.beans-3.0.1.RELEASE-A
          
     Apply -> Apply and close
     
----------------------------------------------------------
3. Create studentClass.java (package: studentPackage.java)
----------------------------------------------------------
     
     //put inside studentClass method :
     
             private String name;  
	  
	public String getName(){ return name; } 
	  
	public void setName(String name) { this.name = name; }  
	  
	public void displayInfo(){ System.out.println("Hello "+name); }  
	
--------------------------------------------------
4. Create applicationContext.xml inside src folder
--------------------------------------------------

     //paste in new line :
        
     <beans  
	
            xmlns="http://www.springframework.org/schema/beans"  
	    
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
	    
            xmlns:p="http://www.springframework.org/schema/p"  
	    
            xsi:schemaLocation="http://www.springframework.org/schema/beans  
	    
                                http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">  
  
           <bean id="studentbean" class="studentPackage.studentClass">  
	   
                <property name="name" value="John Wick"></property>  
		
           </bean>  
  
       </beans>  
     
----------------------------------------------------------
5. Create displayClass.java (package: displayPackage.java)
----------------------------------------------------------

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
     
------------------
6. Run the Project
------------------

     Sample output : Hello John Wick

