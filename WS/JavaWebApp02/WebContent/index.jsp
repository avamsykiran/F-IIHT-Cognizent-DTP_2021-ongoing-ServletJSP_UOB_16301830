
<%@page import="com.cts.jwa.service.WelcomeServiceImpl"%>
<%@page import="com.cts.jwa.service.WelcomeService"%>

<%! WelcomeService welcomeService = new WelcomeServiceImpl(); %>

<%
String userName = request.getParameter("unm");

if(userName==null)
	userName="Nobody";
%>

<html>
	<body>
		<form>
			<label>UserName <input type='text' name='unm'/></label>
			<button>SEND</button>
		</form>
		
		<h2> <%=welcomeService.getWelcomeText()%>  <%=userName%></h1>
	</body>
</html>