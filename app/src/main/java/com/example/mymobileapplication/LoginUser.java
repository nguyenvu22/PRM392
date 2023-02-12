package com.example.mymobileapplication;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableField;

public class LoginUser extends BaseObservable{
    private String email;
    private String password;
    public ObservableField<String> messageLogin = new ObservableField<>();
    public ObservableField<Boolean> isShowMessage = new ObservableField<>();
    public ObservableField<Boolean> isSuccess = new ObservableField<>();
    private View view;

    public LoginUser() {
    }

    public LoginUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    public void onClickLogin(){
        LoginUser user = new LoginUser(getEmail(), getPassword());
        isShowMessage.set(true);
        if(user.email.equals("admin") && user.password.equals("123456")){
            messageLogin.set("Login successfully.");
            isSuccess.set(true);
//            loginSuccess(isSuccess);
        }else{
            messageLogin.set("Login failed!");
            isSuccess.set(false);
        }
    }

//    @BindingAdapter("loginSuccess")
//    public void loginSuccess(Boolean isSuccess){
//        Context context = view.getContext();
//        Intent intent = new Intent(context, HomeActivity.class);
//        intent.putExtra("loginEmail", email);
//        context.startActivity(intent);
//    }
}
