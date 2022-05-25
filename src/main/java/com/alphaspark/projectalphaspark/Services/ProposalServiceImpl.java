package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Entities.Proposal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProposalServiceImpl implements ProposalService{
    @Override
    public boolean addProposal() {
        return false;
    }

    @Override
    public Proposal getProposal(Long proposalId) {
        return null;
    }

    @Override
    public List<Proposal> getAllProposals() {
        return null;
    }

    @Override
    public List<Proposal> getClientProposals(Long clientId) {
        return null;
    }

    @Override
    public boolean updateProposal(Proposal proposal) {
        return false;
    }

    @Override
    public boolean deleteProposal(Long proposalId) {
        return false;
    }
}
