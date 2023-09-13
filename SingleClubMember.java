package javaproject;

public class SingleClubMember extends Member {
  
  private int club;

  singleClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pClub) {
    super(memberType, memberID, name, fees);
    club = pClub;
  }

  public void setClub(int pClub) {
    club = pClub;
  }
  public int getClub() {
    return club;
  }

  @Override
  public String toString()
  {
    return "\"" + memberType + ", " 
      + memberID + ", " 
      + name + ", " 
      + fees + ", " 
      + "\""
  }
}
