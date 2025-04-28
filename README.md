Kafka demo
---

* [Install](https://kafka.apache.org/quickstart) kafka on your local machine / vm
* Set the external hostname in `config/server.properties`, replace all occurances of `localhost` with your `fqdn`
* Start kafka server `$KAFKA_HOME/bin/kafka-server-start.sh $KAFKA_HOME/config/server.properties`
* Create the 2 topics that are used in this demo application
  - `$KAFKA_HOME/bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic order_events`
  - `$KAFKA_HOME/bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic payment_events`
* Update the application.properties to point to your kafka server
* Use any rest client to send post requests to the `localhost:8080/orders` or `localhost:8080/payments`

***
NOTE: This example uses StringStreams, and this is an enhancement to be done in this project
***
