<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<jsp:include page="../header.jsp" />
<h1>Add book</h1>
<form:form method="post" modelAttribute="book">
    <div><form:errors path="*" class="has-error" /></div>
    <div>
        Title:
        <form:input path="title" />
        <form:errors path="title" cssClass="error" />
    </div>
    <div>
        Description:
        <form:textarea path="description" />
        <form:errors path="description" cssClass="error" />
    </div>

    <div>
        Rating:
        <form:input path="rating" />
        <form:errors path="rating" cssClass="error" />
    </div>
    <div>
        Active:
        <form:radiobutton path="active" value="true" />
        <form:radiobutton path="active" value="false" />
    </div>
    <div>
        <input type="submit" value="Save">
    </div>
</form:form>
<jsp:include page="../footer.jsp" />