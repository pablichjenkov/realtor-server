# Realtor-WEB API Development using Ktor Server

## Introduction
This repository contains the source code for the Realtor-WEB API development using the Ktor server framework. It provides endpoints for managing categories, houses, and contacts in a real estate application.

## Features
- Create, read, update, and delete (CRUD) operations for categories, houses, and contacts.
- Flexible API endpoints for managing real estate data.
- Easy-to-use interface for interacting with the API.

## Technologies Used
- [Ktor](https://ktor.io/): A Kotlin framework for building asynchronous servers and clients.
- [SQLite](https://www.sqlite.org/index.html): A lightweight database engine.
- [JSON](https://www.json.org/json-en.html): A lightweight data-interchange format.

## Installation
1. Clone the repository: `git clone https://github.com/yourusername/Realtor-WEB.git`
2. Navigate to the project directory: `cd Realtor-WEB`
3. Run the application: `./gradlew run`

## Endpoints

### Category Endpoints
- **POST /v1/category**: Create a new category.
- **GET /v1/category**: Retrieve all categories.
- **GET /v1/category/{id}**: Retrieve a specific category by ID.
- **PUT /v1/category/{id}**: Update a specific category by ID.
- **DELETE /v1/category/{id}**: Delete a specific category by ID.

### House Endpoints
- **POST /v1/house**: Create a new house listing.
- **GET /v1/house**: Retrieve all house listings.
- **GET /v1/house/{id}**: Retrieve a specific house listing by ID.
- **PUT /v1/house/{id}**: Update a specific house listing by ID.
- **DELETE /v1/house/{id}**: Delete a specific house listing by ID.

### Contact Endpoints
- **POST /v1/contact**: Create a new contact entry.
- **GET /v1/contact**: Retrieve all contact entries.
- **GET /v1/contact/{id}**: Retrieve a specific contact entry by ID.
- **PUT /v1/contact/{id}**: Update a specific contact entry by ID.
- **DELETE /v1/contact/{id}**: Delete a specific contact entry by ID.

##Deploy an application﻿
Note: I already setuped all the stuff for the heroku. To deploy the application to Heroku using Git, open the terminal and follow the steps below:
Commit changes made in the previous section locally:

Commit changes made in the previous section locally:

```
git add .
git commit -m "Prepare app for deploying"
```
### Login to Heroku CLI:

```heroku login```
### Create a Heroku application using the heroku create command. You need to replace ktor-sample-heroku with a name of your application:

```heroku create ktor-sample-heroku```
### This command does two things:

Creates a new Heroku application, which is available on the web dashboard.

Adds a new Git remote called heroku to a local repository.

To deploy the application, push changes to heroku main...

```git push heroku main```
... and wait until Heroku builds and publishes the application:

...
```
remote: https://ktor-sample-heroku.herokuapp.com/ deployed to Heroku
remote:
remote: Verifying deploy... done.
```



## License
This project is licensed under the [MIT License](LICENSE).
