
docker run \
-t \
--name pizzadelivery \
--link docker-mysql2:mysql \
-p 8080:8080 \
pizzadelivery
