package com.jdbidemo.jdbidemo.service;

import com.jdbidemo.jdbidemo.model.MemberElection;
import com.jdbidemo.jdbidemo.repository.MemberElectionRepository;
import org.jdbi.v3.core.Jdbi;
import org.springframework.stereotype.Service;

@Service
public class MemberElectionService {
    private final MemberElectionRepository memberElectionRepository;

    public MemberElectionService(Jdbi jdbi) {
        this.memberElectionRepository = jdbi.onDemand(MemberElectionRepository.class);
    }

    public MemberElection findById(long id) {
        MemberElection memberElection = memberElectionRepository.findById(id);
        return memberElection;
    }

    public Long save(MemberElection memberElection) {
        return memberElectionRepository.save(memberElection);
    }

}
