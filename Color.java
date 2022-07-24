import java.io.IOException;

public class Color {

	public static void main(String[] args) throws IOException {
		char ch;
		ch=(char)System.in.read();
		switch(ch)
		{
		case 'r':
		System.out.println("red");
		break;
		case 'b':
		System.out.println("blue");
		break;
		case 'g':
		System.out.println("green");
		break;
		case 'o':
		System.out.println("orange");
		break;
		default:
		System.out.println("invalid code");
		break;
		}

	}

}
