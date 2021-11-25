<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<html>
	<head>
	</head>
	<body>
		<h3 style="text-align:center">Contacts List</h3>
		<nav style="text-align:center;padding:10px;">
			<a href="newContact">Add New Contact</a>
		</nav>
		<c:choose>
			<c:when test="${contactsList==null || contactsList.isEmpty() }">
				<p><strong>No records available</strong>
			</c:when>
			<c:otherwise>
				<table style="width:50%;margin:auto;border:2px solid black;">
					<thead>
						<th>Contact#</th>
						<th>Contact Name</th>
						<th>Mobile</th>
						<th></th>
					</thead>
					<tbody>
						<c:forEach items="${contactsList }" var="contact">
							<tr>
								<td>${contact.id }</td>
								<td>${contact.name }</td>
								<td>${contact.mobile }</td>
								<td>
									<a href="delContact?cid=${contact.id}">DELETE</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:otherwise>
		</c:choose>
	</body>
</html>