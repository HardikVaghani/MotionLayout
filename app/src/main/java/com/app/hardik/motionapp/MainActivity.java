package com.app.hardik.motionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.app.hardik.motionapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<POJOPerson> pojoPersonArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        layoutManager = new LinearLayoutManager(this);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        binding.recyclerView.setLayoutManager(layoutManager);

        prepare_people();

    }

    private void prepare_people() {
        pojoPersonArrayList = new ArrayList<>();

        pojoPersonArrayList.add(new POJOPerson("Baby Girl","https://1.bp.blogspot.com/-vQrjYpMvZ4A/WieB3A2LOkI/AAAAAAAAOEQ/lkrNQN-tYm8vOJr7JpFeiKeOP1iU6oeqQCLcBGAs/s1600/8B1.png"));
        pojoPersonArrayList.add(new POJOPerson("Lety Cot","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2tg73AglzGr2aIDeCI08w3kkRFhRH5yNgkw&usqp=CAU"));
        pojoPersonArrayList.add(new POJOPerson("Eshasti Deon","https://p1.pxfuel.com/preview/246/74/524/portrait-girl-beautiful-people-female-young.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Het Girl","https://images.unsplash.com/photo-1614090965443-3df21c6906ec?ixlib=rb-4…wxMjA3fDB8MHxzZWFyY2h8M3x8cG9ydHJhaXQlMjBnaXJsfGVufDB8fDB8fHww&w=1000&q=80"));
        pojoPersonArrayList.add(new POJOPerson("Jia Loarn", "https://media.istockphoto.com/id/907865186/photo/handsome-man.jpg?s=612x612&w=0&k=20&c=6nIHksYpLZowAwCD1g0VOv7m_gpcoV9nKHC6WO91QNw="));
        pojoPersonArrayList.add(new POJOPerson("Sahar jaik","https://media.istockphoto.com/id/906837420/photo/handsome-man.jpg?s=612x612&w=0&k=20&c=KQn0ud4c7E6X_WYzTZiIvwtBk3iG4F4kcgSzNpDBseI="));
        pojoPersonArrayList.add(new POJOPerson("Pepor Skote","https://images.unsplash.com/photo-1561148720-2307bc064573?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE3fHx8ZW58MHx8fHx8&w=1000&q=80"));
        pojoPersonArrayList.add(new POJOPerson("Beuaty Quen","https://as2.ftcdn.net/v2/jpg/00/58/33/87/1000_F_58338758_BaIUCojwha7pmEq4oTTc5a2JiotiFmbH.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Chink Pongjo","https://media.istockphoto.com/id/864452362/photo/attractive-man-portrait.jpg?s=612x612&w=0&k=20&c=LBaHR1kWxR0mKkJtbUXAyBe53G3-6g2OzKPB6yIx_bM="));
        pojoPersonArrayList.add(new POJOPerson("Rusin Girl","https://i.pinimg.com/564x/9b/a6/d9/9ba6d96ecf07e4106712bb9687aca32b.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Hay Sweety","https://i.pinimg.com/564x/08/bb/e8/08bbe8053ddb2c903567e8a582168074.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Anjana Trivedi","https://i.pinimg.com/564x/dc/a7/35/dca735df8c70897c419bc7a8781837fd.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Vibes","https://i.pinimg.com/564x/49/64/2a/49642aaef19715eb0b98a4b12a9d95cc.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Anchal Gorane","https://i.pinimg.com/564x/6e/98/b6/6e98b68dce14238498bc1a15a6cb345e.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Maria Londern","https://i.pinimg.com/564x/79/d5/42/79d5425b3f062d898f873e2d9e8fc40a.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Hasin Parikh","https://i.pinimg.com/564x/82/e2/72/82e2726e09b08260c6828f18cbd5d036.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Honey Monde","https://i.pinimg.com/564x/47/9a/a6/479aa6b3996996403de43cd6533a2554.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Asti Roboi","https://i.pinimg.com/564x/aa/e9/b2/aae9b2b334866ef87871ef9996472133.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Tiger Shrof","https://i.pinimg.com/564x/bf/c1/fc/bfc1fc56ee4a4998a623064cd4581706.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Pegi Coter","https://i.pinimg.com/564x/27/0a/e2/270ae2425efb64e69b8693a28de910f5.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Shirina Alina","https://i.pinimg.com/564x/e0/ce/80/e0ce80871283fabde7aa6665ed1d0b64.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Chini Mia","https://i.pinimg.com/564x/19/07/ef/1907ef43acaf2b64e79acc1549094f76.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Soft Boy","https://i.pinimg.com/564x/e0/6a/20/e06a20c4b4007189975e1eb34a99f83f.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Guru Randhava","https://i.pinimg.com/564x/c0/09/e4/c009e4d4e4998ad9e4129d5178f9cbfc.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Heroin","https://i.pinimg.com/564x/b9/f5/b9/b9f5b9133784d0cba762434f4bc106b6.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Aladin","https://i.pinimg.com/564x/05/49/4a/05494a53b145ab87785546a67cfd90e6.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Salman Khan","https://i.pinimg.com/564x/d9/28/bf/d928bfa4d71e7b4953a15d1f2dd0acbf.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Sushant Rajput","https://i.pinimg.com/564x/d5/17/2e/d5172e8337a3fb64d15c8672caed6b38.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Little Boy","https://i.pinimg.com/564x/7d/b7/53/7db753948efadd521d81a4b637ce9305.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Cham","https://i.pinimg.com/564x/0d/7d/8b/0d7d8ba18485794a3caddd9899bb373b.jpg"));
        pojoPersonArrayList.add(new POJOPerson("Cute Baby","https://i.pinimg.com/564x/01/2f/41/012f41a04156c29d504c17e8b7909c3c.jpg"));

        CustomAdapter customAdapter = new CustomAdapter(pojoPersonArrayList, MainActivity.this);
        binding.recyclerView.setAdapter(customAdapter);
    }







}
/*






 */








