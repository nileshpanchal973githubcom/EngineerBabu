package com.ebabu.engineerbabu.constant;

/**
 * Created by hp on 17/05/2017.
 */
public interface IUrlConstants {

    //Darshan's IP
    String BASE_URL = "http://192.168.77.27:3000/api/";

    //Ebabu live server IP
    //String BASE_URL = "http://35.154.116.77:3000/api/";

    String LOGIN = BASE_URL + "login";
    String NOTIFICATIONS_LIST = BASE_URL + "";
    String FORGOT_PASSWORD = BASE_URL + "forget_password";
    String SKILLS_LIST = BASE_URL + "get_skills_by_name_app";
    String EXPERTISE_LIST = BASE_URL + "get_category";
    String POST_PROJECT = BASE_URL + "get_category";
    String REGISTER_PART_1 = BASE_URL + "registartion_part1";
    String REGISTER_PART_2 = BASE_URL + "registartion_part2";
}
