package android.alaride.quizproject;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class Questions {

    public static Answer answer;
    public count = new count;

    public Questions() {

        public answer = String("True");
    }
    public static Answer get(){
        if(answer == null){
            answer = new Answer();
            Toast toast = Toast.makeText(context, correct, 100);
            toast.show();
            count++;
        }
        return answer;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences mPrefs = getSharedPreferences();
        mCurViewMode = mPrefs.getInt("view_mode", DAY_VIEW_MODE);
    }


    public String getAnswer(){
        return answer[1];
    }
}
//my overrides aren't working so I'm some what screwed.
