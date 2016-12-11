/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

/**
 *
 * @author RMLOY_000
 */
class AdulthoodMissionMenu extends View {

    public AdulthoodMissionMenu() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Adulthood Mission Menu               |"
                + "\n----------------------------------------"
                + "\nA - Apartment"
                + "\nI - Investigator’s house"
                + "\nM - Member's house"
                + "\nQ - Quit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison

        switch (choice) {
            case "A": // Adulthood apartment Scenario
                this.displayAdulthoodApartmentScenario();
                break;
            case "I": // Adulthood Investigador House Scenario 
                this.displayAdulthoodInvestigadorHouseScenario();
                break;
            case "M": // Adulthood member House Scenario
                this.displayAdulthoodMembershouseScenario();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayAdulthoodApartmentScenario() {
        AdulthoodApartmentScenario apartmentScenario = new AdulthoodApartmentScenario();
        apartmentScenario.display();
    }

    private void displayAdulthoodInvestigadorHouseScenario() {
        AdulthoodInvestigadorHouseScenario chuchPriesthood = new AdulthoodInvestigadorHouseScenario();
        chuchPriesthood.display();

    }

    private void displayAdulthoodMembershouseScenario (){
        AdulthoodMembershouseScenario membersHouse = new AdulthoodMembershouseScenario();
        membersHouse.display();
 
    }

}
