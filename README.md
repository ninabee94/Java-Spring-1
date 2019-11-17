# Java-Spring-1

Simple Java Spring Application for novice

To display simple messagge

     File created:
     
     studentClass.java (store variables, provide setter & getter)
     
     applicationContext.xml (configure bean for studentClass)
     
     displayClass.java (display configured bean)   
     

---------------------------
3. Create New Java Project
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
     
----------------------------
3. Create studentClass.java (package: studentPackage.java)
----------------------------
     
     put inside studentClass method :
     
     private String name;  
	  
	public String getName(){ return name; } 
	  
	public void setName(String name) {  
	    this.name = name;  
	}  
	  
	public void displayInfo(){  
	    System.out.println("Hello "+name);  
	}  
     

