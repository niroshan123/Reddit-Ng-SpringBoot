package uom.niroshan.myreditapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uom.niroshan.myreditapp.model.Vote;

public interface VoteRepository extends JpaRepository<Vote , Long> {
}
