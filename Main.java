// PARTNER NAME: Marquez Ramirez
// PARTNER NAME:
// CS111 SECTION #: 3033
// DATE:  02/01/2025

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surname; 
		String givenName;
		String uscisNum;
		String catagory;
		String cardNum;
		String countryOfBirth;
		String termsConditions;
		String birthMonth;
		String sex;
		int birthDay;
		int birthYear;
		int validDay;
		int validMonth;
		int validYear;
		int expirationDay;
		int expirationMonth;
		int expirationYear;
		//INPUT SECTION
		surname = "SPECIMEN";
		givenName = "TEST V";
		uscisNum = "000-000-725";
		catagory = "C09";
		cardNum = "SRC0000000725";
		countryOfBirth = "Ethiopia";
		termsConditions = "None";
		birthMonth = "JAN";
		sex = "M";
		birthDay = 1;
		birthYear = 1920;
		validDay = 1;
		validMonth = 1;
		validYear = 80;
		expirationDay = 5;
		expirationMonth = 10;
		expirationYear = 11;



		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       " + surname + " ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    " + givenName + " ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          "+ uscisNum + "    "+ catagory + "        "+ cardNum + "");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      "+ countryOfBirth + " ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       "+ termsConditions + " ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         "+ birthDay + " " +  birthMonth + " " + birthYear + "     "+ sex +"");
		System.out.println("║                       Valid From:     "+ validDay + "/"+ validMonth + "/"+ validYear + "");
		System.out.println("║                       Card Expires:   "+ expirationDay + "/"+ expirationMonth + "/"+ expirationYear + "");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}