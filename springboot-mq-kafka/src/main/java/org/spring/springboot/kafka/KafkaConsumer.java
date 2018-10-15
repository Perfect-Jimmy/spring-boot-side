package org.spring.springboot.kafka;

import kafka.consumer.ConsumerConfig;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.serializer.StringDecoder;
import kafka.utils.VerifiableProperties;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class KafkaConsumer {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("zookeeper.connect", "127.0.0.1:2181");
        //group 代表一个消费组
        props.put("group.id", "jd-group");
        props.put("zookeeper.session.timeout.ms", "4000");
        props.put("zookeeper.sync.time.ms", "200");
        props.put("auto.commit.interval.ms", "1000");
        props.put("auto.offset.reset", "smallest");
        props.put("serializer.class", "kafka.serializer.StringEncoder");

        ConsumerConfig config = new ConsumerConfig(props);

        ConsumerConnector consumer = kafka.consumer.Consumer.createJavaConsumerConnector(config);

        Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
        topicCountMap.put("TestTopic", 1);

        StringDecoder keyDecoder = new StringDecoder(new VerifiableProperties());
        StringDecoder valueDecoder = new StringDecoder(new VerifiableProperties());

//        Map<String, List<KafkaStream<Object, Object>>> consumerMap =
//                consumer.createMessageStreams(topicCountMap, keyDecoder, valueDecoder);
//        KafkaStream<Object, Object> stream = consumerMap.get("TestTopic").get(0);
//        ConsumerIterator<Object, Object> it = stream.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next().message());
//        }
        System.out.println("finished");
    }  
}  