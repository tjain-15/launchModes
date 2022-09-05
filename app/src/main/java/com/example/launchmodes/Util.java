package com.example.launchmodes;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

public class Util {

    @RequiresApi(api = Build.VERSION_CODES.Q)
    public static void getInfo(Context ctx) {
        ActivityManager activityManager = (ActivityManager) ctx.getSystemService(ctx.ACTIVITY_SERVICE);
        int totalNumOfTask = 50;
        for (int i = 0; i < activityManager.getRunningTasks(totalNumOfTask).size(); i++) {
            ActivityManager.RunningTaskInfo taskInfo = activityManager.getRunningTasks(totalNumOfTask).get(i);
            if (taskInfo.isRunning) {
                Log.i("launch_modes","Total number of tasks running "+activityManager.getRunningTasks(totalNumOfTask).size());
                Log.i("launch_modes","Running task id "+String.valueOf(taskInfo.taskId));
                Log.i("launch_modes","Number of Activities "+ String.valueOf(taskInfo.numActivities));
                Log.i("launch_modes","Top Activity "+String.valueOf(taskInfo.topActivity.getClassName()));
                Log.i("launch_modes","Base Activity "+String.valueOf(taskInfo.baseActivity.getClassName()));
                Log.i("launch_modes","***********************************************************************");
                Log.i("launch_modes","***********************************************************************");

            }
        }
    }

}
