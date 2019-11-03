package lt.liudasstonys.angulartourofheroesapi.eventlistener;

import lt.liudasstonys.angulartourofheroesapi.App;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
class ApplicationEventListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        App.logger.error(applicationEvent.getClass().toString());
    }
}
