package sg.edu.rp.c346.id20032316.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.tvCode);
        tvName = findViewById(R.id.tvName);
        tvYear = findViewById(R.id.tvYear);
        tvSem = findViewById(R.id.tvSemester);
        tvCredit = findViewById(R.id.tvCredit);
        tvVenue = findViewById(R.id.tvVenue);
        btnBack = findViewById(R.id.btnBack);


        Intent intent = getIntent();
        String code = intent.getStringExtra("code");
        String name = intent.getStringExtra("name");
        int year = intent.getIntExtra("year", 0000);
        int sem = intent.getIntExtra("sem", 0);
        int credit = intent.getIntExtra("credit", 0);
        String venue = intent.getStringExtra("venue");

        tvCode.setText("Module Code: " + code);
        tvName.setText("Module Name: " + name);
        tvYear.setText("Academic Year: " + year);
        tvSem.setText("Semester: " + sem);
        tvCredit.setText("Module Credit: " + credit);
        tvVenue.setText("Venue: " + venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}