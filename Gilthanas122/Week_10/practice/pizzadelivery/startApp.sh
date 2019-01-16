docker run \
--name spring-in-summer \
--link database \
-p 8080:8080 \
-e MY_SQL_ROOT_PASSWORD=root \
-e PIZZA_DB_URL=jdbc:mysql://database:3306/pizzadelivery \
-e PIZZA_DB_USERNAME=user \
-e PIZZA_DB_PASSWORD=test123 \
spring-in-summer
