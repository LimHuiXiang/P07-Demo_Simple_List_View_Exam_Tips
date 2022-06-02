package sg.edu.rp.c346.id20006757.demosimplelistviewexamtips;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView lvExamTips;

    String[] ExamTipsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvExamTips = findViewById(R.id.listViewExamTips);
        ArrayAdapter adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, ExamTipsArray);
        lvExamTips.setAdapter(adapter);


        ExamTipsArray = new String[5];
        ExamTipsArray[0] ="Don't just read the code, code it as much as possible during each practical session";
        ExamTipsArray[1] ="Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        ExamTipsArray[2] ="Prepare your template source code for each topic";
        ExamTipsArray[3] = "Create a few empty Android projects to speed up your coding during the exam";
        ExamTipsArray[4] ="Ensure that your Android Studio is up and running before the exam";

    }


}