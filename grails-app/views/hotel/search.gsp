<html>
<head>
	<title>Search Hotel</title>
	<meta name="layout" content="main" />
</head>
<body>
	<formset>
		<legend>Search for Hotel</legend>
		
		<g:form action="results">
			<label for="hotelsearch">Hotel</label>
			<g:textField name="hotelsearch" />
			<g:select name="country"
				from="${countres}"
				value="name"
				optionKey="name"/>
			
			<g:submitButton name="search" value="Search" />
		</g:form>
	</formset>
</body>
</html>