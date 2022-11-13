package day9_controlFlowStatement_Part3;

public class Task37_LaptopModels {

	public static void main(String[] args) {

		String models = "dell";

		switch (models) {
		case "apple":
			System.out.println("apple-no virus");
			break;
		case "dell":
			System.out.println("tough one");
			break;
		case "acer":
			System.out.println("not recomended");
			break;
		default:
			System.out.println("do not buy that model");

		}

	}

}
