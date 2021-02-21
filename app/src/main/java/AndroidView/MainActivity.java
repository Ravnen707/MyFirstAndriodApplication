package AndroidView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myfirstandriodapplication.R;

import Model.Person;

public class MainActivity extends AppCompatActivity {

    public Object Name, Age;
    Person person = new Person();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
        public void bttnOnClick(View view) {
            //Name
            TextView tvN = (TextView) findViewById(R.id.txtName);
            TextView tvNedit = (TextView) findViewById(R.id.editText);
            person.setName(tvNedit.getText().toString());
            tvNedit.setText(person.getName());
            tvN.setText(tvNedit.getText());

            //Age
            TextView tvA = (TextView) findViewById(R.id.txtAge);
            TextView tvAedit = (TextView) findViewById(R.id.editText2);
            person.setAge(tvAedit.getText().toString());
            tvAedit.setText(person.getAge());
            tvA.setText(tvAedit.getText());


    }

}



