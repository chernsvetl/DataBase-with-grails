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
        <h2>Window Function</h2>
    </div>
    <form class="form">
        Сравнить различные рейсы по стоимости и найти максимальную цену за билет на рейс.
    </form>

    <div id="list-employee" class="content scaffold-list" role="main">
        <h1><g:message code="default.list.label" args="[entityName]" /></h1>
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>
        <table>
        <tr>
            <td>Id</td>
            <td>FlightsId</td>
            <td>Price</td>
            <td>MaxTicketPrice</td>
        </tr>
        <g:each in="${results}" var="result">
            <tr>
                <td>${result.getV1().getId()}</td>
                <td>${result.getV1().getFlightsId()}</td>
                <td>${result.getV1().getPrice()}</td>
                <td>${result.getV2()}</td>
            </tr>
        </g:each>
        </table>
    </div>
</div>
</body>
</html>