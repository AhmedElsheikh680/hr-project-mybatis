# hr-project-mybatis

Spring boot (RestfullAPI)

Technologies<br>
⦁ PostgreSQL Database <br>
⦁ Spring Web<br>
⦁ MyBatis Framework<br>
⦁ Postman(Testing)<br>
⦁ Build Tool (i.e. Maven) <br>

## Instructions To Run Backend
1- Just Extract The BACKEND Folder to STS(Spring Tool Suite) and run it as (Java Application) on port=8080.<br>
2- For Database You can Excute the sql file in your Sql Editor (it contain database creation statement) OR Just create the database(name=hr,username=postgres,pass=adminadmin) Maunally And Run The Application And It will create the Tables With It Objects.<br>
3- Then You Can Test It Using Postman.<br>

== Employee ==<br>
Return all Employees (GET : localhost:8080/api/v1/getAllEmps)<br>

== Depatment == <br>
Return all Depatment (GET : localhost:8080/api/v1/getAllDepts) <br>
Return Depatment (GET : localhost:8080/api/v1/getDeptById) With Request Param <br>
Add Depatment (POST : localhost:8080/api/v1/addDept) With Json Body <br>
Update Depatment (PUT : localhost:8080/api/v1/updateDept) With Json Body <br>
Delete Depatment (DELETE : localhost:8080/api/v1/deleteDept) With Request Param <br>
