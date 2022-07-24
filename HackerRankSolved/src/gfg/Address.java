package gfg;

public class Address {

	public static void main(String[] args) {

	}

	public String defangIPaddr(String address) {
		String res = "";
		for (int i = 0; i < address.length(); i++) {
			if (address.charAt(i) == '.') {
				res = res + '[' + address.charAt(i) + ']';
			} else {
				res = res + address.charAt(i);
			}
		}

		return res;
	}

}
