## JDBC Demo 1
1. create a java project (not maven project)
2. Download mysql-connector
   > https://downloads.mysql.com/archives/c-j/
   - platform independent, unzip and use .jar file
3. File -> Project Structure -> Modules -> add mysql-connector jar file
4. create a database
   cmd -> `mysql -u root -p`
   
   > create table employee (id int primary key auto_increment, name char(50), email c
            har(50));
5. > select * from employee;