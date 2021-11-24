public class LameDb {

	public static void main(String[] args) {
		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "3", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

	}

	public static String lameDb(String db, String op, String id, String data) {
		String result = "";
		String dataBase[] = db.split("#");

		switch (op) {
		case "add":
			result = db + "#" + id + data;
			break;

		case "edit":
			if (dataBase[0].contains(id)) {
				dataBase[0] = id.concat(data);
			} else if (dataBase[1].contains(id)) {
				dataBase[1] = id.concat(data);
			} else if (dataBase[2].contains(id)) {
				dataBase[2] = id.concat(data);
			}
			result = dataBase[0].concat("#").concat(dataBase[1].concat("#")).concat(dataBase[2]);
			break;
		case "delete":
			if (dataBase[0].contains(id)) {
				dataBase[0] = "";
			} else if (dataBase[1].contains(id)) {
				dataBase[1] = "";
			} else if (dataBase[2].contains(id)) {
				dataBase[2] = "";
			}
			result = dataBase[0].concat("#").concat(dataBase[1].concat("#")).concat(dataBase[2]);
			break;
		case "none":

			result = db;
			break;
		}
		return result;
	}// end lameDb
}
