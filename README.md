# MakerSharksAssign-1
Implement a user registration and user details fetch endpoints for a RESTful API using Spring Boot.
Use postman
User Registration Endpoint:

URL: /api/user/register
Method: POST
Description: This endpoint allows you to register a new user.
Request Body: JSON object containing username, email, and password.
Response:
201 Created: If the user is successfully registered.
400 Bad Request: If there is an error during registration.

User Details Fetch Endpoint:

URL: /api/user/fetch
Method: GET
Description: This endpoint fetches the details of a user based on the provided username.
Query Parameter: username
Response:
200 OK: If the user is found. The response body contains the user details.
404 Not Found: If the user is not found.


