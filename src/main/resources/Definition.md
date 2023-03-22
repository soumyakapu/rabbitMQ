### RabbitMQ
- RabbitMQ is a message broker that originally implements the Advance Message Queuing Protocol(AMQP)
- AMQP standardizes messaging using Producers,Brokers and Consumers
- AMQP standards designed with the following main characteristics Security,Reliability,Interoperability
## Key Features
- Security -> Supports authentication,authorization,Ldap and TLS via RabbitMQ plugins
- Reliability -> confirms the messages successfully delivered to Broker and confirm,s that the message was successfully consumed by the consumer
- Interoperability -> message is transfer as stream of bytes so any clients can operate on it irrespective of any languages 
## RabbitMQ Architecture
- When ever Produce message it goes to exchange and exchange goes to the corresponding queue and from queue it goes to the consumer who are subscribed to that queue
- the relationship between exchange and queue is by RoutingKey
