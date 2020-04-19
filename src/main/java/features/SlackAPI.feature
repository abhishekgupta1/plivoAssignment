Feature: SDET API Assignment by Abhishek 

Scenario Outline: Create a new Channel 
	Given api URL "<URI>" , channel name "<CHANNEL-NAME>", and User-Token "<TOKEN>", 
	When User hits the API 
	Then Verify the Success Response Status-Code 200 
	And Verify the response received under 1 Second 
	And Verify the response is in JSON Format 
	And Verify the response is a valid Json 
	And Verify the Schema of the Response 
	And Verify the property Channel-id, Channel-name, Channel-Creator in the response JSON 
	Examples: 
		|URI| CHANNEL-NAME| TOKEN|
		|CREATE|CHANNEL-NAME| USER-TOKEN|
		
		
Scenario Outline: Join the newly created Channel 
	Given api URL "<URI>" , channel name "<CHANNEL-NAME>", and User-Token "<TOKEN>", 
	When User hits the API 
	Then Verify the Success Response Status-Code 200 
	And Verify the response received under 1 Second 
	And Verify the response is in JSON Format 
	And Verify the response is a valid Json 
	And Verify the Schema of the Response 
	And Verify the property Channel-id, Channel-name, Channel-Creator in the response JSON 
	And Verify the property Already-In-Channel should be true 
	Examples: 
		|URI| CHANNEL-NAME| TOKEN|
		|JOIN|CHANNEL-NAME| USER-TOKEN|
		
Scenario Outline: Rename the Channel 
	Given api URL "<URI>" , channel new name "<CHANNEL-NEW-NAME>", Channel ID "<channelID>" and User-Token "<TOKEN>", 
	When User hits the API 
	Then Verify the Success Response Status-Code 200 
	And Verify the response received under 1 Second 
	And Verify the response is in JSON Format 
	And Verify the response is a valid Json 
	And Verify the Schema of the Response 
	And Verify the property Channel-id, Channel-New-Name, Channel-Creator in the response JSON 
	Examples: 
		|URI| CHANNEL-NEW-NAME| TOKEN|
		|JOIN|CHANNELNEWNAME| USER-TOKEN|
		
Scenario Outline: 
	List all Channels and Validate if the Channel name has changed successfully 
	Given api URL "<URI>" and User-Token "<TOKEN>", 
	When User hits the API 
	Then Verify the Success Response Status-Code 200 
	And Verify the response received under 1 Second 
	And Verify the response is in JSON Format 
	And Verify the response is a valid Json 
	And Verify the Schema of the Response 
	And Verify the property Channel-id, Channel-Name, Channel-Creator in the response JSON 
	And Verify the channel new name "<CHANNEL-NEW-NAME>" which is been created and check the Archived Status which should be false 
	Examples: 
		|URI| TOKEN|CHANNEL-NEW-NAME|
		|JOIN|USER-TOKEN|CHANNELNEWNAME|
		
Scenario Outline: Archive the Channel 
	Given api URL "<URI>", Channel-ID "<CHANNELID>" and User-Token "<TOKEN>", 
	When User hits the API 
	Then Verify the Success Response Status-Code 200 
	And Verify the response received under 1 Second 
	And Verify the response is in JSON Format 
	And Verify the response is a valid Json 
	And Verify the Schema of the Response 
	Examples: 
		|URI| CHANNELID|TOKEN|
		|JOIN|CHANNELID|USER-TOKEN|
		
		
Scenario Outline: Validate if the Channel is archived successfully 
	Given api URL "<URI>" and User-Token "<TOKEN>", 
	When User hits the API 
	Then Verify the Success Response Status-Code 200 
	And Verify the response received under 1 Second 
	And Verify the response is in JSON Format 
	And Verify the response is a valid Json 
	And Verify the Schema of the Response 
	And Verify the property Channel-id, Channel-New-Name, Channel-Creator in the response JSON 
	And Verify the channel new name "<CHANNEL-NEW-NAME>" which is been created and check the Archived Status which should be false 
	Examples: 
		|URI| TOKEN|CHANNEL-NEW-NAME|
		|JOIN|USER-TOKEN|CHANNELNEWNAME|
	