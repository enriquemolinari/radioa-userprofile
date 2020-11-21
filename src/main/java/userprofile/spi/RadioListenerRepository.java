package userprofile.spi;

import java.util.Optional;

public interface RadioListenerRepository {

 void addListener(ListenerUser l);

 Optional<ListenerUser> listener(int id);
}
