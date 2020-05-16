package uom.niroshan.myreditapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uom.niroshan.myreditapp.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
