package com.jdbidemo.jdbidemo.repository;

import com.jdbidemo.jdbidemo.model.MemberElection;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.customizer.Define;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.springframework.stereotype.Repository;

@Repository
@RegisterBeanMapper(MemberElection.class)
public interface MemberElectionRepository {

    @SqlQuery("Select * from member_election where mel_num=:id")
    MemberElection findById(@Bind long id);

    @SqlUpdate("INSERT INTO member_election (mel_pmc_num, mel_ed_num, mel_pu_num) VALUES (:payMemberCompanyId, :electionDimId, :subgroupId)")
    @GetGeneratedKeys("mel_num")
    Long save(@BindBean MemberElection memberElection);

}
