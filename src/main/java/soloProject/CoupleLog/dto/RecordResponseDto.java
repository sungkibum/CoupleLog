package soloProject.CoupleLog.dto;

import java.time.LocalDate;

public record RecordResponseDto(
        Long id,
        String placeName,
        Double latitude,
        Double longitude,
        LocalDate visitDate,
        String memo,
        String emoji,
        String categoryName
) {
}
