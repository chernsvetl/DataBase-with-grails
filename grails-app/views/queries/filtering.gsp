<html>
<head>
    <meta name="layout" content="main"/>
    <g:set var="entityName" value="${message(code: 'queries.label', default: 'Query')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
    </ul>
</div>
<div>
    <div>
        <h2>Фильтры по любой комбинации полей</h2>
    </div>
    <form class="form">
        Выберите параметры :
        <tr>
            <td>Страна:</td>
        </tr>
        <label>
            <input type="country" value="${country}" name="country">
        </label>
        <tr>
            <td>Город:</td>
        </tr>
        <label>
            <input type="name" value="${name}" name="name">
        </label>
        <tr>
            <td>Расстояние от:</td>
        </tr>
        <label>
            <input type="from" value="${from}" name="from" min="0" max="100000">
        </label>
        <tr>
            <td>Расстояние до:</td>
        </tr>
        <label>
            <input type="to" value="${to}" name="to" min="0" max="100000">
        </label>
        <input type="submit" value="Обновить">
    </form>

    <div id="list-townsExample" class="content scaffold-list" role="main">
        <h1><g:message code="default.list.label" args="[entityName]" /></h1>
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>
        <f:table collection="${results}" />

    </div>
</div>
</body>
</html>