package soloProject.CoupleLog.dto;

import java.time.LocalDate;

public record RecordRequestDto(
        String placeName,
        Double latitude,
        Double longitude,
        LocalDate visitDate,
        String memo,
        String emoji,
        Long categoryId
) {}
