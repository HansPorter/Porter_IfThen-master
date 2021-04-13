package mcm.edu.ph.porter_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnDecision1);
        Button btnDecision2 = findViewById(R.id.btnDecision2);

        TextView txtLore = findViewById(R.id.txtLore);
        txtLore.setText("Chocolate is better than caramel");

        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){

        TextView txtDecision = findViewById(R.id.txtDecision);

        switch(view.getId()){
            case R.id.btnDecision1:
                txtDecision.setText("I belive chocolate is better than caramel");
                break;

            case R.id.btnDecision2:
                txtDecision.setText("I belive caramel is better than chocolate");
                break;


        }
    }
}