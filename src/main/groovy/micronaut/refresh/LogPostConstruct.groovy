package micronaut.refresh

import io.micronaut.context.event.ApplicationEventListener
import io.micronaut.discovery.event.ServiceStartedEvent
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import javax.inject.Singleton

@Singleton
class LogPostConstruct implements ApplicationEventListener<ServiceStartedEvent> {

    Logger logger = LoggerFactory.getLogger LogPostConstruct.class

    @Override
    void onApplicationEvent(ServiceStartedEvent event) {
        logger.info 'Test log are well setup'
    }
}
