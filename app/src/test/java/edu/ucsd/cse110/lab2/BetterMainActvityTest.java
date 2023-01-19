package edu.ucsd.cse110.lab2;

import static org.junit.Assert.assertEquals;

import android.widget.Button;
import android.widget.TextView;

import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class BetterMainActvityTest {
    @Test
    public void testSomething() {
        var scenario = ActivityScenario.launch(MainActivity.class);
        scenario.moveToState(Lifecycle.State.CREATED);
        scenario.moveToState(Lifecycle.State.STARTED);
        scenario.onActivity(activity -> {

                    activity.findViewById(R.id.btn_one).performClick(); //1
                    activity.findViewById(R.id.btn_plus).performClick(); // +
                    activity.findViewById(R.id.btn_one).performClick(); // 1
                    activity.findViewById(R.id.btn_equals).performClick();
                    TextView answer = activity.findViewById(R.id.display);
                    assertEquals(answer.getText().toString(), "2");
                }
        );

    }

}




