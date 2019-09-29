<html>
	<head>
		<title>Search Results</title>
		<meta name="layout" content="main" />
	</head>
	<body>
		<g:if test="${hotels}">
	
		<h1>Результаты поиска</h1>
		<p><!--Searched ${com.infosysco.Hotel.count()} records
		for items matching <em>${term}--${termcountry}</em>.-->
		Найдено <strong>${hotels.size()}</strong> отелей.
		</p>
		<!-- <ul>
			<g:each var="hotel" in="${hotels}">
				<li>${hotel.name}---${hotel.star}</li>
			</g:each>
		</ul> -->
		
		<table>
			<thead>
				<tr>
					<th>Звёздность</th>
					<th>Название отеля</th>
				</tr>
			</thead>
			<tbody>
				<g:each var="hotel" in="${hotels}">
					<tr>
						<th>${hotel.star}</th>
						<th>${hotel.name}
							<g:if test="${hotel.homepage}">
								<a href="${hotel.homepage}" target="_blank">Перейти на сайт</a>
							</g:if>
						</th>
					</tr>
				</g:each>
			</tbody>
		</table>
		
		<g:link action='search'>Новый поиск</g:link>
		
		</g:if>
		<g:else>
			<h1>По Вашему запросу ничего не найдено.</h1>
			<g:link action='search'>Search Again</g:link>
		</g:else>
	</body>
</html>