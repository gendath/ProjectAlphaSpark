package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Entities.Proposal;

import java.util.List;

public interface ProposalService {

    // Create functions
    boolean addProposal();

    // Read functions
    Proposal getProposal(Long proposalId);

    List<Proposal> getAllProposals();

    List<Proposal> getClientProposals(Long clientId);

    // Update functions
    boolean updateProposal(Proposal proposal);

    // Delete functions
    boolean deleteProposal(Long proposalId);


}
