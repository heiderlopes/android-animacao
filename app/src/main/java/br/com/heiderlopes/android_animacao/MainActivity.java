package br.com.heiderlopes.android_animacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivImagem;

    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivImagem = (ImageView)findViewById(R.id.ivImagem);
    }

    public void animar(View v){
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        ivImagem.setAnimation(animation);
        ivImagem.startAnimation(animation);
    }
}
