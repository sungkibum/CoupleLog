package soloProject.CoupleLog.dto;

import soloProject.CoupleLog.domain.Record;

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
    public static RecordResponseDto from(Record record) {
        return new RecordResponseDto(
                record.getId(),
                record.getPlaceName(),
                record.getLatitude(),
                record.getLongitude(),
                record.getVisitDate(),
                record.getMemo(),
                record.getEmoji(),
                record.getCategory().getName()
        );
    }
}
