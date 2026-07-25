# Exercise 1: Implementing the Singleton Pattern

## Scenario

A logging utility should have only one instance throughout the application lifecycle to ensure consistent logging.

## Design Pattern Used

Singleton Pattern

## Classes

### Logger

* Private constructor
* Private static instance variable
* Public static getInstance() method
* log() method for logging messages

### SingletonTest

Tests the Singleton implementation by verifying that only one Logger object is created.

## Output

Logger Instance Created
LOG: First Message
LOG: Second Message
Only one Logger instance exists.
