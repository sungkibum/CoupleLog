package soloProject.CoupleLog.global.response;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class Rs<T> {
    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
    private final T data;

    public Rs(HttpStatus httpStatus, String code, String message, T data) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // 성공 응답 생성자
    public static <T> Rs<T> success(String message, T data) {
        return new Rs<>(HttpStatus.OK, "0", message, data);
    }

    public static <T> Rs<T> success(T data) {
        return new Rs<>(HttpStatus.OK, "0", "요청이 성공했습니다.", data);
    }

    public static Rs<Void> success(String message) {
        return new Rs<>(HttpStatus.OK, "0", message, null);
    }

    public static Rs<Void> success() {
        return new Rs<>(HttpStatus.OK, "0", "요청이 성공했습니다.", null);
    }
}
