package com.example.teleinfo.login;

import static android.content.ContentValues.TAG;
import static com.example.teleinfo.parameters.MainParameters.SHARED_PREFERENCES;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.teleinfo.R;
import com.example.teleinfo.guide._MainActivityGuide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.wang.avi.AVLoadingIndicatorView;

import org.json.JSONException;
import org.json.JSONObject;

public class FragmentFirstLoginQR extends Fragment implements BottomSheetDialogQRCodeReading.QRCodeParseListener, BottomSheetDialogCredentialsLogin.CredentialsListener{

    // https://androiddvlpr.com/zxing-android-example/

    TextView textViewInfoText;
    TextView textViewStatus;
    TextView textViewNameOfUser;
    TextView textViewLoginWithCredentials;
    Button buttonQRScan;
    AVLoadingIndicatorView aVLoadingIndicatorViewLogging;

    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mDatabaseReference;

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    public FragmentFirstLoginQR() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.login_fragment_first_login_qr, container, false);

        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mDatabaseReference = mFirebaseDatabase.getReference("TeleInfo/Administration/Users/");

        mSharedPreferences = getActivity().getSharedPreferences(SHARED_PREFERENCES, Context.MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();


      //  mDatabaseReference.child("titlesBeforeName").setValue("Ing.");
      //  mDatabaseReference.child("Name").setValue("David");
      //  mDatabaseReference.child("Surname").setValue("Va??????ek");
      //  mDatabaseReference.child("titlesAfterTheName").setValue("");
      //  mDatabaseReference.child("shortcut").setValue("Va??");
      //  mDatabaseReference.child("email").setValue("vasicek@teleinformatika.eu");
       // mDatabaseReference.child("phoneNumber").setValue("731 531 389");
       /// mDatabaseReference.child("officeNumber").setValue("A 1006");

       // mDatabaseReference.child("registeredDevices/64564564564564/DeviceID").setValue("64564564564564");
       // mDatabaseReference.child("registeredDevices/64564564564564/Brand").setValue("Xiaomi");
       // mDatabaseReference.child("registeredDevices/64564564564564/Token").setValue("hkjfdhkgdf????g??df??????bdf??h????dsf????????h");

/*
        mDatabaseReference.child("vasicek_teleinformatika_eu").child("b????n??Info").child("TitulyPredJmenem").setValue("Ing.");
        mDatabaseReference.child("vasicek_teleinformatika_eu").child("b????n??Info").child("TitulyZaJmenem").setValue("");
        mDatabaseReference.child("vasicek_teleinformatika_eu").child("b????n??Info").child("Name").setValue("David");
        mDatabaseReference.child("vasicek_teleinformatika_eu").child("b????n??Info").child("Surname").setValue("Va??????ek");
        mDatabaseReference.child("vasicek_teleinformatika_eu").child("b????n??Info").child("Zkratka").setValue("Va??");

        mDatabaseReference.child("vasicek_teleinformatika_eu").child("adminstra??n??Info").child("PairTimeTable").setValue("Va??????ek_David_Va??");
        mDatabaseReference.child("vasicek_teleinformatika_eu").child("adminstra??n??Info").child("Email").setValue("vasicek@teleinformatika.eu");
        mDatabaseReference.child("vasicek_teleinformatika_eu").child("adminstra??n??Info").child("AccessKey").setValue("123456789");
        mDatabaseReference.child("vasicek_teleinformatika_eu").child("adminstra??n??Info").child("role").setValue(1);

        mDatabaseReference.child("vasicek_teleinformatika_eu").child("b????n??Info").child("Vyu??ovan??P??edm??ty").setValue("PJ_Programovac?? jazyky;PRA_Praxe");
        mDatabaseReference.child("vasicek_teleinformatika_eu").child("b????n??Info").child("Funkce").setValue("U??itel odborn??ch p??edm??t??;V??chovn?? poradce");


        mDatabaseReference.child("vasicek_teleinformatika_eu").child("PairedDevices").child("hgdjhdf68d7f67d6fg/allowed").setValue(true);

        m?? omluvenkov?? modul ........ true or false
        je t????dn??    true false a jak?? t????dy
        u??ivatel m?? p????stup






*/



        textViewInfoText = (TextView)rootView.findViewById(R.id.loginFragmentFirstLoginQRTextViewInfoText);
        textViewStatus = (TextView)rootView.findViewById(R.id.loginFragmentFirstLoginQRTextViewStatus);
        textViewNameOfUser = (TextView)rootView.findViewById(R.id.loginFragmentFirstLoginQRTextViewNameOfUser);
        textViewLoginWithCredentials = (TextView)rootView.findViewById(R.id.loginFragmentFirstLoginQRTextViewLoginWithCredentials);
        buttonQRScan = (Button)rootView.findViewById(R.id.loginFragmentFirstLoginQRButtonQRScan);
        aVLoadingIndicatorViewLogging = (AVLoadingIndicatorView)rootView.findViewById(R.id.loginFragmentFirstLoginQRAVLoadingIndicatorViewLogging);

        textViewNameOfUser.setVisibility(View.GONE);
        textViewStatus.setVisibility(View.GONE);
        aVLoadingIndicatorViewLogging.setVisibility(View.GONE);

        buttonQRScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BottomSheetDialogQRCodeReading bottomSheetDialogQRCodeReading = new BottomSheetDialogQRCodeReading();
                bottomSheetDialogQRCodeReading.show(getChildFragmentManager(), "exampleBottomSheet");

            }
        });

        textViewLoginWithCredentials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BottomSheetDialogCredentialsLogin bottomSheetDialogCredentialsLogin = new BottomSheetDialogCredentialsLogin();
                bottomSheetDialogCredentialsLogin.show(getChildFragmentManager(), "exampleBottomSheet");

            }
        });




        return rootView;
    }


    @Override
    public void applyQRCodeParseListener(String message) {



        try {

           // String json = "{\"email\":\"vasicek@teleinformatika.eu\", \"password\":\"123456789\"}";
            JSONObject root = new JSONObject(message);

            login(root.getString("email"), root.getString("password"));

        } catch (JSONException e) {
            e.printStackTrace();
        }



    }

    @Override
    public void applyCredentialsListener(String username, String password) {

        login(username, password);
    }



    boolean login(String username, String password) {



        String email = username.replace("@","_").replace(".","_");
        Log.e(TAG, "___________________" + email);

        textViewNameOfUser.setVisibility(View.VISIBLE);
        textViewStatus.setVisibility(View.VISIBLE);
        aVLoadingIndicatorViewLogging.setVisibility(View.VISIBLE);

        textViewStatus.setText("Ov????uji u??ivatele");
        textViewStatus.setTextColor(getContext().getResources().getColor(R.color.text_secondary));

        textViewNameOfUser.setText(username);
        buttonQRScan.setVisibility(View.GONE);
        textViewLoginWithCredentials.setVisibility(View.GONE);
        textViewInfoText.setVisibility(View.GONE);

        mDatabaseReference = mFirebaseDatabase.getReference("TeleInfo/Administration/Users/" + email + "/adminstra??n??Info/AccessKey");

        mDatabaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                if(dataSnapshot.getValue(String.class).compareTo(password) == 0){

                    Log.e(TAG, "___________________" + " anooooooooo");
                    // otev??i pr??vodce nastaven??m android aplikac?? (zabezpe??en??, vzhled, notifikace - notifikace stavu bateri??, notifikace offlinosti senzor??, notifikace ud??lost??
                    // notifikace narozenin a sv??tk??.......)

                    mDatabaseReference = mFirebaseDatabase.getReference("TeleInfo/Administration/Users/" + email + "/adminstra??n??Info");
                    mDatabaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {




                           // Log.e(TAG, "___________________" + dataSnapshot.child("PairTimeTable").getValue(String.class) );
                         //   Log.e(TAG, "___________________" + dataSnapshot.child("role").getValue(int.class) );






                            Intent myIntent = new Intent(getContext(), _MainActivityGuide.class);
                            myIntent.putExtra("Email", email);
                            myIntent.putExtra("Password", password);
                            myIntent.putExtra("PairTimeTable", dataSnapshot.child("PairTimeTable").getValue(String.class));
                            myIntent.putExtra("Role", dataSnapshot.child("role").getValue(int.class));
                            myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            getActivity().startActivity(myIntent);
                            getActivity().finish();


                        }
                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });



                }else{

                    Log.e(TAG, "___________________" + "neeeeeeee");
                    Toast.makeText(getContext(),"kl???? nenen?? spr??vn??",Toast.LENGTH_LONG).show();

                    textViewNameOfUser.setVisibility(View.GONE);
                    textViewStatus.setVisibility(View.VISIBLE);
                    aVLoadingIndicatorViewLogging.setVisibility(View.GONE);

                    textViewStatus.setText("Ov????en?? se nazda??ilo\n\nEmail nebo heslo nen?? spr??vn??");
                    textViewStatus.setTextColor(getContext().getResources().getColor(R.color.red700colorAccent));
                    textViewNameOfUser.setText("");
                    buttonQRScan.setVisibility(View.VISIBLE);
                    textViewLoginWithCredentials.setVisibility(View.VISIBLE);
                    textViewInfoText.setVisibility(View.VISIBLE);

                }




            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        return true;
    }
}









