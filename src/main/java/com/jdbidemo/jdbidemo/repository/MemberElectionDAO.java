package com.jdbidemo.jdbidemo.repository;

import com.jdbidemo.jdbidemo.model.MemberElection;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.springframework.stereotype.Repository;

@RegisterBeanMapper(MemberElection.class)
public interface MemberElectionDAO {

    @SqlQuery("Select * from MemberElection where mel_num=:id")
    public MemberElection findById(@Bind long id);

}
