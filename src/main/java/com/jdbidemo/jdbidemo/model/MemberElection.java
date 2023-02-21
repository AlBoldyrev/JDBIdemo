package com.jdbidemo.jdbidemo.model;

import lombok.Getter;
import lombok.Setter;
import org.jdbi.v3.core.mapper.reflect.ColumnName;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
public class MemberElection {

    @ColumnName("mel_num")
    private Long memberElectionId;

    @ColumnName("mel_pmc_num")
    private Long payMemberCompanyId;

    @ColumnName("mel_ed_num")
    private Long electionDimId;

    @ColumnName("mel_eah_num")
    private Long entryAuditHistoryId;

    @ColumnName("mel_pu_num")
    private Long subgroupId;

    @ColumnName("mel_eff_start_dt")
    private Date effectiveStartDate;

    @ColumnName("mel_eff_end_dt")
    private Date effectiveEndDate;

    @ColumnName("mel_create_ts")
    private Timestamp createdAt;

    @ColumnName("mel_modified_ts")
    private Timestamp modifiedAt;

}
