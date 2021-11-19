
<%
String op1 = request.getParameter("op1");
String op2 = request.getParameter("op2");
String btn = request.getParameter("btn");
%>
<html>
	<body>
		<form>
			<label>Operand1 <input type='number' name='op1'/></label>
			<label>Operand2 <input type='number' name='op2'/></label>
			<button name='btn' value='sum'>Sum</button>
			<button name='btn' value='dif'>Difference</button>
			<button name='btn' value='prd'>Product</button>
			<button name='btn' value='qut'>Quetiont</button>
			<button name='btn' value='rem'>Reminder</button>
		</form>
		
		<% if(op1!=null && op2!=null) {	
			int n1 = Integer.parseInt(op1); 
			int n2 = Integer.parseInt(op2); 
		%>
			<hr />	
			<p>
				<strong>
					<% switch(btn) { 
						case "sum": out.print("Sum is "+(n1+n2)); break; 
						 case "dif":out.print("Dif is "+(n1-n2)); break; 
						 case "prd":out.print("Prd is "+(n1*n2)); break;
						 case "qut":out.print("Qut is "+(n1/n2)); break; 
						 case "rem":out.print("Rem is "+(n1%n2)); break; 
					} %>
				</strong>
			</p>
		<%} %>
	</body>
</html>