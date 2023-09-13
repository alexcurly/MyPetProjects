package javaproject

public class Member {
  private char memberType;
  private int memberID;
  private String name;
  private double fees;

  Member(char pMemberType, int pMemberID, String pName, double pFees) {
    this.MemberType = pMemberType;
    this.memberID = pMemberID;
    this.name = pName;
    this.fees = pFees;
  }

  public void setMemberType(char pMemberType) {
    memberType = pMemberType;
  }
  public char getMemberType() {
    return memberType;
  }

  public void setMemberID(int pMemberID) {
    memberID = pMemberID;
  }
  public int memberID() {
    return memberID;
  }

  public void setName(String pName) {
    name = pName;
  }
  public String getName(){
    return name;
  }
  
  public void setFees(double pFees) {
    fees = pFees;
  }
  public double getFees() {
    return fees;
  }
