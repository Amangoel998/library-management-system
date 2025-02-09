# Library Management system


Day 1:
- I've added a boiler plate setup for react app and java spring boot application.
- Dependencies for FE app includes
  - React library
  - typescript
  - webpack for building.
- For Java project I've added dependencies
  - Spring Web Web
  - Spring Data JPA SQL
  - H2 Database SQL
  - Spring Security Security


To run the spring app run following command in lms-server folder
> ./mvnw spring-boot:run
To run the react app run following command in lms-app folder
> npm start

Day 2:
- Added Backend data objects, controller and services to
  - list books
  - login users
- Added React app to show
  - home page
  - login page
  - Book cards

Day 3
- Added copies field sto the book.
- Added Borrow record to the table.
- Updated FE and BE to use borrow feature of a book by user.
- Authenticated users can borrow the book unless there are atleast 1 copy of it.