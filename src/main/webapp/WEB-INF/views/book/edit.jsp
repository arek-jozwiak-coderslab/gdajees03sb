<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <style type="text/css">
        .error {
            background-color: red;
            color: white;
        }
    </style>
</head>

<body>
<h1>Add book</h1>
<form:form method="post" action="/book/edit" modelAttribute="book">
    <div><form:errors path="*" class="has-error" /></div>
    <div>
        Title:
        <form:input path="title" />
        <form:hidden path="id" />
        <form:errors path="title" cssClass="error" />
    </div>

    <div>
        <input type="submit" value="Save">
    </div>
</form:form>
</body>
</html>