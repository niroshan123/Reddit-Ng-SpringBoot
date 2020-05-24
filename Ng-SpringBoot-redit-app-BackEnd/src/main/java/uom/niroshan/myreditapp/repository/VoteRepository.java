package uom.niroshan.myreditapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uom.niroshan.myreditapp.model.Post;
import uom.niroshan.myreditapp.model.User;
import uom.niroshan.myreditapp.model.Vote;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
