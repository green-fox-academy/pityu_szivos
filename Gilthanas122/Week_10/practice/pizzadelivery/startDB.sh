docker run \
--name database \
-e MYSQL_ROOT_PASSWORD=november \
-e MYSQL_DATABASE=pizzadelivery \
-e MYSQL_USER=user \
-e MYSQL_PASSWORD=test123 \
-d \
mysql