package userprofile.persistence;

import static userprofile.persistence.jooq.tables.Listener.LISTENER;
import static userprofile.persistence.jooq.tables.ListenerUser.LISTENER_USER;

import java.time.LocalDateTime;

import org.jooq.Record1;

import userprofile.model.Listener;
import userprofile.model.RadioListenerRepository;

public class JooqRadioListenerRepository
  implements RadioListenerRepository {
 private Tx tx;

 public JooqRadioListenerRepository(Tx tx) {
  this.tx = tx;
 }

 @Override
 public void addListener(Listener l) {
  tx.execute(create -> {
   Record1<Integer> fetchOne = create
     .insertInto(LISTENER, LISTENER.NAME, LISTENER.SURNAME, LISTENER.PHONE,
       LISTENER.EMAIL, LISTENER.PERSON_ID)
     .values(l.name(), l.lastName(), l.phone(), l.email(), l.personId())
     .returningResult(LISTENER.ID_LISTENER).fetchOne();

   create
     .insertInto(LISTENER_USER, LISTENER_USER.ID_LISTENER,
       LISTENER_USER.USERNAME, LISTENER_USER.PASSWORD, LISTENER_USER.CREATION_DATE)
     .values(fetchOne.get(LISTENER.ID_LISTENER),  l.user(), l.pwd(), LocalDateTime.now()).execute();

   return null;
  });
 }
}
