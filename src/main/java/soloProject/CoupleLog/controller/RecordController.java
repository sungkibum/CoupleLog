package soloProject.CoupleLog.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import soloProject.CoupleLog.dto.RecordRequestDto;
import soloProject.CoupleLog.dto.RecordResponseDto;
import soloProject.CoupleLog.global.response.Rs;
import soloProject.CoupleLog.service.RecordService;

@RestController
@RequiredArgsConstructor
public class RecordController {

    private final RecordService recordService;

    @PostMapping
    public ResponseEntity<Rs<RecordResponseDto>> createRecord(@RequestBody RecordRequestDto recordRequestDto) {
        RecordResponseDto recordResponseDto = recordService.saveRecord(recordRequestDto);
        return ResponseEntity.ok(Rs.success(recordResponseDto));
    }
}
