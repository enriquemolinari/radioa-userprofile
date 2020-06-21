package userprofile.model;

import userprofile.model.api.RadioListener;

public class DefaultRadioListener implements RadioListener {

 private RadioListenerRepository repository;
 private UsersNames usersName;

 public DefaultRadioListener(RadioListenerRepository repository,
   UsersNames usersName) {
  this.repository = repository;
  this.usersName = usersName;
 }

 @Override
 public void newListener(String personId, String name, String surname,
   String phone, String email, String username, String pwd) {
  var listener = new DefaultListener(personId, name, surname, email, phone,
    username, usersName, pwd);

  repository.addListener(listener);
 }
}
