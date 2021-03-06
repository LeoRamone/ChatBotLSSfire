package com.leonardo_soares_santos.chatbotlssfire.DAO;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ConfigureDB {

    private static DatabaseReference referenceFireBase;
    private static FirebaseAuth autenticacao;



    public static DatabaseReference getFireBase(){

        if (referenceFireBase == null){

            referenceFireBase = FirebaseDatabase.getInstance().getReference();

        }
        return referenceFireBase;

    }

    public static FirebaseAuth getFireBaseAutenticacao(){

        if (autenticacao ==null){

            autenticacao = FirebaseAuth.getInstance();

        }
        return autenticacao;

    }
}
