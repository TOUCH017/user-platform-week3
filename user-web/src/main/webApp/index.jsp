<head>
<jsp:directive.include
	file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
<title>My Home Page</title>
</head>
<body>
	<div class="container-lg">
		<%
			String site = new String("http://localhost:8080/jolokia/list");
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site);
		%>


	</div>
</body>