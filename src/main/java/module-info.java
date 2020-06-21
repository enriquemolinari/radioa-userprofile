module radioa.userprofile {

 exports userprofile.model.api;

 exports userprofile.persistence.jooq.tables.records to org.jooq;

 requires java.sql;
 requires org.jooq;
 requires org.jooq.codegen;
 requires org.jooq.meta;
 requires org.apache.derby.client;
 requires org.apache.derby.tools;
}