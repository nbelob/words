<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Редактирование</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css" />">
</head>
<body>
    <sf:form method="POST" modelAttribute="editForm">
        <table align="center">
            <tr>
                <td>Слово</td>
                <td>
                    <input type="text" name="word" value=${editForm.word}>
                </td>
            </tr>
            <tr>
                <td>Перевод</td>
                <td>
                    <input type="text" name="trans" value=${editForm.trans}>
                    <input type="hidden" name="typeWord" value=${editForm.typeWord}>
                </td>
            </tr>
        </table>
        <br>
        <div align="center">
            <input type="submit" name="ok" value="Сохранить">
        </div>
    </sf:form>
</body>
</html>
