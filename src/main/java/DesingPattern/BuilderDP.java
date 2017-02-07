package DesingPattern;

/**
 * Created by muthuselvan on 1/31/17.
 */

/*

There are three major issues with Factory and Abstract Factory design patterns
 when the Object contains a lot of attributes.

1 .Too Many arguments to pass from client program to the Factory class that
can be error prone because most of the time, the type of arguments are same and
from client side its hard to maintain the order of the argument.

2 .Some of the parameters might be optional but in Factory pattern,
we are forced to send all the parameters and optional parameters need to send as NULL.

3. If the object is heavy and its creation is complex,
then all that complexity will be part of Factory classes that is confusing.

 */

/*

Implementaion logic :

1. First of all you need to create a static nested class and then copy
all the arguments from the outer class to the Builder class.

We should follow the naming convention and if the class name is Computer
then builder class should be named as ComputerBuilder.

2. Java Builder class should have a public constructor
with all the required attributes as parameters


 */


/*
Builder Design Pattern Example in JDK

Some of the builder pattern example in Java classes are;

java.lang.StringBuilder#append() (unsynchronized)
java.lang.StringBuffer#append() (synchronized)

 */

public class BuilderDP {

    public static void main(String[] args) {

            Report testReport = new Report.ReportBuilder("com.util","ArrayList","put").setHTMLReportEnable(true).build();
            String className = testReport.getClassName();
            System.out.println("ClassName : " +className);
        }

    }


class Report {

    // required parameters
    private String packageName ;
    private String className ;
    private String methodName ;

    //optional parameters
    private boolean isHTMLReportEnable ;
    private boolean isPDFReportEnable ;




    public String getPackageName() {
        return packageName;
    }

    public String getClassName() {
        return className;
    }

    public String getMethodName() {
        return methodName;
    }

    public boolean isHTMLReportEnable() {
        return isHTMLReportEnable;
    }

    public boolean isPDFReportEnable() {
        return isPDFReportEnable;
    }

    // IMPORTANT : SET FROM BUILDER
    public Report(ReportBuilder reportBuilder) {
        this.packageName = reportBuilder.packageName; // IMPORTANT : SET FROM BUILDER
        this.className = reportBuilder.className;// IMPORTANT : SET FROM BUILDER
        this.methodName = reportBuilder.methodName;// IMPORTANT : SET FROM BUILDER
        this.isHTMLReportEnable=reportBuilder.isHTMLReportEnable;// IMPORTANT : SET FROM BUILDER
        this.isPDFReportEnable=reportBuilder.isPDFReportEnable;// IMPORTANT : SET FROM BUILDER
    }

    //Builder Class
    //<<< STEP 1 : >>>
    //First of all you need to create a static nested class and then copy all the arguments
    // from the outer class to the Builder class.
    // We should follow the naming convention and if the class name is Report then builder class
    // should be named as ReportBuilder.
    public static class ReportBuilder {


        //STEP 2
        // Java Builder class should have a public constructor with
        // all the required attributes as parameters.
        // required parameters
        private String packageName ;
        private String className ;
        private String methodName ;

        //optional parameters
        private boolean isHTMLReportEnable ;
        private boolean isPDFReportEnable ;


        public ReportBuilder(String packageName, String className, String methodName) {
            this.packageName = packageName;
            this.className = className;
            this.methodName = methodName;
        }

        //STEP 3
        // Java Builder class should have methods to set the optional parameters
        // and it should return the same Builder object after setting the optional
        // attribute.
        public ReportBuilder setHTMLReportEnable(boolean HTMLReportEnable) {
            this.isHTMLReportEnable = HTMLReportEnable;
            return this;
        }

        //STEP 3
        // Java Builder class should have methods to set the optional parameters
        // and it should return the same Builder object after setting the optional
        // attribute.
        public ReportBuilder setPDFReportEnable(boolean PDFReportEnable) {
            this.isPDFReportEnable = PDFReportEnable;
            return this;
        }

        //STEP 4
        // The final step is to provide a build() method in the builder class
        // that will return the Object needed by client program.
        // For this we need to have a private constructor in the Class with Builder class as argument.
        public Report build() {
            return new Report(this);
        }
    }
}
