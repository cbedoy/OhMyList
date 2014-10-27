package cbedoy.android.ohmylist.services;

import android.content.Context;
import android.os.Bundle;


import java.util.HashMap;

import cbedoy.android.ohmylist.MasterViewController;
import cbedoy.android.ohmylist.business.MasterBusinessController;
import cbedoy.android.ohmylist.business.bestguys.BestGuyBusinessController;
import cbedoy.android.ohmylist.business.califications.CalificationBusinessController;
import cbedoy.android.ohmylist.business.degree.DegreeBusinessController;
import cbedoy.android.ohmylist.business.group.GroupBusinessController;
import cbedoy.android.ohmylist.business.list.ListBusinessController;
import cbedoy.android.ohmylist.business.login.LoginBusinessController;
import cbedoy.android.ohmylist.business.notes.NotesBusinessController;
import cbedoy.android.ohmylist.business.profile.ProfileBusinessController;
import cbedoy.android.ohmylist.business.signup.SignUpBusinessController;
import cbedoy.android.ohmylist.business.userprofile.UserProfileBusinessController;
import cbedoy.android.ohmylist.interfaces.IAppViewManager;
import cbedoy.android.ohmylist.viewcontrollers.AbstractViewController;
import cbedoy.android.ohmylist.viewcontrollers.BestGuysViewController;
import cbedoy.android.ohmylist.viewcontrollers.CalificationViewController;
import cbedoy.android.ohmylist.viewcontrollers.DegreeViewController;
import cbedoy.android.ohmylist.viewcontrollers.GroupViewController;
import cbedoy.android.ohmylist.viewcontrollers.ListViewController;
import cbedoy.android.ohmylist.viewcontrollers.LoginViewController;
import cbedoy.android.ohmylist.viewcontrollers.NoteViewController;
import cbedoy.android.ohmylist.viewcontrollers.ProfileViewController;
import cbedoy.android.ohmylist.viewcontrollers.SignUpViewController;
import cbedoy.android.ohmylist.viewcontrollers.UserProfileViewController;
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


        tag = CONTROLLER.BESTGUYS;
        BestGuyBusinessController bestGuyBusinessController = new BestGuyBusinessController();
        BestGuysViewController bestGuysViewController = new BestGuysViewController();
        NavigationBar bestGuysNavigationBar = new NavigationBar();
        bestGuyBusinessController.setInformationHandler(informationService);
        bestGuyBusinessController.setRepresentationHandler(bestGuysViewController);
        bestGuyBusinessController.setTransactionHandler(masterBusinessController);
        bestGuysViewController.setRepresentationDelegate(bestGuyBusinessController);
        bestGuysViewController.setAppViewManager(appViewManager);
        bestGuysViewController.setContext(context);
        bestGuysViewController.setMessageRepresentation(messageRepresentation);
        bestGuysViewController.setTag(tag);
        bestGuysViewController.setNavigationBar(bestGuysNavigationBar);
        bestGuysNavigationBar.setNavigationBarDelegate(bestGuysViewController);
        appViewManager.addViewWithTag(bestGuysViewController, tag);


        tag = CONTROLLER.CALIFICATION;
        CalificationBusinessController calificationBusinessController = new CalificationBusinessController();
        CalificationViewController calificationViewController = new CalificationViewController();
        NavigationBar calificationNavigationBar = new NavigationBar();
        calificationBusinessController.setInformationHandler(informationService);
        calificationBusinessController.setRepresentationHandler(calificationViewController);
        calificationBusinessController.setTransactionHandler(masterBusinessController);
        calificationViewController.setRepresentationDelegate(calificationBusinessController);
        calificationViewController.setAppViewManager(appViewManager);
        calificationViewController.setContext(context);
        calificationViewController.setMessageRepresentation(messageRepresentation);
        calificationViewController.setTag(tag);
        calificationViewController.setNavigationBar(calificationNavigationBar);
        calificationNavigationBar.setNavigationBarDelegate(calificationViewController);
        appViewManager.addViewWithTag(calificationViewController, tag);


        tag = CONTROLLER.DEGREE;
        DegreeBusinessController degreeBusinessController = new DegreeBusinessController();
        DegreeViewController degreeViewController = new DegreeViewController();
        NavigationBar degreeNavigationBar = new NavigationBar();
        degreeBusinessController.setInformationHandler(informationService);
        degreeBusinessController.setRepresentationHandler(degreeViewController);
        degreeBusinessController.setTransactionHandler(masterBusinessController);
        degreeViewController.setRepresentationDelegate(degreeBusinessController);
        degreeViewController.setAppViewManager(appViewManager);
        degreeViewController.setContext(context);
        degreeViewController.setMessageRepresentation(messageRepresentation);
        degreeViewController.setTag(tag);
        degreeViewController.setNavigationBar(degreeNavigationBar);
        degreeNavigationBar.setNavigationBarDelegate(degreeViewController);
        appViewManager.addViewWithTag(degreeViewController, tag);


        tag = CONTROLLER.GROUP;
        GroupBusinessController groupBusinessController = new GroupBusinessController();
        GroupViewController groupViewController = new GroupViewController();
        NavigationBar groupNavigationBar = new NavigationBar();
        groupBusinessController.setInformationHandler(informationService);
        groupBusinessController.setRepresentationHandler(groupViewController);
        groupBusinessController.setTransactionHandler(masterBusinessController);
        groupViewController.setRepresentationDelegate(groupBusinessController);
        groupViewController.setAppViewManager(appViewManager);
        groupViewController.setContext(context);
        groupViewController.setMessageRepresentation(messageRepresentation);
        groupViewController.setTag(tag);
        groupViewController.setNavigationBar(groupNavigationBar);
        groupNavigationBar.setNavigationBarDelegate(groupViewController);
        appViewManager.addViewWithTag(groupViewController, tag);


        tag = CONTROLLER.LIST;
        ListBusinessController listBusinessController = new ListBusinessController();
        ListViewController listViewController = new ListViewController();
        NavigationBar listNavigationBar = new NavigationBar();
        listBusinessController.setInformationHandler(informationService);
        listBusinessController.setRepresentationHandler(listViewController);
        listBusinessController.setTransactionHandler(masterBusinessController);
        listViewController.setRepresentationDelegate(listBusinessController);
        listViewController.setAppViewManager(appViewManager);
        listViewController.setContext(context);
        listViewController.setMessageRepresentation(messageRepresentation);
        listViewController.setTag(tag);
        listViewController.setNavigationBar(listNavigationBar);
        listNavigationBar.setNavigationBarDelegate(listViewController);
        appViewManager.addViewWithTag(listViewController, tag);


        tag = CONTROLLER.LOGIN;
        LoginBusinessController loginBusinessController = new LoginBusinessController();
        LoginViewController loginViewController = new LoginViewController();
        NavigationBar loginNavigationBar = new NavigationBar();
        loginBusinessController.setInformationHandler(informationService);
        loginBusinessController.setRepresentationHandler(loginViewController);
        loginBusinessController.setTransactionHandler(masterBusinessController);
        loginViewController.setRepresentationDelegate(loginBusinessController);
        loginViewController.setAppViewManager(appViewManager);
        loginViewController.setContext(context);
        loginViewController.setMessageRepresentation(messageRepresentation);
        loginViewController.setTag(tag);
        loginViewController.setNavigationBar(loginNavigationBar);
        loginNavigationBar.setNavigationBarDelegate(loginViewController);
        appViewManager.addViewWithTag(listViewController, tag);

        tag = CONTROLLER.NOTES;
        NotesBusinessController notesBusinessController = new NotesBusinessController();
        NoteViewController noteViewController = new NoteViewController();
        NavigationBar noteNavigationBar = new NavigationBar();
        notesBusinessController.setInformationHandler(informationService);
        notesBusinessController.setRepresentationHandler(noteViewController);
        notesBusinessController.setTransactionHandler(masterBusinessController);
        noteViewController.setRepresentationDelegate(notesBusinessController);
        noteViewController.setAppViewManager(appViewManager);
        noteViewController.setContext(context);
        noteViewController.setMessageRepresentation(messageRepresentation);
        noteViewController.setTag(tag);
        noteViewController.setNavigationBar(noteNavigationBar);
        noteNavigationBar.setNavigationBarDelegate(noteViewController);
        appViewManager.addViewWithTag(listViewController, tag);

        tag = CONTROLLER.PROFILE;
        ProfileBusinessController profileBusinessController = new ProfileBusinessController();
        ProfileViewController profileViewController = new ProfileViewController();
        NavigationBar profileNavigationBar = new NavigationBar();
        profileBusinessController.setInformationHandler(informationService);
        profileBusinessController.setRepresentationHandler(profileViewController);
        profileBusinessController.setTransactionHandler(masterBusinessController);
        profileViewController.setRepresentationDelegate(profileBusinessController);
        profileViewController.setAppViewManager(appViewManager);
        profileViewController.setContext(context);
        profileViewController.setMessageRepresentation(messageRepresentation);
        profileViewController.setTag(tag);
        profileViewController.setNavigationBar(profileNavigationBar);
        profileNavigationBar.setNavigationBarDelegate(profileViewController);
        appViewManager.addViewWithTag(listViewController, tag);


        tag = CONTROLLER.SINGUP;
        SignUpBusinessController signUpBusinessController = new SignUpBusinessController();
        SignUpViewController signUpViewController = new SignUpViewController();
        NavigationBar signupNavigationBar = new NavigationBar();
        signUpBusinessController.setInformationHandler(informationService);
        signUpBusinessController.setRepresentationHandler(signUpViewController);
        signUpBusinessController.setTransactionHandler(masterBusinessController);
        signUpViewController.setRepresentationDelegate(signUpBusinessController);
        signUpViewController.setAppViewManager(appViewManager);
        signUpViewController.setContext(context);
        signUpViewController.setMessageRepresentation(messageRepresentation);
        signUpViewController.setTag(tag);
        signUpViewController.setNavigationBar(signupNavigationBar);
        signupNavigationBar.setNavigationBarDelegate(signUpViewController);
        appViewManager.addViewWithTag(signUpViewController, tag);


        tag = CONTROLLER.USER_PROFILE;
        UserProfileBusinessController userProfileBusinessController = new UserProfileBusinessController();
        UserProfileViewController userProfileViewController = new UserProfileViewController();
        NavigationBar userProfileNavigationBar = new NavigationBar();
        userProfileBusinessController.setInformationHandler(informationService);
        userProfileBusinessController.setRepresentationHandler(userProfileViewController);
        userProfileBusinessController.setTransactionHandler(masterBusinessController);
        userProfileViewController.setRepresentationDelegate(userProfileBusinessController);
        userProfileViewController.setAppViewManager(appViewManager);
        userProfileViewController.setContext(context);
        userProfileViewController.setMessageRepresentation(messageRepresentation);
        userProfileViewController.setTag(tag);
        userProfileViewController.setNavigationBar(userProfileNavigationBar);
        userProfileNavigationBar.setNavigationBarDelegate(userProfileViewController);
        appViewManager.addViewWithTag(signUpViewController, tag);


        informationService.setBestGuyInformationDelegate(bestGuyBusinessController);
        informationService.setCalificationInformationDelegate(calificationBusinessController);
        informationService.setDegreeInformationDelegate(degreeBusinessController);
        informationService.setGroupInformationDelegate(groupBusinessController);
        informationService.setListInformationDelegate(listBusinessController);
        informationService.setLoginInformationDelegate(loginBusinessController);
        informationService.setUserProfileInformationDelegate(userProfileBusinessController);
        informationService.setNoteInformationDelegate(notesBusinessController);
        informationService.setProfileInformationDelegate(profileBusinessController);
        informationService.setSignupInformationDelegate(signUpBusinessController);
        informationService.setMementoHandler(mementoHandler);
        informationService.setRestService(restService);


        masterBusinessController.setBestGuyTransactionDelegate(bestGuyBusinessController);
        masterBusinessController.setCalificationTransactionDelegate(calificationBusinessController);
        masterBusinessController.setDegreeTransactionDelegate(degreeBusinessController);
        masterBusinessController.setGroupTransactionDelegate(groupBusinessController);
        masterBusinessController.setListTransactionDelegate(listBusinessController);
        masterBusinessController.setLoginTransactionDelegate(loginBusinessController);
        masterBusinessController.setNoteTransactionDelegate(notesBusinessController);
        masterBusinessController.setProfileTransactionDelegate(profileBusinessController);
        masterBusinessController.setSignupTransactionDelegate(signUpBusinessController);
        masterBusinessController.setUserProfileTransactionDelegate(userProfileBusinessController);

        masterBusinessController.startOhMyList();


    }
}
