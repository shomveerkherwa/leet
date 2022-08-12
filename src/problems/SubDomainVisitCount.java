package problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SubDomainVisitCount {

	public static void main(String[] args) {
		String[] cpdomains = {"9001 discuss.leetcode.com"};
		for(String s : subdomainVisits(cpdomains)) {
			System.out.println(s);
		}
	}


	public static List<String> subdomainVisits(String[] cpdomains) {
		Map<String,Integer> reference = new HashMap<String,Integer>();
		
		for(String cpDomain : cpdomains) {
			String[] countString = cpDomain.split("\\s");
			int count = Integer.parseInt(countString[0]);
			// add the main entry, hopefully input will not have same entry twice.
			String completeDomain = countString[1];
			reference.put(completeDomain, reference.getOrDefault(completeDomain, 0)+count);
			// try adding smaller domains
			String domain = countString[1];
			
			while(domain != null && domain.length() > 0) {
				//System.out.println(domain+ "->"+domain.length());
				String subdomain = domain.split("\\.")[0];
				int subLength =  subdomain.length();
				if(domain.contains(".")) {
					subLength++;
				}
				domain = domain.substring(subLength);
				if(domain.length() > 0) {
					reference.put(domain, reference.getOrDefault(domain, 0) + count);
				}
			}
		}
		
		List<String> domainVisits = reference.entrySet()
				.stream()
				.map(e -> e.getValue()+" "+e.getKey())
				.collect(Collectors.toList());
		return domainVisits;
    }
}
