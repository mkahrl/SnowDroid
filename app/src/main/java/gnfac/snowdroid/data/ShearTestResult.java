package gnfac.snowdroid.data;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class ShearTestResult extends AvscienceDataObject
{
    public String code;
    private String score = "";
    private String quality = "";
    public String character = "";
    public String fractureCat="";
    private String sdepth = "";
    private String depthUnits= "";
    private String comments = " ";
    private String dateString = "";
    private String ctScore = "";
    private String ecScore="";
    public String numberOfTaps="";
    public String releaseType="";
    /// PST
    public String lengthOfCut="0";
    public String lengthOfColumn="0";
    
    private String s;
    private int mult=1;
    
    public ShearTestResult(String data)
    {
    	this();
    	popFromString(data);
    	setAttributes();
    }
    
    public boolean isNoFail()
    {
    	boolean is = false;
    	if ( score==null) return false;
    	if ( score.equals("SBN") || score.equals("CTN") || score.equals("RB7") || score.equals("STN") || score.equals("ECTNR")) is=true;
    	return is;
    }
    
    public void setComments(String comments)
    {
    	this.comments=comments;
    }
    
    public ShearTestResult() {super();}
    
    public ShearTestResult(String code, String score, String quality, String sdepth, String depthUnits, String comments, String ctScore, String ecScore, String fractureChar, String cat)
    {
    	if ( code.equals("PST")) this.code=code;
        else this.code = score.substring(0, 2);
        this.score = score;
        this.quality = quality;
        this.sdepth = sdepth;
        this.depthUnits = depthUnits;
        this.comments = comments;
        this.ctScore = ctScore;
        this.ecScore=ecScore;
        this.character=fractureChar;
        this.fractureCat=cat;
        
        GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		int day = cal.get(Calendar.DAY_OF_MONTH);
        int mnth = cal.get(Calendar.MONTH);
        int yr = cal.get(Calendar.YEAR);
        int hour = cal.get(Calendar.HOUR);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        
        dateString = mnth+"/"+day+"/"+yr;
        s = score + " " + quality + " " + sdepth + " " + dateString + "." + hour + ":" + min+ ":"+sec;
        if ( code.equals("PST"))  s=code+" "+s;
        
    }
    
    public String getComments()
    {
        if ( comments != null ) return comments;
        else return " ";
    }
    
	
	public double getDepthSI()
	{
		if ( isNoFail() ) return 0.0;
		double dsi = getDepthValue();
		if ( depthUnits.equals("inches") ) dsi = (dsi/2.54);
		return dsi;
	}
    
    public String getDepth()
    {
    	if ( isNoFail() ) return "0";
    	if (getDepthValueInt()<0) return "0";
    	if ( sdepth==null) sdepth="";
        return sdepth;
    }
    
    public int getDepthValueInt()
    {
    	if ( isNoFail() ) return 0;
    	return (int) (10*getDepthValue());
    }
    
    public double getDepthValue()
    {
    	if ( isNoFail() ) return 0.0;
    	try
    	{
    		return new Double(sdepth).doubleValue();
    	}
    	catch(Exception e)
    	{
    	    return 0.0;	
    	}
    	
    }
    
    public String getDepthUnits()
    {
    	if ( depthUnits==null) return "";
        return depthUnits;
    }
    
    public String getQuality()
    {
    	if ( quality==null ) quality="";
        return quality;
    }
    
    public String getReleaseType()
    {
    	if ( releaseType==null )return "";
    	return releaseType;
    }
    
    public String getScore()
    {
    	if ( score==null) score="";
        return score;
    }
    
    public void setMult(int mult)
    {
    	this.mult = mult;
    }
    
    public int getMult()
    {
    	return mult;
    }
    
    public String toString()
    {
    	return s;
    }
    
    public String getCode()
    {
    	if (code==null) code="";
        return code;
    }
    
    public String getCTScore()
    {
    	if ( ctScore==null ) ctScore="";
    	return ctScore;
    }
    
    public String getECScore()
    {
    	if ( ecScore==null ) ecScore="";
    	return ecScore;
    }
    
    public void setAttributes()
    {
        try
        {
            data.put("s", s);
            data.put("code", code);
            data.put("score", score);
            data.put("ctScore", ctScore);
            data.put("ecScore", ecScore);
            data.put("quality", quality);
            data.put("sdepth", sdepth);
            data.put("depthUnits", depthUnits);
            data.put("comments", comments);
            data.put("dateString", dateString);
            data.put("releaseType", releaseType);
            data.put("lengthOfCut", lengthOfCut);
            data.put("lengthOfColumn", lengthOfColumn);
            data.put("character", character);
            data.put("fractureCat", fractureCat);
            data.put("numberOfTaps", numberOfTaps);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
    public void getAttributes()
    {
        try
        {
            s = (String) data.get("s");
            code = (String) data.get("code");
            score = (String) data.get("score");
            ctScore = (String) data.get("ctScore");
            ecScore = (String) data.get("ecScore");
            quality = (String) data.get("quality");
            sdepth = (String) data.get("sdepth");
            depthUnits = (String) data.get("depthUnits");
            comments = (String) data.get("comments");
            dateString = (String) data.get("dateString");
            releaseType = (String) data.get("releaseType");
            if ( releaseType==null) releaseType="";
            lengthOfColumn = (String) data.get("lengthOfColumn");
            if ( lengthOfColumn==null) lengthOfColumn="";
            lengthOfCut = (String) data.get("lengthOfCut");
            if ( lengthOfCut==null) lengthOfCut="";
            character = (String) data.get("character");
            if ( character==null) character="";
            fractureCat = (String) data.get("fractureCat");
            if ( fractureCat==null) fractureCat="";
            numberOfTaps=(String)data.get("numberOfTaps");
            if (numberOfTaps==null)numberOfTaps="";
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}