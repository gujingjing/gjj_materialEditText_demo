package gjj_unit_test.gjj_materialedittext_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.rengwuxian.materialedittext.MaterialEditText;
import com.rengwuxian.materialedittext.validation.RegexpValidator;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.et_phone)
    MaterialEditText etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        etPhone.addValidator(new RegexpValidator("电话号码不正确","^0?1[3458]\\d{9}$"));
    }
    @OnClick({R.id.btn_phone})void onclick(View view){
        switch (view.getId()){
            case R.id.btn_phone:
                etPhone.validate();
                break;
        }
    }
}
