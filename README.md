# BookMyCabApplication
Hitting the exposed endpoint /add-user to add a new user to the BookMyCabApplication:
![Postman_user](https://user-images.githubusercontent.com/67758115/194436373-10821dd2-b587-46b2-9c04-6c3516123e39.PNG)

Hitting the exposed endpoint /add-driver for drivers to subscribe themselves on the application so they can get booked:
![Postman_driver](https://user-images.githubusercontent.com/67758115/194436439-2462e1c6-133e-4f6e-9d63-4f39a937ca4e.PNG)

Screenshots from H2-DB (In-memory Database) used here:
![driver_details](https://user-images.githubusercontent.com/67758115/194436510-f0935d1c-4190-4c45-aa8d-f7cace3bca32.PNG)
![Driver](https://user-images.githubusercontent.com/67758115/194436512-37e7d40b-94b6-4761-9586-7ff4aee3d02a.PNG)
![car-details](https://user-images.githubusercontent.com/67758115/194436520-da90527c-091d-4d44-ad6a-f3dfb8ad6256.PNG)

Finally, we've exposed the /find-ride endpoint which will 
1) Return a list of all Drivers who are Available and are <=5 units of distance from us. (Making use of distance b/w 2 points formula for computing this)
2) In the choose_ride() method: Assign a Driver out of this list to the User & set Driver's isAvailable to False.

-------

Improvement Area's that I'll incorporate given some more time:
1. Addition of Loggers(Log4j)
2. Using the Lombok Library(@Data) annotations to reduce Getters/Setters/Constructors boilerplate.
