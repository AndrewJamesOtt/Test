package who.cares.at.all.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int fucksGiven = 0;
        boolean doICare = false;

        System.out.println("Exactly how may fucks do I give? " + fucksGiven);
        System.out.println("And do I care? " + doICare);

    }
}
