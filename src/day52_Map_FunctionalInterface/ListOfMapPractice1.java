package day52_Map_FunctionalInterface;

import java.util.*;

public class ListOfMapPractice1 {

    public static void main(String[] args) {

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", "SM");
        scrumTeam1.put("Nikita", "Developer");
        scrumTeam1.put("Alina", "Developer");
        scrumTeam1.put("Mert", "PO");
        scrumTeam1.put("Lee", "SDET");


        Map<String, String> scrumTeam2 = new LinkedHashMap<>();
        scrumTeam2.put("Anton", "SDET");
        scrumTeam2.put("Muhammed", "Developer");
        scrumTeam2.put("Gulistan", "Developer");
        scrumTeam2.put("Ahmad", "PO");
        scrumTeam2.put("Nevim", "SM");
        scrumTeam2.put("Atakan", "SDET");


        Map<String, String> scrumTeam3 = new LinkedHashMap<>();
        scrumTeam3.put("YanChun", "BA");
        scrumTeam3.put("Tahir", "Developer");
        scrumTeam3.put("Urantuya", "SM");
        scrumTeam3.put("Veronica", "Developer");
        scrumTeam3.put("Alex", "Developer");
        scrumTeam3.put("Abdulaziz", "Developer");


        Map<String, String> scrumTeam4 = new LinkedHashMap<>();
        scrumTeam4.put("Alim", "PO");
        scrumTeam4.put("Kaiser", "SDET");
        scrumTeam4.put("Alinur", "SDET");
        scrumTeam4.put("Farya", "Develepor");
        scrumTeam4.put("Sherzod", "Developer");
        scrumTeam4.put("Gulsen", "SM");
        scrumTeam4.put("David", "Sdet");


        Map<String, String> scrumTeam5 = new LinkedHashMap<>();
        scrumTeam5.put("Elza", "SDET");
        scrumTeam5.put("Mehmet", "Developer");
        scrumTeam5.put("Stefan", "Developer");
        scrumTeam5.put("Rishat", "PO");
        scrumTeam5.put("Ismail", "SM");
        scrumTeam5.put("Tamara", "SDET");
        scrumTeam5.put("Adnan", "QA");



        // 1.1 Create a data structure that can contain all the given maps above
        //#######------ MY SOLUTION------#######
        Map<Integer, Map> scrumTeams = new LinkedHashMap<>();
        scrumTeams.put(1, scrumTeam1);
        scrumTeams.put(2, scrumTeam2);
        scrumTeams.put(3, scrumTeam3);
        scrumTeams.put(4, scrumTeam4);
        scrumTeams.put(5, scrumTeam5);


        System.out.println(scrumTeams);
        System.out.println(scrumTeams.size());
        System.out.println("------------------");
        for (Map.Entry<Integer, Map> pair : scrumTeams.entrySet()) {
            System.out.println(pair);
        }
        System.out.println("==============================================================");
        //----#####MUHTAR SOLUTION-----####
     //   List<LinkedHashMap <String, String> > scrumTeams1 = new ArrayList<>();  // BUSEKILDE OLDUGUNDA ELEMAN EKLEME YAPARKEN HATA VERIYOR, hata vermemesi icin casting yapmaliyiz
        List< Map <String, String> > scrumTeamsM = new ArrayList<>(); // bunu kapatip yukaridakini ac bak ne demek istedigimi anliyacan hacii
        scrumTeamsM.add(scrumTeam1);
        scrumTeamsM.add(scrumTeam2);
        scrumTeamsM.addAll(Arrays.asList(scrumTeam3, scrumTeam4, scrumTeam5));


        System.out.println(scrumTeamsM);
        System.out.println(scrumTeamsM.size());

        System.out.println("==============================================================");
        //  Print the names of all employees

        for (Map<String, String> eachScrumTeamM : scrumTeamsM) {
            for (Map.Entry<String, String> entry : eachScrumTeamM.entrySet()) {
                System.out.println(entry.getKey()+ " : " + entry.getValue());
            }

        }

        System.out.println("==============================================================");
       // 1.2 Print the names of all scrum masters

        for (Map<String, String> eachScrumTeamM : scrumTeamsM) {
            for (Map.Entry<String, String> entry : eachScrumTeamM.entrySet()) {
                if (entry.getValue().equalsIgnoreCase("SM"))
                System.out.println(entry.getKey());
            }

        }

        //SADECE isimleri istemis burada istedigibi yaptim ama assgida karsilarina mesleklerini de yazdirdim
        System.out.println("==============================================================");
        // 1.3 Print the names of all Developers

        for (Map<String, String> eachScrumTeamM : scrumTeamsM) {
            for (Map.Entry<String, String> entry : eachScrumTeamM.entrySet()) {
                if (entry.getValue().equalsIgnoreCase("Developer"))
                    System.out.println(entry.getKey()+ " : " + entry.getValue());
            }

        }




    }
}
/*
2. Go to Package day52_Map_FunctionalInterface -> ListOfMapPractice1, and Complete all the given task requirments


1.Given the following Maps:
        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");
        Map<String, String> scrumTeam2 = new LinkedHashMap<>();
        scrumTeam2.put("Anton","SDET");
        scrumTeam2.put("Muhammed","Developer");
        scrumTeam2.put("Gulistan","Developer");
        scrumTeam2.put("Ahmad","PO");
        scrumTeam2.put("Nevim","SM");
        scrumTeam2.put("Atakan","SDET");
        Map<String, String> scrumTeam3 = new LinkedHashMap<>();
        scrumTeam3.put("YanChun", "BA");
        scrumTeam3.put("Tahir", "Developer");
        scrumTeam3.put("Urantuya", "SM");
        scrumTeam3.put("Veronica", "Developer");
        scrumTeam3.put("Alex", "Developer");
        scrumTeam3.put("Abdulaziz", "Developer");
        Map<String, String> scrumTeam4 = new LinkedHashMap<>();
        scrumTeam4.put("Alim", "PO");
        scrumTeam4.put("Kaiser", "SDET");
        scrumTeam4.put("Alinur","SDET");
        scrumTeam4.put("Farya","Develepor");
        scrumTeam4.put("Sherzod", "Developer");
        scrumTeam4.put("Gulsen", "SM");
        scrumTeam4.put("David","Sdet");
        Map<String, String> scrumTeam5 = new LinkedHashMap<>();
        scrumTeam5.put("Elza","SDET");
        scrumTeam5.put("Mehmet","Developer");
        scrumTeam5.put("Stefan","Developer");
        scrumTeam5.put("Rishat","PO");
        scrumTeam5.put("Ismail","SM");
        scrumTeam5.put("Tamara","SDET");
        scrumTeam5.put("Adnan","QA");

    1.1 Create a data structure that can contain all the given maps above
    1.2 Print the names of all scrum masters
    1.3 Print the names of all Developers


 */