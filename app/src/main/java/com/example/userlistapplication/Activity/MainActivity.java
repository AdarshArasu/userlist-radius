package com.example.userlistapplication.Activity;

import android.content.Context;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Toast;
import com.example.userlistapplication.Model.AnimationItem;
import com.example.userlistapplication.R;
import com.example.userlistapplication.Adapter.RecyclerAdapter;
import com.example.userlistapplication.Model.Model;
import com.example.userlistapplication.Retrofit.MyCallBack;
import com.example.userlistapplication.Retrofit.ServiceGenerator;
import com.example.userlistapplication.Retrofit.WebService;
import retrofit2.Call;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerAdapter recyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
        callWebService();

    }

    private void initRecyclerView() {

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(layoutManager);

    }

    private void callWebService() {
        WebService webService = ServiceGenerator.createService(WebService.class);

        Call<Model> modelCall = webService.gerDatafromServer();

        modelCall.enqueue(new MyCallBack<Model>(this,
                getResources().getString(R.string.progress_please_wait), true) {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
                super.onResponse(call, response);

                try {
                    Model model = response.body();
                    if (model != null) {

                        setRecyclerAdapter(model);
                    }
                } catch (Exception e) {

                }
            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {
                super.onFailure(call, t);
            }
        });
    }

    private void setRecyclerAdapter(Model model) {
        recyclerAdapter = new RecyclerAdapter(MainActivity.this, model);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(recyclerAdapter);
        runLayoutAnimation(mRecyclerView, new AnimationItem("Slide in left", R.anim.layout_animation_from_bottom));

    }

    private void runLayoutAnimation(final RecyclerView recyclerView, final AnimationItem item) {
        final Context context = recyclerView.getContext();

        final LayoutAnimationController controller =
                AnimationUtils.loadLayoutAnimation(context, item.getResourceId());
        recyclerView.setLayoutAnimation(controller);
        recyclerView.scheduleLayoutAnimation();
    }

    private boolean exit = false;
    @Override
    public void onBackPressed() {
        if (exit)
            this.finish();
        else {
            Toast.makeText(this, "Press Back again to Exit",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }

}
