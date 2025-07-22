package soloProject.CoupleLog.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String placeName;

    @Column(nullable = false)
    private Double latitude;    //위도

    @Column(nullable = false)
    private Double longitude;  //경도

    @Column(nullable = true)
    private LocalDate visitDate;

    @Column(nullable = true)
    private String memo;

    @Column(nullable = false)
    private String emoji;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
