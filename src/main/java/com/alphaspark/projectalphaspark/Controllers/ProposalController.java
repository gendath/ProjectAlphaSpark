package com.alphaspark.projectalphaspark.Controllers;

import com.alphaspark.projectalphaspark.Entities.BaseUser;
import com.alphaspark.projectalphaspark.Entities.Proposal;
import com.alphaspark.projectalphaspark.Services.ProposalService;
import com.alphaspark.projectalphaspark.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proposal")
public class ProposalController {

    private final ProposalService proposalService;
    public ProposalController(ProposalService proposalService) {
        this.proposalService = proposalService;
    }

    //create
    @PostMapping("/new")
    public String createProposal(@RequestBody Proposal proposal) {
        return null;
    }

    //read all
    @GetMapping({"/", ""})
    public List<Proposal> listAllProposal() {
        return proposalService.getAllProposals();
    }

    //read one
    @GetMapping("/{propID}")
    public Proposal displaySingleProposal(@PathVariable Long propID) {
        return proposalService.getProposal(propID);
    }

    //update
    @PutMapping("/update")
    public boolean updateProposal(@RequestBody Proposal proposal) {
        return proposalService.updateProposal(proposal);
    }

    //delete
    @DeleteMapping("/delete")
    public boolean deleteUser(@RequestBody Proposal proposal) {
        return proposalService.deleteProposal(proposal.getId());
    }
}
