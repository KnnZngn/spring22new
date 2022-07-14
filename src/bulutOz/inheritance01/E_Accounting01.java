package bulutOz.inheritance01;

public class E_Accounting01 extends E_Employee01 {  // Employee çalışanlar parents oldu
    protected int hourlyFee;
    protected String status;  //title
    protected int salary;

    protected int salaryAccount(){
        int salary=hourlyFee*8*30;
        return salary;
    }

}
