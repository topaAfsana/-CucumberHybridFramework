Feature: Registration functionality

Scenario: User creates an account only with mandatory fields
Given User navigates to Register Account page	
When User enters the details into below fields
	|firstName      | MD         |
	|lastName       | Parvesh    |
	|email          | abc@gmail.com |
	 