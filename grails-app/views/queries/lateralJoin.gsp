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
        <h2>Lateral join</h2>
    </div>
    <form class="form">
        Вывести время первого ремонта самолета, идентификатор и время следующего ремонта, если таковые имеются.
    </form>

    <div id="list-employee" class="content scaffold-list" role="main">
        <h1><g:message code="default.list.label" args="[entityName]" /></h1>
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>
        <table>
            <tr>
                <td>Plane Id</td>
                <td>First repair time</td>
                <td>Next repair time</td>
                <td>Next repair Id</td>

            </tr>
            <g:each in="${results}" var="result">
                <tr>
                    <td>${result.getV4()}</td>
                    <td>${result.getV2()}</td>
                    <td>${result.getV3()}</td>
                    <td>${result.getV1()}</td>
                </tr>
            </g:each>
        </table>
    </div>
</div>
</body>
</html>