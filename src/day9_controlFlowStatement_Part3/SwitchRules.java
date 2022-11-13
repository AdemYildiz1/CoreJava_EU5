package day9_controlFlowStatement_Part3;

public class SwitchRules {

	public static void main(String[] args) {

		final String lastName = "Smith";
		String firstName = "Mike";
		int id = 0;

		switch (firstName) {
		case "test":
			System.out.println("test");
			break;
		case lastName:  // if your string is not final it gives error BECAUSE;
						// RULES says; if you create a variable and you want to use that variable in the
						// case statements that variable must be final variable.
			            //so our case statement value must be final constant.
			id = 5;
			break;

		}

	}

}
