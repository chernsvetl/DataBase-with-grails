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
        <h2>Recursive</h2>
    </div>
    <form class="form">
        Найти сумму зарплат работников менее 30000.
    </form>

    <div id="list-employee" class="content scaffold-list" role="main">
        <h1><g:message code="default.list.label" args="[entityName]" /></h1>
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>
        <table>
            <tr>
                <td>Sum</td>
            </tr>
            <g:each in="${results}" var="result">
                <tr>
                    <td>${result}</td>
                </tr>
            </g:each>
        </table>
    </div>
</div>
</body>
</html>