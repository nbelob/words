<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Список</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css" />">
</head>
<body>
    <p align="center">${part}</p>
    <table align="center">
        <tr>
            <td>
                <table>
                    <tr>
                        <td class="head">Слово</td>
                        <td class="head">Перевод</td>
                    </tr>
                    <c:forEach items="${wordObjectList}" var="wordObject">
                        <tr>
                            <td class="set">
                                    ${wordObject.word}
                            </td>
                            <td class="set">
                                    ${wordObject.trans}
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </td>
        </tr>
    </table>
</body>
</html>
