package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "AmazonInc";

        ProductOwner po = new ProductOwner("Nalan",19,'F',1,100000,company);

        BusinessAnalyst ba = new BusinessAnalyst("Meltem",22,'F',2,150000,company);

        ScrumMaster sm = new ScrumMaster("Gülsün",37,'F',3,180000,company);


        Tester tester1 = new Tester("Cihan",33,'M',"QA",1234,120000,company);
        Tester tester2 = new Tester("Cemal",38,'M',"QE",12345,125000,company);
        Tester tester3 = new Tester("Bekir",39,'M',"SDET",12346,130000,company);
        Tester tester4 = new Tester("Zübeyir",38,'M',"QA",12347,135000,company);

        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Meva",35,'F',"Java Developer",12345678,145000,company);

        ScrumTeam scrumTeam = new ScrumTeam(po,ba,sm);

        System.out.println(scrumTeam);

        scrumTeam.addDeveloper(developer1);
        System.out.println(scrumTeam);

        scrumTeam.addTesters(testers);
        System.out.println(scrumTeam);

        System.out.println("--------------------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester);
        }

        System.out.println("--------------------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name + " : "+ tester.salary);
        }


    }
}
