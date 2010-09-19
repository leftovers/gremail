// Place your Spring DSL code here
beans = {
    jmsConnectionFactory(org.apache.activemq.pool.PooledConnectionFactory){bean ->
        bean.destroyMethod ="stop"
        connectionFactory(org.apache.activemq.ActiveMQConnectionFactory) {
            brokerURL = "tcp://localhost:61616"
        }
    }
}
