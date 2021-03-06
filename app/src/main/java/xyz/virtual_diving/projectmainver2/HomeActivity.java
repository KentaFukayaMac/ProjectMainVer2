package xyz.virtual_diving.projectmainver2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import xyz.virtual_diving.projectmainver2.ZukanList.ZukanListActivity;
import xyz.virtual_diving.projectmainver2.MovieList.MoveListMainActivity;


public class HomeActivity extends Activity {
    private ImageButton DM_btm, FG_btm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        DM_btm = (ImageButton)findViewById(R.id.VDButton); //ダイビングアクティビティに飛ぶボタンのidを渡す
        DM_btm.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(HomeActivity.this, MoveListMainActivity.class); //ダイビングアクティビティに飛ぶ処理
                startActivity(intent);
            }
        });

        FG_btm = (ImageButton)findViewById(R.id.FGButton); //図鑑アクティビティ用
        FG_btm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,ZukanListActivity.class); //図鑑アクティビティにに飛ぶ処理
                startActivity(intent);
            }
        });

    }
}
