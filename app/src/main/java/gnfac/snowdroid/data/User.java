package gnfac.snowdroid.data;

public class User extends AvscienceDataObject
{
    private String name = "";
    private String email = "";
    private String last = "";
    private String first = "";
    private String phone = "";
    private String prof = "false";
    private String affil= "";
    private String share = "true";
    private String tempUnits = "C";
    private String depthUnits = "cm";
    private String elvUnits = "m";
    private String rhoUnits = "kg/cubic_m";
    private String measureFrom = "top";
    private String longType = "W";
    private String latType = "N";
    private String useSymbols="use grain type symbols";
    private String state ="MT";
    public String fractureCat="Shear Quality";
    public String hardnessScaling="linear";
    public String coordType="LATLON";
    
    public User(){super();}
    
    public User(String data)
    {
    	this();
    	popFromString(data);
	}
    
    public User(String name, String email, String last, String first, String phone, String prof, String affil, String share)
    {
    	this();
        this.name = name;
        this.email = email;
        this.last = last;
        this.first = first;
        this.phone = phone;
        this.prof = prof;
        this.affil = affil;
        this.share = share;
    }
    
    public void setAttributes()
    {
        try
        {
            data.put("share", share);
            data.put("affil", affil);
            data.put("prof", prof);
            data.put("name", name);
            data.put("email", email);
            data.put("last", last);
            data.put("first", first);
            data.put("phone", phone);
            data.put("tempUnits", tempUnits);
            data.put("depthUnits", depthUnits);
            data.put("elvUnits", elvUnits);
            data.put("rhoUnits", rhoUnits);
            data.put("measureFrom", measureFrom);
            data.put("latType", latType);
            data.put("longType", longType);
            data.put("useSymbols", useSymbols);
            data.put("state", state);
            data.put("fractureCat", fractureCat);
            data.put("hardnessScaling", hardnessScaling);
            data.put("coordType", coordType);
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
            share = (String) data.get("share");
            affil = (String) data.get("affil");
            prof = (String) data.get("prof");
            name = (String) data.get("name");
            email = (String) data.get("email");
            last = (String) data.get("last");
            first = (String) data.get("first");
            phone = (String) data.get("phone");
            tempUnits = (String) data.get("tempUnits");
            depthUnits = (String) data.get("depthUnits");
            elvUnits = (String) data.get("elvUnits");
            rhoUnits = (String) data.get("rhoUnits");
            measureFrom = (String) data.get("measureFrom");
            latType = (String) data.get("latType");
            longType = (String) data.get("longType");
            useSymbols = (String) data.get("useSymbols");
            state = (String) data.get("state");
            fractureCat=(String)data.get("fractureCat");
            hardnessScaling = (String) data.get("hardnessScaling");
            coordType = (String) data.get("coordType");
            if ( hardnessScaling==null)hardnessScaling="linear";
            if ( fractureCat==null )fractureCat="Fracture Character";
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
     }
     
    public boolean getProf()
    { 
    	if ( prof==null ) return false;
    	if (prof.equals("true")) return true;
    	else return false;
    }
    
    public boolean getShare()
    { 
    	if ( prof==null ) return true;
    	if (share.equals("true")) return true;
    	else return false;
    }
    
    public String getAffil()
    { 
    	if ( affil==null ) affil="";
    	return affil;
    }
    
    public void setFractureCategory(String cat)
    {
     	fractureCat=cat;
    }
    
    public String getFractureCategory()
    {
        return fractureCat;
    }
    
    public String getCoordType(){return coordType;}
    
    public String getName() { return name; }
    
    public String getEmail() { return email; }
    
    public String getLast() { return last; }
    
    public String getFirst() { return first; }
    
    public String getPhone() { return phone ; }
    
    public String getDepthUnits() { return depthUnits; }
    
    public String getTempUnits() { return tempUnits; }
    
    public String getElvUnits() { return elvUnits; }
    
    public String getRhoUnits() { return rhoUnits; }
    
    public String getMeasureFrom(){ return measureFrom; }
   
    public String getLatType(){ return latType; }
    
    public String getLongType(){ return longType; }
    
    public String getUseSymbolsText(){ return useSymbols;}
    
    public String getState(){ return state; }
    
    public void setState(String state)
    {
    	this.state = state;
    }
    
    public void setProf(String prof)
    {
    	this.prof = prof;
    }
    
    public void setAffil(String affil)
    {
    	this.affil = affil;
    }
    
    public void setShare(String share)
    {
    	this.share = share;
    }
    
    public void setName(String name)
    {
        this.name =name;
    }
    
    public void setEmail(String email)
    {
        this.email =email;
    }
    
    public void setFirst(String first)
    {
        this.first =first;
    }
    
    public void setLast(String last)
    {
        this.last =last;
    }
    
    public void setPhone(String phone)
    {
        this.phone =phone;
    }
    
    public boolean getUseSymbols()
    { 
        if ( useSymbols==null ) useSymbols = "use grain type symbols";
        if (useSymbols.equals("use grain type symbols")) return true;
        else return false; 
    }
    
    public void setDepthUnits(String depthUnits)
    {
        this.depthUnits = depthUnits;
    }
    
    public void setTempUnits(String tempUnits)
    {
        this.tempUnits = tempUnits;
    }
    
    public void setElvUnits(String elvUnits)
    {
        this.elvUnits = elvUnits;
    }
    
    public void setRhoUnits(String rhoUnits)
    {
        this.rhoUnits = rhoUnits;
    }
    
    public void setMeasureFrom(String measureFrom)
    {
        this.measureFrom = measureFrom;
    }
    
    public void setLatType(String latType)
    {
        this.latType = latType;
    }
    
    public void setLongType(String longType)
    {
        this.longType = longType;
    }
    
    public void setUseSymbols(String useSymbols)
    {
        this.useSymbols = useSymbols;
    }
}