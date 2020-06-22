module radioa.userprofile {

 exports userprofile.model.api;

 provides userprofile.model.api.RadioListeners with userprofile.persistence.RadioListenersProvider;
 provides userprofile.model.api.UserAuth with userprofile.persistence.UserAuthProvider;

 exports userprofile.persistence.jooq.tables.records to org.jooq;

 requires java.sql;
 requires org.jooq;
 requires org.jooq.codegen;
 requires org.jooq.meta;
 requires org.apache.derby.client;
 requires org.apache.derby.tools;
}