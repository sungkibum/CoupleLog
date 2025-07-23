package soloProject.CoupleLog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soloProject.CoupleLog.domain.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
}
