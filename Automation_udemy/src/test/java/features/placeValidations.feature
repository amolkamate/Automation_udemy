Feature: validating Place APIs
Scenario: Verify if Place is being succesfully added using AddPlaceAPI
Given Add Place Payload
When user call "AddPlaceAPI" with Post http request
Then the API call got success with status code 200
And "status" in response body is "oak"