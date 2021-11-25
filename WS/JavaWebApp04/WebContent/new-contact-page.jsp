<html>
	<head>
	</head>
	<body>
		<h3 style="text-align:center">New Contact</h3>
		
		<form action="addContact" method="POST" 
			style="width:50%;margin:auto;border:2px solid black;padding:10px;">
			<div>
				<label>Contact Id:
					<input type="number" name="cid" requried />
				</label>
			</div>
			<div>
				<label>Contact Name:
					<input type="text" name="cnm" requried />
				</label>
			</div>
			<div>
				<label>Mobile Number:
					<input type="text" name="mob" requried pattern="[1-9][0-9]{9}" />
				</label>
			</div>
			<div style="text-align:right">
				<button>SAVE CONTACT</button>
			</div>
		</form>
	</body>
</html>