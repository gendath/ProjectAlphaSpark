package com.alphaspark.projectalphaspark.Daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProposalDao extends JpaRepository<ProposalDao, Long> {


}
