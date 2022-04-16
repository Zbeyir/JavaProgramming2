package practice.day_39Practice.statesTask;

public class States {

    public String name, abbreviation , politicalParty, Governor, senator;
    public int population;
    public double stateTax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            System.err.println("Invalid name " + name );
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.isEmpty()){
            System.err.println("Invalid abbreviation " + abbreviation );
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.isEmpty()){
            System.err.println("Invalid politicalParty " + politicalParty );
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if (governor == null || governor.isEmpty()){
            System.err.println("Invalid governor " + governor );
            System.exit(1);
        }
       this.Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator == null || senator.isEmpty()){
            System.err.println("Invalid senator " + senator );
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0){
            System.err.println("Invalid population " + population);
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax <= 0 ){
            System.err.println("Invalid state tax " + stateTax );
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        setAbbreviation(abbreviation);
        setGovernor(governor);
        setName(name);
        setPopulation(population);
        setStateTax(stateTax);
        setSenator(senator);
        setPoliticalParty(politicalParty);

    }

    @Override
    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }

}

/*
States Task:
	1. Create a class named States:
			variables:
				name, abbreviation, politicalParty, Governor, senator, population, stateTax

			Encapsulate all the fields

			Add a constructor that can set all the fields

						Conditions:
							1. name, abbreviation, politicalParty, Governor, and senator can not be null
							2. name, abbreviation, politicalParty, Governor, and senator can not be empty
							3. taxRate can not be negative
							4. Population can not be set to zero or negative

			Methods:
				toString()

 */
