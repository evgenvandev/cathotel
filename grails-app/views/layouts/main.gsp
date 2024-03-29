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

<header>
	<div class="navblock">
		<ul>
			<li><g:link controller="country" action="index" target="_blank">Справочник стран</g:link></li>
			<li><g:link controller="hotel" action="index" target="_blank">Справочник отелей</g:link></li>
		</ul>
	</div>
</header>

<g:layoutBody/>

</body>
</html>
