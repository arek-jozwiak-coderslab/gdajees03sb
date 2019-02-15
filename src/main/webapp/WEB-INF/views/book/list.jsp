<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../header.jsp" />
<h1>List books</h1>
<table>
    <tr>
        <th>Title</th>
        <th>Description</th>
        <th>rating</th>
        <th>Akcje</th>
    </tr>
    <c:forEach items="${books}" var="boo">
        <tr>
            <td>${boo.title}</td>
            <td>${boo.description}</td>

            <td>${boo.rating}</td>
            <td><a href="<c:url   value="/book/edit/${boo.id}"/>">Edytuj</a>
                <a href="<c:url   value="/book/delete/${boo.id}"/>">Usuń</a></td>
        </tr>
    </c:forEach>
</table>
<jsp:include page="../footer.jsp" />