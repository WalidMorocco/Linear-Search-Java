package mypackage;

public class Search {

	String[][] data = {
//			 Key      Name			 Age     E-Mail
			{"K0", "Abby Linc",		"18", "al@ch.org"},
			{"K1", "John Doe",		"23", "jd@abc.com"},
			{"K2", "Janet Basco",		"39", "jb@ids.com"},
			{"K3", "Charles River",		"64", "cr@neit.edu"},
			{"K4", "Barack Obama",		"50", "bo@democrat.gov"},
			{"K5", "Sarah Palin",		"44", "sp@republican.gov"},
			{"K6", "John McCain",		"72", "jm@it.com"},
			{"K7", "George Bush",		"54", "gb@white.com"},
			{"K8", "Al Gore",		"56", "ag@vp.edu"},
			{"K9", "Dick Cheney",		"60", "dc@bvp.gov"},
	};
	
	public int sequential(String keyToSearch) {
		long start, stop, elapsed;
		start = System.currentTimeMillis();
        System.out.println("Searching for " + keyToSearch + " using sequential method.");
        int index = -1;
        for (int i = 0; (i < data.length && index == -1); i++) {
            System.out.println("Read " + i + ", key= " + data[i][0]);
            if (keyToSearch.equalsIgnoreCase(data[i][0]))
            	index = i;
        }

        System.out.println("Key " + keyToSearch + " is found at index " + index);
        System.out.println("after " + (index + 1) + " reads.");

        stop = System.currentTimeMillis();
		elapsed = stop - start;
		System.out.println("\n Timer data: \n");
		System.out.println("Elapsed: " + elapsed);
		System.out.println("Start Time: " + start);
		System.out.println("Stop Time: " + stop);
		
        return index;

    }
	
	public String displayRecord(int index) {
		return "Record = "
				+ data[index][0]
				+ ", "
				+ data[index][1]
				+ ", "
				+ data[index][2]
				+ ", "
				+ data[index][3];
	}

	public static void main(String[] args) {
		
		Search search = new Search();
		int rowItWasFound = search.sequential("K9");
		search.displayRecord(rowItWasFound);

	}

}
