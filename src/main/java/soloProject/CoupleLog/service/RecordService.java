package soloProject.CoupleLog.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import soloProject.CoupleLog.domain.Category;
import soloProject.CoupleLog.domain.Record;
import soloProject.CoupleLog.dto.RecordRequestDto;
import soloProject.CoupleLog.dto.RecordResponseDto;
import soloProject.CoupleLog.global.exception.BusinessException;
import soloProject.CoupleLog.global.exception.ErrorCode;
import soloProject.CoupleLog.repository.CategoryRepository;
import soloProject.CoupleLog.repository.RecordRepository;


@Service
@RequiredArgsConstructor
public class RecordService {

    private final CategoryRepository categoryRepository;
    private final RecordRepository recordRepository;


    @Transactional
    public RecordResponseDto saveRecord(RecordRequestDto recordRequestDto) {
        Category category = categoryRepository.findById(recordRequestDto.categoryId())
                .orElseThrow(() -> new BusinessException(ErrorCode.CATEGORY_NOT_FOUND));

        Record record = new Record(
                null,
                recordRequestDto.placeName(),
                recordRequestDto.latitude(),
                recordRequestDto.longitude(),
                recordRequestDto.visitDate(),
                recordRequestDto.memo(),
                recordRequestDto.emoji(),
                category
        );

        Record saved = recordRepository.save(record);

        return RecordResponseDto.from(saved);
    }
}
