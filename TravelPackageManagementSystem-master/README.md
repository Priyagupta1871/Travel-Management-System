**Travel Package Management System**

Welcome to the Travel Agency Management System repository! This software system is designed to help travel agencies efficiently organize their travel packages, itineraries, and passenger information. The system is implemented in Java, adhering to the specified guidelines. Below is an overview of the key features and how to get started.

**Overview**
**Classes**

**Activity**

Represents an activity available at a destination.
Attributes: name, description, cost, capacity.

**Destination**

Represents a destination with a list of available activities.
Attributes: name, activities (list).

**GoldPassenger**

Extends Passenger class for gold category passengers.
Implements methods for signing up for an activity with a 10% discount.

**Passenger**

Represents a passenger with basic information and signed-up activities.
Attributes: passengerName, passengerNumber, balanceAmount, signedUpActivities (map).

**PremiumPassenger**

Extends Passenger class for premium category passengers.
Implements methods for signing up for activities for free.

**TravelPackage**

Represents a travel package with a name, capacity, destinations, and passengers.
Attributes: name, capacity, destinations (list), passengers (list).

**TravelPackagesManagementSystemApplication**

Main class for running the application.
Includes a sample scenario in the main method.
Features

**Print Itinerary**

Prints the travel package itinerary with destination details and available activities.

**Print Passenger Details**

Prints the passenger list for a travel package, including individual details.

**Print Activity Spaces**

Prints details of activities with available spaces.


Sub-Tasks

**1. Higher Level Diagram**
A block diagram indicating the interaction between different sub-blocks.

**2. Lower Level Diagram**
A UML class diagram illustrating all the classes implemented, with suitable attributes and methods representing the specified requirements.


<img width="458" alt="image" src="https://github.com/Abhinav-main/TravelPackageManagementSystem/assets/56387875/b308f37b-d03e-4fee-b28b-375c1aaf00aa">


**3. Implementation**
The project is implemented in Java, following SOLID design principles and clean code guidelines. Each class provides necessary functionalities for managing travel packages, passengers, and activities.

**4. Unit Testing**
Unit test cases are implemented for each class using the JUnit framework, ensuring the correctness and reliability of the code.

Feel free to explore the code, diagrams, and unit tests to understand the implementation details.

**Contributors**

Abhinav Verma
