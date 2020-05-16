package uom.niroshan.myreditapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uom.niroshan.myreditapp.model.Subreddit;

public interface SubredditRepository  extends JpaRepository<Subreddit,  Long> {
}
