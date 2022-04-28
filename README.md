# Spring Rabbit Stream Bing - Demo

## Description
* How to use multiple vhosts in a Spring RabbitMQ project;
* SpringBoot Connect Multiple RabbitMQ Sources.

## Requisites
* Run docker-compose;
* Create virtualhosts on RabbitMQ: virtualhost1, virtualhost2;
* Create queues: payment.queue (virtualhost1) and arrecadation.queue (virtualhost2);
* Bind created queues to exchange amq.topic;