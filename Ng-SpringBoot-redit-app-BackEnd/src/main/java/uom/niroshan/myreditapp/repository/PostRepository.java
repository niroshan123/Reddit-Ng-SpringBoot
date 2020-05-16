package uom.niroshan.myreditapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uom.niroshan.myreditapp.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
