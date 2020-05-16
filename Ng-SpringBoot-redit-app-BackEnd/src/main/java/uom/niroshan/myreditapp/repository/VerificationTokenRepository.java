package uom.niroshan.myreditapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uom.niroshan.myreditapp.model.VerificationToken;

public interface VerificationTokenRepository  extends JpaRepository<VerificationToken, Long> {
}
