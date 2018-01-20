<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>

<html>
<body>
<h2>This is the Registration page</h2>


<spring:form action="saveStudent/v1" method="post" ModelAttribute="st">
<spring:input path="sid" placeholder="Student ID"/><br/>
<spring:input path="sname" placeholder="Student Name"/><br/>
<spring:input path="mailId" placeholder="Email-ID"/><br/>
<spring:input path="address" placeholder="Address"/><br/>
<spring:password path="pwd" placeholder="Password"/>
<input type="submit" value="Register"/><br/>
</spring:form>
</body>
</html>
