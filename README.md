## Device Modeling with Inheritance

## Overview

This Java assignment focuses on modeling different types of devices using inheritance. The project includes a base class named Device and three derived classes representing specific types of devices: Smartphone, Laptop, and Tablet. Users can create random instances of these devices, calculate the total price and weight, and view some device-specific information.

## Project Structure

The project consists of the following classes:

Device (Base Class):
Attributes:
type (String): Represents the type of the device (e.g., "Smartphone," "Laptop," "Tablet," etc.).
price (double): Represents the price of the device in USD.
weight (double): Represents the weight of the device in grams.
Methods:
Parameterized constructor to initialize attributes.
Getters and setters for all attributes.
Smartphone (Derived Class):
Additional Attributes:
screenSize (double): Represents the screen size in inches.
cameraResolution (int): Represents the camera resolution in megapixels.
Laptop (Derived Class):
Additional Attributes:
processorSpeed (double): Represents the processor speed in GHz.
ramSize (int): Represents the RAM size in GB.
Tablet (Derived Class):
Additional Attributes:
screenSize (double): Represents the screen size in inches.
batteryCapacity (int): Represents the battery capacity in mAh.
MainProgram:
Entry point for the application.
Asks the user to input the number of devices to create.
Generates random instances of the derived classes.
Calculates and displays the number of distinct device types, the total price of all devices, and the total weight of all devices.
## Usage

Run the MainProgram to start the application.
Enter the number of devices you want to create (between 1 and 20).
The application will generate random instances of devices and calculate the required information.
You will see the number of distinct device types, the total price, and the total weight of all devices.
