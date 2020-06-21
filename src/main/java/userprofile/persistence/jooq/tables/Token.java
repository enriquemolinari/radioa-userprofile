/*
 * This file is generated by jOOQ.
 */
package userprofile.persistence.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import userprofile.persistence.jooq.App;
import userprofile.persistence.jooq.Keys;
import userprofile.persistence.jooq.tables.records.TokenRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Token extends TableImpl<TokenRecord> {

    private static final long serialVersionUID = 1891397885;

    /**
     * The reference instance of <code>APP.TOKEN</code>
     */
    public static final Token TOKEN = new Token();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TokenRecord> getRecordType() {
        return TokenRecord.class;
    }

    /**
     * The column <code>APP.TOKEN.ID_USER</code>.
     */
    public final TableField<TokenRecord, Integer> ID_USER = createField(DSL.name("ID_USER"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>APP.TOKEN.CREATION_DATE</code>.
     */
    public final TableField<TokenRecord, LocalDateTime> CREATION_DATE = createField(DSL.name("CREATION_DATE"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>APP.TOKEN.TOKEN</code>.
     */
    public final TableField<TokenRecord, String> TOKEN_ = createField(DSL.name("TOKEN"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>APP.TOKEN</code> table reference
     */
    public Token() {
        this(DSL.name("TOKEN"), null);
    }

    /**
     * Create an aliased <code>APP.TOKEN</code> table reference
     */
    public Token(String alias) {
        this(DSL.name(alias), TOKEN);
    }

    /**
     * Create an aliased <code>APP.TOKEN</code> table reference
     */
    public Token(Name alias) {
        this(alias, TOKEN);
    }

    private Token(Name alias, Table<TokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private Token(Name alias, Table<TokenRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Token(Table<O> child, ForeignKey<O, TokenRecord> key) {
        super(child, key, TOKEN);
    }

    @Override
    public Schema getSchema() {
        return App.APP;
    }

    @Override
    public List<ForeignKey<TokenRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TokenRecord, ?>>asList(Keys.SQL0000000035_2E23CCFB_0172_B50B_E31B_FFFFC60AC551);
    }

    public ListenerUser listenerUser() {
        return new ListenerUser(this, Keys.SQL0000000035_2E23CCFB_0172_B50B_E31B_FFFFC60AC551);
    }

    @Override
    public Token as(String alias) {
        return new Token(DSL.name(alias), this);
    }

    @Override
    public Token as(Name alias) {
        return new Token(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Token rename(String name) {
        return new Token(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Token rename(Name name) {
        return new Token(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, LocalDateTime, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}