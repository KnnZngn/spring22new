package bulutOz.inheritance01;

public class DT_Inh_Worker extends DT_Inh_Person {
    public String status="Worker,Employee"; // herkes variable a ulaşsın diye public yaptık
    public String rights="All workers gets(takes,receives) severance pay"; //kıdm tazmnatı severance pay
    public String bonus="All workers gets a bonus(ikramiye)  for in a year";// yasin obje üzerinden buna uaşablrm



    public void overtime() {  // herkes variable a ulaşsın diye public yaptık
        System.out.println("All employees works for 40 hours in a week ");
    }

    public void calculateSalary(){
        System.out.println("All workers(employee) gets  for 30 days * 8 hours * 11 €= " + (30*8*11)+" € salary");
    }

}
