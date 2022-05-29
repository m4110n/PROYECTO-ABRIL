//Anderson Esmaikel Sanchez Donis / 7490-20-13902


package net.codejava.model;
public class Student
{public static enum Grade { Aa, Bb, Cc, Dd, Ee;}
     
    private String i; private Grade ISTJ;private Grade ISFJ;private Grade ESTJ; private Grade ESFJ;private Grade ISTP;private Grade ISFP;private Grade ESTP;Grade ESFP;Grade INFJ;Grade INFP;Grade ENFP;Grade ENFJ;Grade INTJ;Grade INTP;Grade ENTP;Grade ENTJ;
    public Student(String id2, Grade ISTJ, Grade ISFJ, Grade ESTJ, Grade ESFJ, Grade ISTP, Grade ISFP, Grade ESTP,Grade ESFP, Grade INFJ, Grade INFP,Grade ENFP,Grade ENFJ,Grade INTJ,Grade INTP,Grade ENTP,Grade ENTJ) 
    
    {this.i = id2; this.ISTJ = ISTJ; this.ISFJ = ISFJ; this.ESTJ = ESTJ; this.ESFJ = ESFJ; this.ISTP = ISTP; this.ISFP = ISFP; this.ESTP = ESTP; this.ESFP = ESFP; this.INFJ = INFJ; this.INFP = INFP; this.ENFP = ENFP; this.ENFJ = ENFJ; this.INTJ = INTJ; this.INTP = INTP; this.ENTP = ENTP; this.ENTJ = ENTJ;}
    public String getId()
    {
        return i;
    }
    public void setId(String id2)
    {
        this.i = id2;
    }
    public Grade getISTJ()
    {
        return ISTJ;
    }
    public void setISTJ(Grade ISTJ)
    {
        this.ISTJ = ISTJ;
    }
    public Grade getISFJ()
    {
        return ISFJ;
    }
    public void setISFJ(Grade ISFJ)
    {
        this.ISFJ = ISFJ;
    }
     public Grade getESTJ()
    {
        return ESTJ;
    }
    public void setESTJ(Grade ESTJ)
    {
        this.ESTJ = ESTJ;
    }
    public Grade getESFJ()
    {
        return ESFJ;
    }
    public void setESFJ(Grade ESFJ)
    {
        this.ESFJ = ESFJ;
    }
     public Grade getISTP()
    {
        return ISTP;
    }
 
    public void setISTP(Grade ISTP)
    {
        this.ISTP = ISTP;
    }
     public Grade getISFP()
    {
        return ISFP;
    }
    public void setISFP(Grade ISFP)
    {
        this.ISFP = ISFP;
    }
    public Grade getESTP()
    {
        return ESTP;
    }
 
    public void setESTP(Grade ESTP)
    {
        this.ESTP = ESTP;
    }
    public Grade getESFP()
    {
        return ESFP;
    }
 
    public void setESFP(Grade ESFP)
    {
        this.ESFP = ESFP;
    }
    public Grade getINFJ()
    {
        return INFJ;
    }
 
    public void setINFJ(Grade INFJ)
    {
        this.INFJ = INFJ;
    }
    public Grade getINFP()
    {
        return INFP;
    }
 
    public void setINFP(Grade INFP)
    {
        this.INFP = INFP;
    }
      public Grade getENFP()
    {
        return ENFP;
    }
 
    public void setENFP(Grade ENFP)
    {
        this.ENFP = ENFP;
    }
    public Grade getENFJ()
    {
        return ENFJ;
    }
 
    public void setENFJ(Grade ENFJ)
    {
        this.ENFJ = ENFJ;
    }
    public Grade getINTJ()
    {
        return INTJ;
    }
 
    public void setINTJ(Grade INTJ)
    {
        this.INTJ = INTJ;
    }
    public Grade getINTP()
    {
        return INTP;
    }
 
    public void setINTP(Grade INTP)
    {
        this.INTP = INTP;
    }
    public Grade getENTP()
    {
        return ENTP;
    }
 
    public void setENTP(Grade ENTP)
    {
        this.ENTP = ENTP;
    }
     public Grade getENTJ()
    {
        return ENTJ;
    }
 
    public void setENTJ(Grade ENTJ)
    {
        this.ENTJ = ENTJ;
    }
}
