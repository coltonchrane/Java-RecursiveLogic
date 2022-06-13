import java.util.*;
public class SubsetGenerator {
	 private Set<String> subsets;

	    public SubsetGenerator() {
	        this.subsets = new HashSet<String>();
	    }

	    public void printAllSubsets() {
	        for (String subset : this.subsets) {
	            System.out.println(subset);
	        }
	    }

	    public void generate(String text) {
	        for (int i = 0; i < text.length(); i++) {
	            String currentText = text.substring(i);
	            this.subsets.add(currentText);

	            String currentLetter = currentText.substring(0, 1);
	            this.subsets.add(currentLetter);

	            int currentLength = currentText.length();
	            this.generate(currentText, currentLength);
	        }

	        this.subsets.add("\"\"");
	    }

	    public void generate(String text, int length) {
	        for (int i = length - 1; i > 0; i--) {
	            if (length <= 2) {
	                this.subsets.add(text);
	                return;
	            }

	            String currentText = "";
	            int currentLength = 0;
	            if (length == i + 1) {
	                currentText = text.substring(0, i);
	                currentLength = currentText.length();
	                this.subsets.add(currentText);
	            } else {
	                currentText = text.substring(0, i) + text.substring(i + 1);
	                currentLength = currentText.length();
	                this.subsets.add(currentText);
	            }

	            generate(currentText, currentLength);
	        }
	    }
}
