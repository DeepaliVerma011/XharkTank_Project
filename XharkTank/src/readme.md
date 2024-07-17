Run the Application
Run the Spring Boot application.
Use Postman to test the APIs. For example:
Create a new pitch: POST /api/pitches
Get all pitches: GET /api/pitches
Get pitch by ID: GET /api/pitches/{id}
Create a new investment: POST /api/investments
Get investments by pitch ID: GET /api/investments/pitch/{pitchId}

Great, it looks like your Spring Boot application has started successfully on port 8080. Now, let's test your application locally.

Step 1: Verify MongoDB is Running
Ensure your MongoDB server is running. If you have MongoDB installed locally, you can start it with the following command:

bash
mongod
If you're using a MongoDB Atlas cluster, ensure that your application is configured to connect to it in your application.properties.

Step 2: Use Postman to Test APIs
Creating a New Pitch
Open Postman.
Create a new POST request.
Set the URL to http://localhost:8080/api/pitches.
In the Body tab, select raw and JSON format.
Add the following JSON payload:
json

{
    "entrepreneur": "John Doe",
    "pitchTitle": "Revolutionary Tech",
    "pitchDescription": "An innovative solution to modern problems.",
    "askAmount": 100000,
    "equityPercentage": 10,
    "offerAmount": 0
}
Click Send.
Getting All Pitches
Create a new GET request.
Set the URL to http://localhost:8080/api/pitches.
Click Send.
Getting a Pitch by ID
Create a new GET request.
Set the URL to http://localhost:8080/api/pitches/{id}, replacing {id} with the ID of the pitch you created.
Click Send.
Creating a New Investment
Create a new POST request.
Set the URL to http://localhost:8080/api/investments.
In the Body tab, select raw and JSON format.
Add the following JSON payload:
json

{
    "pitchId": "id_of_the_pitch",
    "investorName": "Jane Doe",
    "investmentAmount": 50000,
    "equityOffered": 5
}
Replace id_of_the_pitch with the actual pitch ID.
5. Click Send.

Getting Investments by Pitch ID
Create a new GET request.
Set the URL to http://localhost:8080/api/investments/pitch/{pitchId}, replacing {pitchId} with the ID of the pitch.
Click Send.
Step 3: Check Logs and Database
Logs: Check your application's logs to ensure there are no errors.
Database: Use a MongoDB client like MongoDB Compass to verify that the data is being correctly stored in your MongoDB database.