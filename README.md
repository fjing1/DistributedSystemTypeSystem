# ece654a3, do not copy without consent
# Distributed System Type System

This project provides a simple pluggable type system for managing data main.java.consistency in distributed systems. 
It allows you to define different main.java.consistency levels and store data using a custom data store implementation.
## Lattice
<pre>
                            Top
                            |
                Unspecified Consistency Data
                 /                         \
Strongly Consistent Data          Eventual Consistent Data
                        \         /
                           Bottom
</pre>


## Function

- Define custom main.java.consistency levels for distributed data.
- Use the provided in-memory data store or implement your own custom data store.
- Easily switch between different data store implementations.
## reference and related work

Type Checking in Open Distributed Systems: a Complete Model and its Z Specification 
https://link.springer.com/chapter/10.1007/978-0-387-35188-9_7
Type Systems for Distributed Programs:
Components and Sessions
https://www.dcs.gla.ac.uk/~ornela/publications/Dardha16.pdf


## Getting Started

These instructions will help you set up and run the project on your local machine for development and testing purposes.

### Prerequisites

- Java 8 or higher
- Maven, Gradle, or IntelliJ IDEA for building the project

### Building and Running the Project

1. Clone the repository:

```bash
git clone https://github.com/yourusername/your-repo-name.git

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



