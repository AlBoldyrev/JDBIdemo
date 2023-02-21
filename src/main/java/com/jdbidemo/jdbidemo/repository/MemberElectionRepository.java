package com.jdbidemo.jdbidemo.repository;

import com.jdbidemo.jdbidemo.model.MemberElection;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.Define;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.springframework.stereotype.Repository;

@Repository
@RegisterBeanMapper(MemberElection.class)
public interface MemberElectionRepository {

    @SqlQuery("Select * from Member_Election where mel_num=:id")
    MemberElection findById(@Bind long id);

}
