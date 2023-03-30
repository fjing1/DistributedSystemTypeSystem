# ece654a3, do not copy without consent
# Distributed System Type System

This project provides a simple pluggable type system for managing data main.java.consistency in distributed systems. 
It allows you to define different main.java.consistency levels and store data using a custom data store implementation.
## Lattice
                        Top
                         |
            Unspecified Consistency Data
            /                          \
Strongly Consistent Data        	Eventual Consistent Data
            \                           /
                    Bottom
## Features

- Define custom main.java.consistency levels for distributed data.
- Use the provided in-memory data store or implement your own custom data store.
- Able to switch between different data store implementations.

## Getting Started

These instructions will help you set up and run the project on your local machine for development and testing purposes.

### Prerequisites

- Java 8 or higher
- Maven, Gradle, or IntelliJ IDEA for building the project

### Building and Running the Project

1. Clone the repository:

```bash
git clone git@github.com:fjing1/ece654a3.git

2. Build the project using your preferred build tool:
I was using Gradle:

./gradlew clean build

3.Run the main.Main class in your preferred IDE (i was using IntellJ Idea) or from the command line.


Contributing
If you would like to contribute to this project, please follow these steps:

Fork the repository on GitHub.
Create a new branch for your changes.
Make your changes and commit them to your branch.
Push your changes to your forked repository.
Open a pull request on the original repository to merge your changes.

