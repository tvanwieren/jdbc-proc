package com.googlecode.jdbcproc.daofactory.it.testdao.dao;

import com.googlecode.jdbcproc.daofactory.annotation.AMetaLoginInfo;
import com.googlecode.jdbcproc.daofactory.annotation.AStoredProcedure;
import com.googlecode.jdbcproc.daofactory.it.testdao.domain.lists.EntityWithList;
import com.googlecode.jdbcproc.daofactory.it.testdao.domain.lists.ListElement;
import com.googlecode.jdbcproc.daofactory.it.testdao.domain.lists.ListElement2;

import java.util.List;

/**
 * @author rpuch
 */
public interface IListsDao {
    @AStoredProcedure(name = "create_entity_with_list")
    @AMetaLoginInfo
    void createEntityWithList(EntityWithList entity, List<ListElement> list);

    @AStoredProcedure(name = "create_entity_with_two_lists")
    void createEntityWithTwoLists(EntityWithList entity, List<ListElement> list,
            List<ListElement2> list2);

    @AStoredProcedure(name = "create_entity_with_two_lists_and_metalogin_info")
    @AMetaLoginInfo
    void createEntityWithTwoListsAndMetaLoginInfo(EntityWithList entity, List<ListElement> list,
            List<ListElement2> list2);

    @AStoredProcedure(name = "update_entity_with_list")
    @AMetaLoginInfo
    void updateEntityWithList(EntityWithList entity, List<ListElement> list);
}
