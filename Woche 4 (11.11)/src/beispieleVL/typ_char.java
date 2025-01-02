package beispieleVL;

public class typ_char {

	public static void main(String[] args) {

		char ch1 = 'A', ch2;

		ch2 = ch1;
		ch2++;

		int i = ch2;
		ch2 = (char) (i + 1);
		i = ch2 - ch1;

		System.out.println(i);

	}

}
