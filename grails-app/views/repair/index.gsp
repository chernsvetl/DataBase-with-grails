<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <g:set var="entityName" value="${message(code: 'repair.label', default: 'Repair')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body onload="initFields()">
<a href="#list-repair" class="skip" tabindex="-1"><g:message code="default.link.skip.label"
                                                           default="Skip to content&hellip;"/></a>

<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="create" action="create"><g:message code="default.new.label"
                                                              args="[entityName]"/></g:link></li>
    </ul>
</div>

<div id="list-repair" class="content scaffold-list" role="main">
    <h1><g:message code="default.list.label" args="[entityName]"/></h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <f:table collection="${repairList}" except="[]"/>

    <div class="pagination">
        <g:paginate total="${repairCount ?: 0}"/>
    </div>
</div>



<form action="index" method="get" name="filters" id="filters">
    <fieldset class="form">
        <div class="fieldcontain required">
            <h4 class="fieldcontain required">Filters</h4>
        </div>
        <div class="fieldcontain required">
            <label for="fromDate">Start time from</label>
            <input type="date" id="fromDate" name="fromDate" placeholder="from" value="${params.fromDate}"/>
        </div>

        <div class="fieldcontain required">
            <label for="toDate">Start time to</label>
            <input type="date" id="toDate" name="toDate" placeholder="to" value="${params.toDate}"/>
        </div>
        <div class="fieldcontain required">
            <label for="fromDateEnd">End time from</label>
            <input type="date" id="fromDateEnd" name="fromDateEnd" placeholder="from" value="${params.fromDateEnd}"/>
        </div>

        <div class="fieldcontain required">
            <label for="toDateEnd">End time to</label>
            <input type="date" id="toDateEnd" name="toDateEnd" placeholder="to" value="${params.toDateEnd}"/>
        </div>

        <div class="fieldcontain required">
            <label for="plane">Plane</label>
            <select name="plane" id="plane">
                <option value="-1"></option>
            </select>
        </div>

        <div class="fieldcontain">
            <input type="button" name="create" class="save" value="Применить" id="create" onclick="validateAndSend()">
            <input type="button" name="reset" value="Сбросить" onclick="resetFilterForm()">
        </div>
    </fieldset>
</form>
<script>
    function resetFilterForm() {
        document.querySelector('#plane').value = ""
        document.querySelector('#fromDate').value = ""
        document.querySelector('#toDate').value = ""
        document.querySelector('#fromDateEnd').value = ""
        document.querySelector('#toDateEnd').value = ""
    }

    function validateAndSend() {
        const filters = document.querySelector('#filters')
        const fromDate = document.querySelector('#fromDate').value
        const toDate = document.querySelector('#toDate').value
        const fromDateEnd = document.querySelector('#fromDateEnd').value
        const toDateEnd = document.querySelector('#toDateEnd').value

        if (fromDate !== '' && toDate !== '') {
            var d1 = new Date(fromDate);
            var d2 = new Date(toDate);
            var d3 = new Date(fromDateEnd);
            var d4 = new Date(toDateEnd);
            if ((d1.getTime() > d2.getTime()) || (d3.getTime() > d4.getTime())) {
                alert('Time from должен быть раньше, чем Time to!')
                return false
            }
        }
        filters.submit();
    }
</script>
<script>
    setTimeout(initFields, 10)
    function initFields() {
        const http = new XMLHttpRequest();
        const url = "http://localhost:8080/plane.json"


        http.open("GET", url);
        http.send();
        http.onreadystatechange = (e) => {
            console.log(http.response)
            const planeSelector = document.querySelector('#plane')
            if (planeSelector.options.length > 1) {
                return
            }

            const length = planeSelector.options.length
            const planes = JSON.parse(http.response)

            planes.forEach(function (value) {
                var opt = document.createElement('option');
                opt.value = value.id;
                opt.innerHTML = value.name;
                opt.text = value.id
                planeSelector.appendChild(opt);
            })
            initPlane()
        }
    }

    function getUrlVars() {
        var vars = {};
        var parts = window.location.href.replace(/[?&]+([^=&]+)=([^&]*)/gi, function (m, key, value) {
            vars[key] = value;
        });
        return vars;
    }



    function initPlane() {
        const planeSelector = document.querySelector('#plane')
        var plane = getUrlVars()["plane"]
        if (plane === undefined) {
            plane = -1
        }
        for (var i = 0, len = planeSelector.options.length; i < len; i++) {
            var opt = planeSelector.options[i];
            if (opt.value.toString() === plane.toString()) {
                console.log(i)
                planeSelector.selectedIndex = i
                break
            }
        }
    }

</script>
</body>
</html>