<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Words</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css" />">
</head>
<body>
    <sf:form method="get" action="/list">
        <table align="center">
            <tr>
                <td>
                    <fieldset>
                        <p>
                            <input type="radio" name="part" value="1" checked>Существительные<br>
                            <input type="radio" name="part" value="2">Глаголы<br>
                            <input type="radio" name="part" value="3">Прилагательные
                        </p>
                    </fieldset>
                </td>
            </tr>
            <tr>
                <td>
                    <p><input type="submit" value="Выбрать"></p>
                </td>
            </tr>
        </table>
    </sf:form>
</body>
</html>
