package com.example.userlistapplication.Retrofit;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.example.userlistapplication.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyCallBack<T> implements Callback<T> {
    private Dialog commonProgressDialog;

    public MyCallBack(AppCompatActivity activity, String progressMessage, boolean isRequireDialog) {
        if (isRequireDialog) {
            commonProgressDialog = new Dialog(activity);
            commonProgressDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            commonProgressDialog.setContentView(R.layout.dialog_common_progress);
            commonProgressDialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
            commonProgressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            commonProgressDialog.setCancelable(false);

            TextView txtViewProgress = commonProgressDialog.findViewById(R.id.txtViewProgress);

            if (progressMessage.equals(""))
                txtViewProgress.setText(activity.getResources().getString(R.string.progress_please_wait));
            else
                txtViewProgress.setText(progressMessage);

            commonProgressDialog.show();
        }
    }

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (commonProgressDialog != null && commonProgressDialog.isShowing()) {
            commonProgressDialog.dismiss();
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        if (commonProgressDialog != null && commonProgressDialog.isShowing()) {
            commonProgressDialog.dismiss();
        }
    }
}
