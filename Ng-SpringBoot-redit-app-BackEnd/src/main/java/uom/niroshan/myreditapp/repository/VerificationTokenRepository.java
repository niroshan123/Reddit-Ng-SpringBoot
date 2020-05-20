package uom.niroshan.myreditapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uom.niroshan.myreditapp.model.VerificationToken;

import java.util.Optional;

public interface VerificationTokenRepository  extends JpaRepository<VerificationToken, Long> {
    Optional<VerificationToken> findByToken(String token);
}
