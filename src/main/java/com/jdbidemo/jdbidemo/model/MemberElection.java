package com.jdbidemo.jdbidemo.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
public class MemberElection {

    private Long memberElectionId;
    private Long payMemberCompanyId;
    private Long electionDimId;
    private Long entryAuditHistoryId;
    private Long subgroupId;
    private Date effectiveStartDate;
    private Date effectiveEndDate;
    private Timestamp createdAt;
    private Timestamp modifiedAt;

}
