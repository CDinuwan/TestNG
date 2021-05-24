package testng;

import org.testng.annotations.*;

public class TestNGAnnotation {
    public static void main(String[] args){
        AnnotationConfiguration annotationPractise=new AnnotationConfiguration();
        annotationPractise.beforeSuite();
        annotationPractise.beforeTest();
        annotationPractise.beforeClass();
        annotationPractise.beforeMethod();
        annotationPractise.searchProduct();
        annotationPractise.searchCustomer();
        annotationPractise.afterMethod();
        annotationPractise.afterClass();
        annotationPractise.afterTest();
        annotationPractise.afterSuite();
    }
}
