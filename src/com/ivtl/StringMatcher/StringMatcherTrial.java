package com.ivtl.StringMatcher;

import java.util.ArrayList;

public class StringMatcherTrial {

	public static void main(String args[]) {
		String actualString = "astgeo";
		String findString = "geo";

		splitByMatchingIndexes(actualString, findString);
	}

	/**
	 * @param actualString
	 * @param findString
	 */
	public static void splitByMatchingIndexes(String actualString,
			String findString) {

		int lengthOfActualStr = actualString.length();
		int lengthOfFindStr = findString.length();
		ArrayList<StartEndMatch> indexLst = new ArrayList<>();

		for (int i = 0; i < lengthOfActualStr; i++) {
			if (actualString.charAt(i) == findString.charAt(0)) {
				if (containsMatchString(actualString, findString, i,
						lengthOfFindStr)) {
					System.out.println(i + "---" + (i + lengthOfFindStr - 1));
					StartEndMatch stEdMatch = new StartEndMatch();
					stEdMatch.setStIdx(i);
					stEdMatch.setEdIdx(i + lengthOfFindStr);
					indexLst.add(stEdMatch);
				}
			}
		}

		ArrayList<StringMatcher> strMatcher = getMatchedAndUnmatched(indexLst,
				actualString);
		for (StringMatcher stmat : strMatcher) {
			System.out.println(stmat.isMatch() + " ----- " + stmat.getString());
		}
	}

	/**
	 * @param matchIdx
	 * @param findStrLen
	 * @param fndStrArr
	 * @param actualString
	 * @return
	 */
	private static boolean containsMatchString(String actualString,
			String findString, int matchIdx, int findStrLen) {
		boolean isMatch = true;

		for (int i = 0; i < findStrLen; i++) {
			if (isMatch) {
				if (actualString.charAt(matchIdx) == findString.charAt(i)) {
					actualString.charAt(matchIdx);
				} else {
					isMatch = false;
				}
				if (matchIdx != actualString.length()) {
					matchIdx++;
				}
			} else {
				break;
			}
		}
		return isMatch;
	}

	private static ArrayList<StringMatcher> getMatchedAndUnmatched(
			ArrayList<StartEndMatch> indexAl, String actualStr) {
		ArrayList<StringMatcher> strMatcherArraylist = new ArrayList<>();
		
		for (int i = 0; i < indexAl.size(); i++) {
			
			// first index lo unte
			if (indexAl.get(i).getStIdx() == 0) {
				StringMatcher strmat = new StringMatcher();
				strmat.setString(actualStr.substring(indexAl.get(i).getStIdx(), indexAl.get(i)
						.getEdIdx()));
				strmat.setMatch(true);
				strMatcherArraylist.add(strmat);
			}
			else {
				if(i==0){
					StringMatcher strmat = new StringMatcher();
					strmat.setString(actualStr.substring(0,
							indexAl.get(i).getStIdx()));
					strmat.setMatch(false);
					strMatcherArraylist.add(strmat);
					
					StringMatcher strmat1 = new StringMatcher();
					strmat1.setString(actualStr.substring(indexAl.get(i).getStIdx(),
							indexAl.get(i).getEdIdx()));
					strmat1.setMatch(true);
					strMatcherArraylist.add(strmat1);
				}
				else{
					if (indexAl.get(i - 1).getEdIdx()
							- (indexAl.get(i).getStIdx() - 1) == 0) {
						StringMatcher strmat = new StringMatcher();
						strmat.setString(actualStr.substring(indexAl.get(i).getStIdx(),
								indexAl.get(i).getEdIdx()));
						strmat.setMatch(true);
						strMatcherArraylist.add(strmat);
					} else {
						
						StringMatcher strmat = new StringMatcher();
						strmat.setString(actualStr.substring(indexAl.get(i - 1).getEdIdx(), indexAl
								.get(i).getStIdx()));
						strmat.setMatch(false);
						if(!strmat.getString().isEmpty()){
							strMatcherArraylist.add(strmat);	
						}
						
						StringMatcher strmat1 = new StringMatcher();
						strmat1.setString(actualStr.substring(indexAl.get(i).getStIdx(),
								indexAl.get(i).getEdIdx()));
						strmat1.setMatch(true);
						strMatcherArraylist.add(strmat1);
						
						if (i == indexAl.size()-1) {
							StringMatcher strmat2 = new StringMatcher();
							if(indexAl.get(i).getEdIdx()!=actualStr.length()){
								strmat2.setString(actualStr.substring(indexAl.get(i).getEdIdx(),actualStr.length()));
								strmat2.setMatch(false);
								strMatcherArraylist.add(strmat2);
							}
						}
					}
				}
				
			}

		}

		return strMatcherArraylist;
	}

	/**
	 * @param stIdx
	 * @param edIdx
	 * @param str
	 * @return
	 */
	public static String[] splitStringByStartIdxEndIdx(int stIdx, int edIdx,
			String str) {

		String[] splitString = new String[3];

		if (str != null) {
			splitString[0] = new String();
			if (stIdx == 0) {
				splitString[0] = null;
			} else {
				splitString[0] = str.substring(0, stIdx);
			}

			splitString[1] = new String();
			splitString[1] = str.substring(stIdx, edIdx);

			splitString[2] = new String();
			if (edIdx == str.length()) {
				splitString[2] = null;
			} else {
				splitString[2] = str.substring(edIdx);
			}

		}
		return splitString;
	}

}

class StringMatcher {

	private String string;
	private boolean isMatch;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public boolean isMatch() {
		return isMatch;
	}

	public void setMatch(boolean isMatch) {
		this.isMatch = isMatch;
	}
}

class StartEndMatch {
	private int stIdx;
	private int edIdx;

	public int getStIdx() {
		return stIdx;
	}

	public void setStIdx(int stIdx) {
		this.stIdx = stIdx;
	}

	public int getEdIdx() {
		return edIdx;
	}

	public void setEdIdx(int edIdx) {
		this.edIdx = edIdx;
	}

}
