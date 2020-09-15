<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Список</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css" />">
</head>
<body>
    <p align="center">${partS}</p>
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
                            <td>
                                <sf:form method="POST" action="/edit">
                                    <input type="hidden" name="id" value="${wordObject.id}">
                                    <input type="image" name="edit" src="<c:url value="/png/edit-document.png" />" height="20" title="Редактировать">
                                </sf:form>
                            </td>
                            <td>
                                <sf:form method="POST" action="/del">
                                    <input type="hidden" name="id" value="${wordObject.id}">
                                    <input type="image" name="del" src="<c:url value="/png/remove.png" />" height="20" title="Удалить">
                                </sf:form>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </td>
        </tr>
        <tr>
            <td> </td>
        </tr>
        <tr>
            <td> </td>
        </tr>
        <tr>
            <td>
                <sf:form method="POST" action="/add">
                    <input type="hidden" name="part" value="${part}">
                    <input type="submit" name="add" value="Добавить">
                </sf:form>
            </td>
        </tr>
        <tr>
            <td> </td>
        </tr>
        <tr>
            <td> </td>
        </tr>
        <tr>
            <td>
                <a href="<c:url value="/" />">В начало</a>
            </td>
        </tr>
    </table>
</body>
</html>
