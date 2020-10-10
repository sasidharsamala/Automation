Feature: Application Login

@DeletePlace
Scenario: DeletePlace
Given DeletePlace PayLoad
When User submits "DeletePlaceAPI" with "post" request
Then statuscode is displayed as 200
And "status" is "OK"

@AddPlace
 Scenario Outline: AddPlace
Given User builds Addplace request "<name>" "<language>" "<address>"
When User submits "AddPlaceAPI" with "post" request
Then A new place is created 
And statuscode is displayed as 200
#When User submits "GetPlaceAPI" with "get" request
And verify place_id created has "<name>" with "GetPlaceAPI" and "get" request

Examples:
|name|language|address|
|Gaurav technologies|Dutch|Old Town Road|
|Himani technologies|Hindi|New Town Road|
|Rahul technologies|Urdu|Old Town Road|


