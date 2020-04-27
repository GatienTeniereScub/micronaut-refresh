package micronaut.refresh

import io.micronaut.runtime.context.scope.Refreshable
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import javax.annotation.PostConstruct

@Refreshable
class RefreshableFail {
    Logger logger = LoggerFactory.getLogger RefreshableFail.class

    @PostConstruct
    void init() {
        logger.info 'refresh'
    }
}
