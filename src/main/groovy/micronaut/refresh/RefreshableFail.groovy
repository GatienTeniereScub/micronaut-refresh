package micronaut.refresh

import io.micronaut.runtime.context.scope.Refreshable
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import javax.annotation.PostConstruct
import java.text.SimpleDateFormat

@Refreshable
class RefreshableFail {
    String forecast

    Logger logger = LoggerFactory.getLogger RefreshableFail.class

    @PostConstruct
    void init() {
        forecast = "Scattered Clouds ${new SimpleDateFormat("dd/MMM/yy HH:mm:ss.SSS").format(new Date())}"

        logger.info "refresh: $forecast"
    }

    String latestForecast() {
        logger.info "refresh: $forecast"
        return forecast
    }
}
