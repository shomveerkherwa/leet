package problems;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {

	public static void main(String[] args) {
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com","gg@g.edu"};
		int unique = numUniqueEmails(emails);
		System.out.println("There are "+unique+" emails");
	}

	public static int numUniqueEmails(String[] emails) {
		Set<String> uniqueEmails = new HashSet<String>();
		for(String inp : emails) {
			String[] splitInp = inp.split("@");
			if(splitInp.length > 1) {
				String local = splitInp[0];
				String domain = splitInp[1];
				//check valid domain
				//1. should end with .com 
				if(!domain.endsWith(".com")) {
					continue;
				}
				
				// sanitize local names
				String[] localSplit = local.split("[+]");
				local = localSplit[0].replaceAll("[^a-zA-Z0-9]", "");
				inp = local+"@"+domain;
				System.out.println(inp);
				uniqueEmails.add(inp);
			}
		}
		return uniqueEmails.size();   
    }
}
