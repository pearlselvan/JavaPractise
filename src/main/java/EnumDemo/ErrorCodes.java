package EnumDemo;

import AnnodationDemo.InvokedMethodInformation;

/**
 * Created by muthuselvan on 5/16/17.
 */
public enum ErrorCodes {

    INTERNAL_SERVER_ERROR(503),
    INFORMATIONAL(100),
    CLIENT_ERROR(400);



    public Integer getErrorcode() {
        return errorcode;
    }

    Integer errorcode ;

    ErrorCodes(Integer errorcode) {
        this.errorcode = errorcode ;
    }
}
