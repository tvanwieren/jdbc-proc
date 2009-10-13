package com.googlecode.jdbcproc.daofactory.impl.parameterconverter;

import java.util.Date;
import java.sql.*;

/**
 *  DATE - java.util.Date
 */
public class ParameterConverter_DATE_utilDate implements IParameterConverter<java.util.Date> {

    public void setValue(java.util.Date aValue, PreparedStatement aStmt, int aIndex) throws SQLException {
        if(aValue!=null) {
            java.sql.Date sqlDate = new java.sql.Date(aValue.getTime());
            aStmt.setDate(aIndex, sqlDate);
        } else {
            aStmt.setNull(aIndex, Types.DATE);
        }
    }

    public void setValue(java.util.Date aValue, CallableStatement aStmt, String aParameterName) throws SQLException {
        if(aValue!=null) {
            java.sql.Date sqlDate = new java.sql.Date(aValue.getTime());
            aStmt.setDate(aParameterName, sqlDate);
        } else {
            aStmt.setNull(aParameterName, Types.DATE);
        }
    }

    public java.util.Date getOutputParameter(CallableStatement aStmt, String aParameterName) throws SQLException {
        return aStmt.getDate(aParameterName);
    }

    public java.util.Date getFromResultSet(ResultSet aResultSet, String aParameterName) throws SQLException {
        return aResultSet.getDate(aParameterName);
    }

    public ParameterSetterKey getKey() {
        return new ParameterSetterKey(Types.DATE, java.util.Date.class);
    }

    public String toString() {
        return "ParameterConverter_DATE_utilDate{}";
    }
}