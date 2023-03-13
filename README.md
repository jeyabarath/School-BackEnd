# School-BackEnd

Import the dump file in MySQL **mysql_Dump20230311.zip**

Database connection details are in **application.properties**

Pre-Requisites -> Eclipse with JDK 1.8, Maven, Git

[School-FrontEnd](https://github.com/jeyabarath/School-FrontEnd) needed to be setup and running in another Eclipse Workspace

Import the project from Git into Eclipse, click Next all way along, choose New Project Wizard and ensure the location uses the **root** project folder

Convert as Maven Project as below after import from Git in Eclipse

![image](https://user-images.githubusercontent.com/16117201/224606230-e55669f8-5e24-4aa9-92a4-3050509e57cf.png)

Run the application from Eclipse

![image](https://user-images.githubusercontent.com/16117201/224606444-677a4308-ca63-4e0f-bb60-463fb8997588.png)


# Rest APIs

1. GET /students/all
2. GET /students/all/course
3. GET /students/all/{id}
4. GET /students/student/{id}
5. POST /students/add
6. POST /students/add/student/course
7. PUT /students/update/{id}
8. DELETE /students/delete/{id}


Postman export file [Student.postman_collection.zip](https://github.com/jeyabarath/School-BackEnd/files/10953787/Student.postman_collection.zip)
