package com.gyh.internalcommon.jms;

import com.gyh.internalcommon.constant.QueueNames;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 消息队列
 *
 * @date 2018/8/24
 */
@Configuration
public class SupervisionDestination {

    /**
     * 上报队列
     *
     * @return 队列
     */
    @Bean
    public ActiveMQQueue generalQueue() {
        return new ActiveMQQueue(QueueNames.GENERAL_QUEUE);
    }

    /**
     * 行驶轨迹队列
     *
     * @return 队列
     */
    @Bean
    public ActiveMQQueue positionQueue() {
        return new ActiveMQQueue(QueueNames.POSITION_QUEUE);
    }

    /**
     * 缓冲队列
     *
     * @return 队列
     */
    @Bean
    public ActiveMQQueue bufferQueue() {
        return new ActiveMQQueue(QueueNames.BUFFER_QUEUE);
    }

}
