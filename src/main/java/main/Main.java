package main;

import userprofile.model.DefaultRadioListener;
import userprofile.model.DefaultUserAuth;
import userprofile.persistence.JooqRadioListenerRepository;
import userprofile.persistence.JooqTokens;
import userprofile.persistence.JooqUsers;
import userprofile.persistence.JooqUsersNames;
import userprofile.persistence.Tx;

public class Main {

 public static void main(String[] args) {

  var tx = new Tx("jdbc:derby://localhost:1527/radiocompetition", "app",
    "app");
  
//  var a = new DefaultRadioListener(new JooqRadioListenerRepository(tx),
//    new JooqUsersNames(tx));
//
//  a.newListener("25929195", "Enrique", "Molinari", "6666-989898",
//    "emolin@ja.com", "emolinar2di", "pwd123");
  
  
  var u = new DefaultUserAuth(new JooqTokens(tx), new JooqUsers(tx));
//  String token = u.authenticate("emolinarsssi", "pwd123");
//  System.out.println(token);
  
  u.validate("f619328f-faeb-40b0-bf0f-c6064e448490");
  
 }
}