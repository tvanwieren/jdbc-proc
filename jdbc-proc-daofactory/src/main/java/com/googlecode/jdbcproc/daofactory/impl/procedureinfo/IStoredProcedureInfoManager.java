package com.googlecode.jdbcproc.daofactory.impl.procedureinfo;

import com.google.inject.ImplementedBy;

/**
 * Created by IntelliJ IDEA.
 * User: esinev
 * Date: Feb 1, 2010
 * Time: 5:18:29 PM
 * To change this template use File | Settings | File Templates.
 */
@ImplementedBy(StoredProcedureInfoManagerInitOnStartup.class)
public interface IStoredProcedureInfoManager {
    StoredProcedureInfo getProcedureInfo(String aProcedureName);
}