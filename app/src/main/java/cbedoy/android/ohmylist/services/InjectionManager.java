package cbedoy.android.ohmylist.services;

import android.content.Context;
import android.os.Bundle;


import java.util.HashMap;

import cbedoy.android.ohmylist.MasterViewController;
import cbedoy.android.ohmylist.business.MasterBusinessController;
import cbedoy.android.ohmylist.business.bestguys.BestGuyBusinessController;
import cbedoy.android.ohmylist.interfaces.IAppViewManager;
import cbedoy.android.ohmylist.viewcontrollers.AbstractViewController;
import cbedoy.android.ohmylist.viewcontrollers.BestGuysViewController;
import cbedoy.android.ohmylist.widgets.MessageRepresentation;
import cbedoy.android.ohmylist.widgets.NavigationBar;

import static cbedoy.android.ohmylist.viewcontrollers.AbstractViewController.CONTROLLER;


/**
 * Created by Carlos on 14/10/2014.
 */
public class InjectionManager
{
    private int env = 0;
    private int rest_port;
    private String rest_url;
    private static InjectionManager _instance;

    public static InjectionManager getInstance() {
        if (_instance == null)
            _instance = new InjectionManager();

        return _instance;
    }

    private InjectionManager() {
        switch (this.env) {
            case 0: //dev
                this.rest_port = 8080;
                this.rest_url = "http://10.75.181.55";
                break;
            case 1: //pre
                this.rest_port = 8080;
                this.rest_url = "http://10.75.181.55";
                break;
            case 2: //pro
                this.rest_port = 8080;
                this.rest_url = "http://10.75.181.55";
                break;
            default:
                this.rest_port = 8080;
                this.rest_url = "http://10.75.181.55";
                break;
        }
    }

    public static final String MEDIA_URL = "http://10.75.181.55:8080/media/";

    public boolean isProduction() {
        return env == 2;
    }

    public boolean isPreProduction() {
        return env == 1;
    }

    public void perfomOhMyList(MasterViewController masterViewController){

        Context context = masterViewController.getApplicationContext();
        Bundle extras = masterViewController.getIntent().getExtras();
        IAppViewManager appViewManager = masterViewController;
        CONTROLLER tag;

        RestService restService = new RestService();
        restService.setURL(this.rest_url);
        restService.setPort(this.rest_port);

        MementoHandler mementoHandler = new MementoHandler();
        HashMap<String, Object> data = new HashMap<String, Object>();
        mementoHandler.setStateForOwner(data, this);

        MessageRepresentation messageRepresentation = new MessageRepresentation(masterViewController);
        InformationService informationService = new InformationService();
        MasterBusinessController masterBusinessController = new MasterBusinessController();

    }
}
