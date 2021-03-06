package auribises.com.register_guard;

import android.net.Uri;

public class Util {

    // Information for my Database
    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "Register_Guard.db";

    // Information for my Table
    public static final String TAB_NAME = "Register_Guard";
    public static final String COL_ID = "_ID";
    public static final String COL_NAME = "NAME";
    public static final String COL_PHONE = "PHONE";
    public static final String COL_EMAIL = "EMAIL";
    public static final String COL_BIRTH_DATE = "BIRTH_DATE";
    public static final String COL_GENDER = "GENDER";
    public static final String COL_ADDRESS = "ADDRESS";
    public static final String COL_QUALIFICATION = "QUALIFICATION";
    public static final String COL_EXPERIENCE = "EXPERIENCE";


    public static final String CREATE_TAB_QUERY = "create table Register_Guard(" +
            "_ID integer primary key autoincrement," +
            "NAME varchar(256)," +
            "PHONE varchar(256)," +
            "EMAIL varchar(256)," +
            "BIRTH_DATE varchar(256)," +
            "GENDER varchar(256)," +
            "ADDRESS varchar(256)," +
            "QUALIFICATION varchar(256)," +
            "EXPERIENCE varchar(256)" +
            ")";


    public static final String PREFS_NAME = "visitorbook";
    public static final String KEY_NAME = "keyName";
    public static final String KEY_PHONE = "keyPhone";
    public static final String KEY_EMAIL = "keyEmail";
    public static final String KEY_BIRTH_DATE = "keyBirth_date";
    public static final String KEY_GENDER = "keyGender";
    public static final String KEY_ADDRESS = "keyAddress";
    public static final String KEY_PURPOSE = "keyQualification";
    public static final String KEY_DATE = "keyExperience";

    // URI
    public static final Uri REGISTERGUARD_URI = Uri.parse("content://com.auribises.Register_Guard.teacherprovider/"+TAB_NAME);


    final static String URI = "http://tajinderj.esy.es/admin2017/";
    // URL
    public static final String INSERT_REGISTERGUARD_PHP = "http://tajinderj.esy.es/registerguard/insert.php";

    public static final String RETRIEVE_REGISTERGUARD_PHP = "http://tajinderj.esy.es/registerguard/retrieve.php";

    public static final String DELETE_REGISTERGUARD_PHP = "http://tajinderj.esy.es/registerguard/delete.php";

    public static final String UPDATE_REGISTERGUARD_PHP = "http://tajinderj.esy.es/registerguard/update.php";
}
