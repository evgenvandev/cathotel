<html>
<head>
	<title>Search Hotel</title>
	<meta name="layout" content="main" />
</head>
<body>
	<formset>
		<legend>Поиск по отелям</legend>
		
		<g:form action="results">
			<label for="hotelsearch">Отель</label>
			<g:textField name="hotelsearch" />
			<g:select name="country"
				from="${countres}"
				value="name"
				optionKey="name"/>
			
			<g:submitButton name="search" value="Найти" />
		</g:form>
	</formset>
</body>
</html>