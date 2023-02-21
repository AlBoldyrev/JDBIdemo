package com.jdbidemo.jdbidemo.model;

import lombok.Getter;
import lombok.Setter;
import org.jdbi.v3.core.mapper.reflect.ColumnName;

import java.sql.Date;
import java.sql.Timestamp;

@Setter
public class MemberElection {

    @Getter(onMethod = @__(@ColumnName("mel_num")))
    private Long memberElectionId;

    @Getter(onMethod = @__(@ColumnName("mel_pmc_num")))
    private Long payMemberCompanyId;

    @Getter(onMethod = @__(@ColumnName("mel_ed_num")))
    private Long electionDimId;

    @Getter(onMethod = @__(@ColumnName("mel_eah_num")))
    private Long entryAuditHistoryId;

    @Getter(onMethod = @__(@ColumnName("mel_pu_num")))
    private Long subgroupId;

    @Getter(onMethod = @__(@ColumnName("mel_eff_start_dt")))
    private Date effectiveStartDate;

    @Getter(onMethod = @__(@ColumnName("mel_eff_end_dt")))
    private Date effectiveEndDate;

    @Getter(onMethod = @__(@ColumnName("mel_create_ts")))
    private Timestamp createdAt;

    @Getter(onMethod = @__(@ColumnName("mel_modified_ts")))
    private Timestamp modifiedAt;
}
