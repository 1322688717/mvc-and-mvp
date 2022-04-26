package com.example.mvpdemo;

import java.util.Random;

public class Persenter {
    private IMainView view;
    private BeanAccount beanAccount;

    public Persenter(IMainView view) {
        this.view = view;
        this.beanAccount = beanAccount;
    }

    public void getData(){
        boolean isSuccess;
        Random random = new Random();
        isSuccess = random.nextBoolean();
        if (isSuccess == true){
            BeanAccount beanAccount = new BeanAccount();
            String name = beanAccount.getName();
            view.showText(name);
            view.showSuccess();
        }else {
            view.showText("获取失败");
            view.showFail();
        }

    }

}
