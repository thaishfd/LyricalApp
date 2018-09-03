package com.example.alunos.lyricalapp;

import android.support.annotation.NonNull;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conexao {

    private static FirebaseAuth firebaseAuth;
    private static FirebaseAuth.AuthStateListener authStateListener;
    private static FirebaseUser firebaseUser;

    private Conexao(){

    }
    public static FirebaseAuth getFirebaseAuth(){
        if (firebaseAuth == null){
            inicializarFirebaseAuth();
        }
        return firebaseAuth;
    }

    private static void inicializarFirebaseAuth(){
        firebaseAuth = FirebaseAuth.getInstance();
        authStateListener = new FirebaseAuth.Auth.StateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth){
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null){
                    firebaseUser = user;
                }
            }
        };
        firebaseAuth.addAuthStateListener(authStateListener);
    }

    public static FirebaseUser getFirebaseUser(){
        return firebaseUser;
    }

    public static void logOut(){
        firebaseAuth.signOut();
    }


}
