# CarFactory
AbstractFactory pattern

Car factory manufactures 4 types of cars(sedan, pickup, sports car, suv) and some parts are shared.

Parts: handle, windshield, wheel, tire, frame, lights, engine

Sedan and suv share handle, windshield and lights
Pickup and suv share frame, wheel, tire, engine
Sports car and sedan share handle only

Design data model class hierarchy and provides a method for producing car. 

Car createSedan();
Car createPickup();
Car createSportsCar();
Car createSUV();

Add color
