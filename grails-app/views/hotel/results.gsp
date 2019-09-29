<html>
	<head>
		<title>Search Results</title>
		<meta name="layout" content="main" />
	</head>
	<body>
		<g:if test="${hotels}">
	
		<h1>Results</h1>
		<p>Searched ${com.infosysco.Hotel.count()} records
		for items matching <em>${term}--${termcountry}</em>.
		Found <strong>${hotels.size()}</strong> hits.
		</p>
		<ul>
			<g:each var="hotel" in="${hotels}">
				<li>${hotel.name}---${hotel.star}</li>
			</g:each>
		</ul>
		<g:link action='search'>Search Again</g:link>
		
		</g:if>
		<g:else>
			<h1>По Вашему запросу ничего не найдено.</h1>
			<g:link action='search'>Search Again</g:link>
		</g:else>
	</body>
</html>