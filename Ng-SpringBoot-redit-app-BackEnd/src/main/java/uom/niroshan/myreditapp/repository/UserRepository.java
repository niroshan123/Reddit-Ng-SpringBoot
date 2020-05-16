package uom.niroshan.myreditapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uom.niroshan.myreditapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
