package com.jdbidemo.jdbidemo.mappers;

import com.jdbidemo.jdbidemo.model.MemberElection;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class MemberElectionMapper implements RowMapper<MemberElection> {

    @Override
    public MemberElection map(ResultSet resultSet, StatementContext ctx) throws SQLException {
        final MemberElection memberElection = new MemberElection();
        memberElection.setMemberElectionId(resultSet.getLong("melNum"));
        memberElection.setPayMemberCompanyId(resultSet.getLong("melPmcNum"));
        memberElection.setMemberElectionId(resultSet.getLong("melEdNum"));
        memberElection.setSubgroupId(resultSet.getLong("melPuNum"));
        memberElection.setEffectiveStartDate(resultSet.getDate("melEffStartDt"));
        memberElection.setEffectiveEndDate(resultSet.getDate("melEffEndDt"));
        memberElection.setCreatedAt(resultSet.getTimestamp("melCreatedTs"));
        memberElection.setModifiedAt(resultSet.getTimestamp("melModifiedTs"));
        memberElection.setEntryAuditHistoryId(resultSet.getLong("melEahNum"));
        return memberElection;
    }
}
