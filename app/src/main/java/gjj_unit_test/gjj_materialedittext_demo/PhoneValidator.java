package gjj_unit_test.gjj_materialedittext_demo;

import android.support.annotation.NonNull;

import com.rengwuxian.materialedittext.validation.METValidator;

import java.util.regex.Pattern;

/**
 * 作者：gjj on 2016/2/29 13:27
 * 邮箱：Gujj512@163.com
 */
public class PhoneValidator extends METValidator {
    Pattern pattern;
    public PhoneValidator(@NonNull String errorMessage, @NonNull String regex) {
        super(errorMessage);
        pattern = Pattern.compile(regex);
    }

    public PhoneValidator(@NonNull String errorMessage, @NonNull Pattern pattern) {
        super(errorMessage);
        this.pattern = pattern;
    }
    @Override
    public boolean isValid(@NonNull CharSequence text, boolean isEmpty) {
        return pattern.matcher(text).matches();
    }
}
