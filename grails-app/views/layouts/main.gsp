<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark navbar-static-top" role="navigation">
    <div class="container-fluid">
        <a class="navbar-brand" href="/#">Main page</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" aria-expanded="false" style="height: 0.8px;" id="navbarContent">
            <ul class="nav navbar-nav ml-auto">
                <g:pageProperty name="page.nav"/>
            </ul>
        </div>
    </div>
</nav>

<g:layoutBody/>

<div class="footer" role="contentinfo">
    <div class="container-fluid">
        <div class="row">
            <div class="col">
                <a href="https://www.gismeteo.ru/weather-novosibirsk-4690/" target="_blank">
                    <asset:image src="d654aede.jpeg"/>
                </a>
                <strong class="centered"><a href="https://www.gismeteo.ru/weather-novosibirsk-4690/" target="_blank">Weather</a></strong>
                <p>Do you want to know weather today? It is very important to dress for the weather!<a href="https://www.gismeteo.ru/weather-novosibirsk-4690/">

            </div>
            <div class="col">
                <a href="https://www.tripadvisor.ru/Attractions-g298529-Activities-Novosibirsk_Novosibirsky_District_Novosibirsk_Oblast_Siberian_District.html" target="_blank">
                    <asset:image src="dostoprimechatelnosti-novosibirska.jpeg" alt="Sights of Novosibirsk" class="float-left"/>
                </a>
                <strong class="centered"><a href="https://www.tripadvisor.ru/Attractions-g298529-Activities-Novosibirsk_Novosibirsky_District_Novosibirsk_Oblast_Siberian_District.html" target="_blank">Sights of Novosibirsk</a></strong>
                <p>Read about fascinating places on Novisibirsk. Have a good trip!

            </div>
            <div class="col">
                <a href="https://tolmachevo.ru/?utm_source=google.com&utm_medium=organic&utm_campaign=google.com&utm_referrer=google.com" target="_blank">
                    <asset:image src="Unknown.jpeg" alt="Grails Slack" class="float-left"/>
                </a>
                <strong class="centered"><a href="https://tolmachevo.ru/?utm_source=google.com&utm_medium=organic&utm_campaign=google.com&utm_referrer=google.com" target="_blank">Airport</a></strong>
                <p>Know more information about local airport in Novosibirsk.
            </div>
        </div>
    </div>
</div>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
