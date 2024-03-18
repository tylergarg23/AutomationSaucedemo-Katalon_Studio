Feature: Titulo de tus caracteristicas
	Acceder a Login del sitio web Saucedemo
	
Scenario Outline: Intente iniciar sesión en la aplicación con un usuario no válido
	Given Quiero administrar mi cuenta
	And Soy un usuario que <user type>
	When Envio las credenciales del log en
	Then No debería poder acceder a mi cuenta
	
	Examples:
		| user type |
		| is blocked |
	#	| is not active |