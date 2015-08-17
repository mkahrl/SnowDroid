package gnfac.snowdroid.data;

public class Layer extends AvscienceDataObject
{
	private String startDepth = "";
    private String endDepth = "";
    public String hardness1 = "";// avg if one, top if 2
    public String hardness2 = "";// bottom if 2
    public String hsuffix1 = "";
    public String hsuffix2 = "";
    private String grainType = "";
    private String grainType1 = "";
    private String grainSize = "";
    private String grainSize1 = "";
    private String grainSizeUnits1 = "";
    private String grainSizeUnits2 = "";
    private String grainSuffix = "";
    private String grainSuffix1 = "";
    private String waterContent = "";
    private String density1 = "";
    private String density2 = "";
    private String multipleHardness = "false";
    private String multipleGrainSize = "false";
    private String multipleDensity = "false";
    private String multipleGrainType = "false";
    private String fromTop="false";
    private String layerNumber = "";
    private String comments = "";
    
    ///private transient StringNumConvertor conv = StringNumConvertor.getInstance();
    
    public Layer() {super();}
    
    public Layer(String data)
    {
    	this();
    	popFromString(data);
    	if ( fromTop==null ) fromTop="true";
    	
    }
    
   
    public Layer(String startDepth, String endDepth, String hardness1, String hsuffix1, String hardness2, String hsuffix2, String grainType, String grainType1, String grainSizeUnits1, String grainSizeUnits2, String grainSize, String grainSuffix, String grainSize1, String grainSuffix1, String waterContent, String density1, String density2, String comments, String layerNumber, boolean fromTop)
    {
        this.startDepth = startDepth;
        this.endDepth = endDepth;
        this.hardness1 = hardness1;
        this.hsuffix1 = hsuffix1;
        this.hardness2 = hardness2;
        this.hsuffix2 = hsuffix2;
        this.grainType = grainType;
        this.grainType1 = grainType1;
        this.grainSizeUnits1 = grainSizeUnits1;
        this.grainSizeUnits2 = grainSizeUnits2;
        this.grainSize = grainSize;
        this.grainSize1 = grainSize1;
        this.grainSuffix = grainSuffix;
        this.grainSuffix1 = grainSuffix1;
        this.waterContent = waterContent;
        this.density1 = density1;
        this.density2 = density2;
        this.comments = comments;
        this.layerNumber = layerNumber;
        if ( hardness2.trim().length() > 0 ) multipleHardness = "true";
        if ( density2.trim().length() > 0 ) multipleDensity = "true";
        if ( grainSize1.trim().length() > 0 ) multipleGrainSize = "true";
        if ( grainType1.trim().length() > 1 ) multipleGrainType = "true";
        if ( fromTop )this.fromTop="true";
        else this.fromTop="false";
    }
    
    //private String getByteString(int i){ return conv.getByteString(i); }
    
    public String getStartDepthString()
    {
    	if (startDepth==null) return "";
    	return startDepth;
    }
    
    public void setFromTop(boolean fromTop)
    {
    	if ( fromTop )this.fromTop="true";
        else this.fromTop="false";
    }
    
    public boolean getFromTop()
    {
    	if ( fromTop==null ) fromTop="true";
    	if (fromTop.equals("true")) return true;
    	else return false;
    
    }
    ////////////////////////////////////////////////////
    public double getTopDepth()
    {
    	return getEndDepth();
    }
    
    public double getBottomDepth()
    {
    	return getStartDepth();
    }
    
    public String getHardnessTop()
    {
    	if (getFromTop()) return getHardness2();
    	else return getHardness1();
    }
    
    public String getHSuffixTop()
    {
    	if (getFromTop()) return getHSuffix2();
    	else return getHSuffix1();
    }
    
    public String getGrainSizeTop()
    {
    	return getGrainSize1();
    }
    
 	public String getGrainSuffixTop()
 	{
 		return getGrainSuffix();
 	}
 	
 	public String getGrainUnitsTop()
 	{
 		return getGrainUnits1();
 	}
 	
 	public String getGrainTypeTop()
 	{
 		return getGrainType1();
 	}
 	
 	public String getDensityTop()
 	{
 		return getDensity1();
 	}
    //////////////////////////////////////////////////////////
    
    
    public String getHardnessBottom()
    {
    	if (getFromTop()) return getHardness1();
    	else return getHardness2();
    }
    
    public String getHSuffixBottom()
    {
    	if (getFromTop()) return getHSuffix1();
    	else return getHSuffix2();
    }
    
    public String getGrainSizeBottom()
    {
    	return getGrainSize2();
    }
    
 	public String getGrainSuffixBottom()
 	{
 		return getGrainSuffix1();
 	}
 	
 	public String getGrainUnitsBottom()
 	{
 		return getGrainUnits2();
 	}
 	
 	public String getGrainTypeBottom()
 	{
 		return getGrainType2();
 	}
 	
 	public String getDensityBottom()
 	{
 		return getDensity2();
 	}
 	
 	
 	public void swapHardness()
 	{
 		String h1 = hardness1;
 		String h2 = hardness2;
 		hardness1 = h2;
 		hardness2 = h1;
 		String hsf1 = hsuffix1;
 		String hsf2 = hsuffix2;
 		hsuffix1=hsf2;
 		hsuffix2=hsf1;
 	}
 	//////////////////////////////////////////////
    public String getEndDepthString()
    {
    	if (endDepth==null) return "";
    	return endDepth;
    }
    
    public double getStartDepth()
    {
    	if ( startDepth == null ) return 0;
    	if ( startDepth.equals("null")) return 0;
    	if ( startDepth.trim().length()<1) return 0;
    	return new Double(startDepth).doubleValue();
    }
    
    public String getLayerNumberString()
    {
    	return layerNumber;
    }
    
    public int getLayerNumber()
    {
    	if (layerNumber==null) return 0;
        int ln = new Integer(layerNumber).intValue();
        if ( ln < 1 ) ln = 1;
        return ln;
    }
    
    public double getEndDepth()
    {
    	if ( endDepth == null ) return 0;
    	if ( endDepth.equals("null")) return 0;
    	if ( endDepth.trim().length()<1) return 0;
    	return new Double(endDepth).doubleValue();
    }
    
    public double getThickness()
    {
    	double thck=getStartDepth()-getEndDepth();
    	if ( thck<0 ) thck=-thck;
    	return thck;
    }
    
    public int getStartDepthInt()
    {
    	if ( startDepth == null ) return 0;
    	if ( startDepth.equals("null")) return 0;
    	try
    	{
    		return (int) (new Double(startDepth).doubleValue()*10);
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.toString());
    		return 0;
    	}
    	
    }
    
    public int getEndDepthInt()
    {
    	System.out.println("end depth: "+endDepth);
    	if ( endDepth == null ) return 0;
    	if ( endDepth.equals("null")) return 0;
    	try
    	{
    		return (int) (new Double(endDepth).doubleValue()*10);
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.toString());
    		return 0;
    	}
    }
    	
    
    public String getComments()
	{
		if ( comments==null) comments= "";
        return comments;
    }
    
    public void setComments(String comments)
    {
        this.comments = comments;
    }
    
    public void swapDepths()
    {
    	swapParams(startDepth, endDepth);
    	swapParams(density1, density2);
    	swapParams(grainSize, grainSize1);
    	swapParams(grainSizeUnits1, grainSizeUnits2);
    	swapParams(grainSuffix, grainSuffix1);
    	swapParams(grainType, grainType1);
    	swapParams(hardness1, hardness2);
    	swapParams(hsuffix1, hsuffix2);
    }
    
    private void swapParams(String p1, String p2)
    {
    	String s = p1;
    	String ss = p2;
    	p1=ss;
    	p2=s;
    }
    
    public String shortString()
    {
    	return startDepth+"-"+endDepth;
    }
    
    
    public String toString()
    {
    	if ( ( layerNumber==null)) layerNumber="";
        return layerNumber+": "+startDepth+"-"+endDepth;
       //return startDepth+"-"+endDepth;
    }
    
    public String getHardness1()
    {
    	if (hardness1==null) hardness1="";
        return hardness1;
    }
    
    public String getLString()
    {
    	if (layerNumber==null) layerNumber="";
    	return layerNumber;
    }
    
    public String getHardness2()
    {
    	if (hardness2==null) hardness2="";
        return hardness2;
    }
    
    public String getGrainType1()
    {
    	if ( grainType==null ) grainType="";
        return grainType;
    }
    
    public String getGrainType2()
    {
    	if ( grainType1==null ) grainType1="";
        return grainType1;
    }
    
    public String getGrainSize1()
    {
    	if ( grainSize==null ) grainSize="";
        return grainSize;
    }
    
    public String getGrainSizeUnits1()
    {
    	if ( grainSizeUnits1==null ) grainSizeUnits1="";
        return grainSizeUnits1;
    }
    
    public String getGrainSizeUnits2()
    {
    	if ( grainSizeUnits2==null ) grainSizeUnits2="";
        return grainSizeUnits2;
    }
    
    public String getGrainSize2()
    {
    	if ( grainSize1==null ) grainSize1="";
        return grainSize1;
    }
    
    public String getGrainUnits1()
    {
    	if ( grainSizeUnits1==null ) grainSizeUnits1="";
        return grainSizeUnits1;
    }
    
    public String getGrainUnits2()
    {
    	if ( grainSizeUnits2==null ) grainSizeUnits2="";
        return grainSizeUnits2;
    }
    
    public String getWaterContent()
    {
    	if ( waterContent==null ) waterContent="";
        return waterContent;
    }
    
    public String getHSuffix1()
    {
    	if ( hsuffix1==null ) hsuffix1="";
        return hsuffix1;
    }
    
    public String getGrainSuffix()
    {
    	if ( grainSuffix==null ) grainSuffix="";
        return grainSuffix;
    }
    
    public String getGrainSuffix1()
    {
    	if ( grainSuffix1==null ) grainSuffix1="";
        return grainSuffix1;
    }
    
    public void setGrainSuffix(String suffix)
    {
        grainSuffix = suffix;
    }
    
    public String getHSuffix2()
    {
    	if ( hsuffix2==null ) hsuffix2="";
        return hsuffix2;
    }
    
    public String getMultipleHardness()
    {
        return multipleHardness;
    }
    
    public String getMultipleGrainType()
    {
        return multipleGrainType;
    }
    
    public String getMultipleGrainSize()
    {
        //return multipleGrainSize;
        if ( grainSize1==null) grainSize1="";
        if ( grainSize1.trim().length() > 1 ) return "true";
        else return "false";
    }
    
    public String getDensity()
    {
    	String d1 = getDensity1();
    	String d2 = getDensity2();
    	if (d1.trim().length()>1) return d1;
    	if (d2.trim().length()>1) return d2;
    	return d1;
    }
    
    public String getDensity1()
    {
    	if ( density1==null ) density1="";
    	return density1;
	}
	
	public String getDensity2()
    {
    	if ( density2==null ) density2="";
    	return density2;
	}
	
	public String getMultipleDensity()
	{ 
		if (multipleDensity==null) multipleDensity="";
		return multipleDensity;
	}
    
    public void setMultipleHardness(String code)
    {
        multipleHardness = code;
    }
    
    public void setMultipleGrainSize(String code)
    {
        multipleGrainSize = code;
    }
    
    public void setMultipleDensity(String code)
    {
        multipleDensity = code;
    }
    
    public void setGrainType1(String type)
    {
        grainType = type;
    }
    public void setGrainType2(String type)
    {
        grainType1 = type;
    }
    ////////////////////////////////////
    /// to support CAAML in mm
    ////////////////////////////////////////
    
    public String getGrainSizeMin()
    {
    	String s="0";
    	double gs1=0;
    	double gs2=0;
    	
    	try
    	{
    		gs1 = new Double(grainSize).doubleValue();
    	}
    	catch(Exception e)
    	{
    		gs1=0;
    	}
    	
    	try
    	{
    		gs2 = new Double(grainSize1).doubleValue();
    	}
    	catch(Exception e)
    	{
    		gs2=0;
    	}
    	
    	
    	if (grainSizeUnits1!=null)if (grainSizeUnits1.equals("cm")) gs1=10*gs1;
    	if (grainSizeUnits2!=null) if (grainSizeUnits2.equals("cm")) gs2=10*gs2;
    	
    	if ( gs1 < gs2 ) s=gs1+"";
    	else s=gs2+"";
    	if (s.equals("0")) s="";
    	return s;
    }
    
    public String getGrainSizeMax()
    {
       	String s="0";
    	double gs1=0;
    	double gs2=0;
    	
    	try
    	{
    		gs1 = new Double(grainSize).doubleValue();
    	}
    	catch(Exception e)
    	{
    		gs1=0;
    	}
    	
    	try
    	{
    		gs2 = new Double(grainSize1).doubleValue();
    	}
    	catch(Exception e)
    	{
    		gs2=0;
    	}
    	
    	
    	if (grainSizeUnits1!=null) if (grainSizeUnits1.equals("cm")) gs1=10*gs1;
    	if (grainSizeUnits2!=null) if (grainSizeUnits2.equals("cm")) gs2=10*gs2;
    	
    	if ( gs1 > gs2 ) s=gs1+"";
    	else s=gs2+"";
    	if (s.equals("0")) s="";
    	return s;
    }
    
    public String getAvgGrainSize()
    {
    	String s="0";
    	double gs1 = 0;
    	double gs2 = 0;
    	try
    	{
    		gs1 = new Double(grainSize).doubleValue();
    	}
    	catch(Exception e)
    	{
    		gs1=0;
    	}
    	
    	try
    	{
    		gs2 = new Double(grainSize1).doubleValue();
    	}
    	catch(Exception e)
    	{
    		gs2=0;
    	}
    		
    	
    	if (grainSizeUnits1!=null) if (grainSizeUnits1.equals("cm")) gs1=10*gs1;
    	if (grainSizeUnits2!=null) if (grainSizeUnits2.equals("cm")) gs2=10*gs2;
    	double gs=0;
    	
    	if (gs1==0) return gs2+"";
    	if (gs2==0) return gs1+"";
    	
    	gs = (gs1+gs2)/2.0;
    	return gs+"";
    }
    
    
    
    public void setAttributes()
    {
        try
        {
            data.put("startDepth", startDepth);
            data.put("endDepth", endDepth);
            data.put("hardness1", hardness1);
            data.put("hardness2", hardness2);
            data.put("hsuffix1", hsuffix1);
            data.put("hsuffix2", hsuffix2);
            data.put("grainType", grainType);
            data.put("grainType1", grainType1);
            data.put("grainSize", grainSize);
            data.put("grainSize1", grainSize1);
            data.put("grainSizeUnits1", grainSizeUnits1);
            data.put("grainSizeUnits2", grainSizeUnits2);
            data.put("grainSuffix", grainSuffix);
            data.put("grainSuffix1", grainSuffix1);
            data.put("waterContent", waterContent);
            data.put("density1", density1);
            data.put("density2", density2);
            data.put("multipleHardness", multipleHardness);
            data.put("multipleGrainSize", multipleGrainSize);
            data.put("multipleDensity", multipleDensity);
            data.put("multipleGrainType", multipleGrainType);
            data.put("comments", comments);
            data.put("layerNumber", layerNumber);
            data.put("fromTop", fromTop);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
      /*  if ( hardness2.trim().length() > 0 ) multipleHardness = "true";
        if ( density2.trim().length() > 0 ) multipleDensity = "true";
        if ( grainSize1.trim().length() > 0 ) multipleGrainSize = "true";
        if ( grainType1.trim().length() > 1 ) multipleGrainType = "true";*/
    }
    
    public void getAttributes()
    {
    	///System.out.println("getAttributes()");
        try
        {
            startDepth = (String) data.get("startDepth");
            endDepth = (String) data.get("endDepth");
            hardness1 = (String) data.get("hardness1");
            hardness2 = (String) data.get("hardness2");
            hsuffix1 = (String) data.get("hsuffix1");
            hsuffix2 = (String) data.get("hsuffix2");
            grainType = (String) data.get("grainType");
           // System.out.println("grainType "+grainType);
            grainType1 = (String) data.get("grainType1");
            //System.out.println("grainType1 "+grainType1);
            grainSize = (String) data.get("grainSize");
            grainSize1 = (String) data.get("grainSize1");
            grainSizeUnits1 = (String) data.get("grainSizeUnits1");
            grainSizeUnits2 = (String) data.get("grainSizeUnits2");
            grainSuffix = (String) data.get("grainSuffix");
            grainSuffix1 = (String) data.get("grainSuffix1");
            waterContent = (String) data.get("waterContent");
            density1 = (String) data.get("density1");
            density2 = (String) data.get("density2");
            multipleHardness = (String) data.get("multipleHardness");
            multipleGrainSize = (String) data.get("multipleGrainSize");
            multipleDensity = (String) data.get("multipleDensity");
            multipleGrainType = (String) data.get("multipleGrainType");
            comments = (String) data.get("comments");
            layerNumber = (String) data.get("layerNumber");
            fromTop = (String) data.get("fromTop");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        if ((startDepth==null) && (endDepth==null))
        {
        	startDepth="";
        	endDepth="";
        }
        if (startDepth==null)startDepth=endDepth;
        if (endDepth==null)endDepth=startDepth;
    }
}