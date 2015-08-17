package gnfac.snowdroid.data;

import java.util.*;

public class PitObs extends AvscienceDataObject
{
    private Location loc = new Location();
    private String aspect = "";
    private String incline = "";
    private String precip = "";
    private String sky = "";
    private String windspeed = "";
    private String winDir = "";
    private String windLoading = "";
    private String skiBoot = "ski";
    private String surfacePen = "";
    private String airTemp = "";
    private String stability = "";
    private String pitNotes = "";
    private String crownObs = "false";
    private String date="";
    private String time="";
    private String serial="";
    private String archname="";
    private String heightOfSnowpack="";
    public String skiAreaPit="false";
    public String bcPit="false";
    public String aviPit="false";
    public String aviLoc="";
    
    public java.util.Vector<Layer> layers = new java.util.Vector<Layer>();
    public java.util.Vector<ShearTestResult> shearTests = new java.util.Vector<ShearTestResult>();
    private TempProfile tempProfile = new TempProfile();
    private DensityProfile densityProfile = new DensityProfile();
    private String measureFrom = "top";
    private String currentEditLayer = "";
    private String currentEditTest = "";
    private String dateString = "";
    private String timestamp = "";
    private User user;
    public String iLayerNumber="";
    public String iDepth="";
    public String testPit="false";
    public String version = "";
    private String bld="";
    private java.util.Vector<String> activities = new java.util.Vector<String>();
    private String actsString="";
    private String edited="false";
    public PitObs() {super();}
    
    public void setAttributes()
    {
        try
        {
            data.put("loc", loc);
            data.put("aspect", aspect);
            data.put("incline", incline);
            data.put("precip", precip);
            data.put("sky", sky);
            data.put("windspeed", windspeed);
            data.put("winDir", winDir);
            data.put("windLoading", windLoading);
            data.put("skiBoot", skiBoot);
            data.put("surfacePen", surfacePen);
            data.put("airTemp", airTemp);
            data.put("stability", stability);
            data.put("pitNotes", pitNotes);
            data.put("crownObs", crownObs);
            data.put("layers", layers);
            data.put("shearTests", shearTests);
            data.put("tempProfile", tempProfile);
            data.put("densityProfile", densityProfile);
            data.put("measureFrom", measureFrom);
            data.put("currentEditLayer", currentEditLayer);
            data.put("currentEditTest", currentEditTest);
            data.put("dateString", dateString);
            data.put("user", user);
            data.put("activities", activities);
            data.put("actsString", actsString);
            data.put("date", date);
            data.put("time", time);
            data.put("timestamp", timestamp);
            data.put("edited", edited);
            data.put("serial", serial);
            data.put("archname", archname);
            data.put("testPit", testPit);
            data.put("iLayerNumber", iLayerNumber);
            data.put("iDepth", iDepth);
            data.put("version", version);
            data.put("bld", bld);
            data.put("skiAreaPit", skiAreaPit);
            data.put("bcPit", bcPit);
            data.put("aviPit", aviPit);
            data.put("aviLoc", aviLoc);
            data.put("heightOfSnowpack", heightOfSnowpack);
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
            loc = (Location)data.get("loc");
            aspect = (String) data.get("aspect");
            incline = (String) data.get("incline");
            precip = (String) data.get("precip");
            sky = (String) data.get("sky");
            windspeed = (String) data.get("windspeed");
            winDir = (String) data.get("winDir");
            windLoading = (String) data.get("windLoading");
            skiBoot = (String) data.get("skiBoot");
            surfacePen = (String)data.get("surfacePen");
            airTemp = (String) data.get("airTemp");
            stability = (String) data.get("stability");
            pitNotes = (String) data.get("pitNotes");
            crownObs = (String) data.get("crownObs");
            layers = (java.util.Vector<Layer>) data.get("layers");
            if (layers==null) layers = new java.util.Vector<Layer>();
            shearTests = (java.util.Vector<ShearTestResult>) data.get("shearTests");
            if (shearTests==null) shearTests = new java.util.Vector<ShearTestResult>();
            tempProfile = (TempProfile) data.get("tempProfile");
            densityProfile = (DensityProfile) data.get("densityProfile");
            measureFrom = (String) data.get("measureFrom");
            currentEditLayer = (String) data.get("currentEditLayer");
            currentEditTest = (String) data.get("currentEditTest");
            dateString = (String) data.get("dateString");
    	
            user = (User) data.get("user");
            activities = (Vector<String>) data.get("activities");
            if (activities==null) activities = new java.util.Vector<String>();
            actsString = (String)data.get("actsString");
            date = (String) data.get("date");
            time = (String) data.get("time");
            timestamp = (String) data.get("timestamp");
            edited = (String) data.get("edited");
            serial = (String) data.get("serial");
            archname = (String)data.get("archname");
            testPit = (String)data.get("testPit");
            bld = (String) data.get("bld");
            bcPit = (String) data.get("bcPit");
            skiAreaPit = (String) data.get("skiAreaPit");
            aviPit = (String) data.get("aviPit");
            aviLoc = (String) data.get("aviLoc");
        
            iLayerNumber = (String) data.get("iLayerNumber");
            iDepth  = (String) data.get("iDepth");
            version = (String)data.get("version");
            heightOfSnowpack = (String)data.get("heightOfSnowpack");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
    public boolean isPracticePit()
    {
    	if ( testPit==null ) return false;
    	if ( testPit.equals("true")) return true;
    	else  return false;
    }
    
    public int getBuild()
    {
    	try
    	{
    		Integer I = new Integer(bld);
    		if (I!=null) return I.intValue();
    		else return -1;
    	}
    	catch(Exception e)
    	{
    		return -1;
    	}
    }
    
    public PitObs(User user, String serial, int bld, String version)
    {
        this.user = user;
        this.serial = serial;
        this.version=version;
        this.bld=bld+"";
        Date date = new Date();
        GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
        int hour = cal.get(Calendar.HOUR);
        int min = cal.get(Calendar.MINUTE);
      
        dateString = date.getDate()+":"+hour+":"+min;
        setTimestamp(System.currentTimeMillis());
        measureFrom = user.getMeasureFrom();
    }
    
    public String getSerial()
    {
    	if (serial==null) serial = "";
    	return serial.trim();
    }
    
    public boolean getShare()
    {
    	return getUser().getShare();
    }
    
    public void setShare(boolean share)
    {
    	if (share) getUser().setShare("true");
    	else getUser().setShare("false");
    }
    
    
    public Layer getLayerByString(String s)
    {
    	s = s.trim();
    	if ( s.indexOf("PI") > 0 )
    	{
    	//	s.replaceAll("PI", " ");
    		s=s.substring(0, s.length()-2);
    	}
    	s = s.trim();
    	System.out.println("getLayerByString(): "+s);
    	
        for(java.util.Enumeration e = layers.elements(); e.hasMoreElements();)
        {
        	Layer l = (Layer) e.nextElement();
            if(l.toString().trim().equals(s))return l;
        }
        return null;
    }
    
    public PitObs(String data)
    { 
    	this();
        popFromString(data);
    	getAttributes();
    }
    
  
    
    public void setDateString(String date, String time)
    {
    	String hr = "12";
    	String mn = "00";
    	String yr = "2004";
    	String mnth = "12";
    	String day = "1";
    	if ( time.trim().length() == 3 )
    	{
    		hr = time.substring(0, 1);
    		mn = time.substring(1, 3);
    	}
    	if ( time.trim().length() > 3 )
    	{
    		hr = time.substring(0, 2);
    		mn = time.substring(2, 4);
    	}
    	
    	if ( date.trim().length() > 7 )
    	{
    		yr = date.substring(0, 4);
    		mnth = date.substring(4, 6);
    		day = date.substring(6, 8);
    	}
    	
    	dateString = mnth+"/"+day+"/"+yr+":"+hr+":"+mn;
    	
    }
    
    public void orderLayers()
    {
    	Enumeration e = getLayers();
    	while ( e.hasMoreElements() )
    	{
    		Layer l = (Layer) e.nextElement();
    		double strt = l.getStartDepth();
    		double end = l.getEndDepth();
    		if (strt > end) l.swapDepths();
    	}
    }
    
    public String getDateString()
    {
        return dateString;
    }
    
    public void setHeightOfSnowpack(String height)
    {
    	heightOfSnowpack=height;
    }
    
    public String getHeightOfSnowpack()
    {
    	return heightOfSnowpack;
    }
    
    public String getName()
    {
    	System.out.println("getName()");
    	String ds="";
    	long ts = getTimestamp();
    	System.out.println("ts: "+ts);
    	if ( ts > 0 )
    	{
    		java.util.Date date = new java.util.Date(ts);
    		if (date!=null) ds =  date.toString();
    	}
    	else
    	{
    		if ( dateString == null ) dateString = "";	
        	ds = dateString;
       	}
       	if (ds==null) ds=" ";
        String name = "";
        if ( loc!=null ) name = loc.getLocName().trim();
        else name = "";
        
        if ( ds.length() > 10) ds = ds.substring(3, 10);
        if ( name == null ) name ="";
        String nds = "";
        
        name = name + " : " + ds;
        name = name.trim();
        if ( name.length() > 26 ) name = name.substring(0, 26);
        return name;
    }
    
    public String getDBName()
    {
        if (dateString==null) dateString = " ";
        String name = null;
        if ( loc!=null ) name = loc.getName().trim();
        else name = "";
        name = name + " " + dateString;
        name = name.trim();
        if ( name.length() > 24 ) name = name.substring(0, 24);
        return name;
    }
    
    public String getArchName()
    {
    	return archname;
    }
   
    public String getAspect()
    {
    	if ( aspect==null ) aspect ="";
        return aspect;
    }
    
    public String getIncline()
    {
    	if ( incline==null ) incline="";
        return incline;
    }
    
    public String getPrecip()
    {
        return precip;
    }
    
    public String getSky()
    {
        return sky;
    }
    
    public String getWindspeed()
    {
        return windspeed;
    }
    
    public String getWinDir()
    {
        return winDir;
    }
    
    public String getWindLoading()
    {
        return windLoading;
    }
    
    public String getSkiBoot()
    {
        return skiBoot;
    }
    
    public String getSurfacePen()
    {
    	if (surfacePen==null) return "";
        return surfacePen;
    }
    
    public String getAirTemp()
    {
    	if ( airTemp==null ) airTemp="";
        return airTemp;
    }
    
    public void setArchName(String archname)
    {
    	this.archname=archname;
    }
    
    public String getStability()
    {
        return stability;
    }
    
    public String getPitNotes()
    {
    	if ( pitNotes==null ) pitNotes=" ";
        return pitNotes;
    }
    
    public DensityProfile getDensityProfile()
    {
    	return densityProfile;
    }
    
    public void setDensityProfile(DensityProfile densityProfile)
    {
    	this.densityProfile = densityProfile;
    }
    
    public void setLocation(Location loc)
    {
        this.loc = loc;
    }
    
    public Location getLocation()
    {
    	if (loc==null)loc=new Location();
        return loc;
    }
    
    public String getTime()
    {
    	if (time==null) time="";
        return time;
    }
    
    public String getDate()
    {
    	if ( date==null )
    	{
    		return new Date(getTimestamp()).toString();
    	}
        else return date;
    }
    
    public void setUser(User user)
    {
    	this.user=user;
    }
    
    public User getUser()
    {
    	if (user==null)user=new User();
    	return user;
	}
    
    public boolean getCrownObs()
    {
    	if (( crownObs == null ) || ( crownObs.trim().length() < 4 )) return false;
        else if ( crownObs.equals("true")  ) return true;
        else return false;
    }
    
    public void setCrownObs(boolean b)
    {
        if ( b ) crownObs = "true";
        else crownObs = "false";
    }
 
    public void setAspect(String aspect)
    {
        this.aspect = aspect;
    }
    
    public void setIncline(String incline)
    {
        this.incline = incline;
    }
    
    public void setPrecip(String precip)
    {
        this.precip = precip;
    }
    
    public void setSky(String sky)
    {
        this.sky = sky;
    }
    
    public void setWindSpeed(String windspeed)
    {
        this.windspeed = windspeed;
    }
    
    public void setWinDir(String winDir)
    {
        this.winDir = winDir;
    }
    
    public void setWindLoading(String windLoading)
    {
        this.windLoading = windLoading;
    }
    
    public void setSkiBoot(String skiBoot)
    {
        this.skiBoot = skiBoot;
    }
    
    public void setSurfacePen(String surfacePen)
    {
        this.surfacePen = surfacePen;
    }
    
    public void setSerial(String serial)
    {
    	this.serial=serial;
    }
    
    public void setAirTemp(String airTemp)
    {
        this.airTemp = airTemp;
    }
    
    public void setTime(String time)
    {
        this.time = time;
    }
    
    public void setDate(String date)
    {
        this.date = date;
    }
    
    public void setStability(String stability)
    {
        this.stability = stability;
    }
    
    public void setPitNotes(String pitNotes)
    {
        this.pitNotes = pitNotes;
    }
    
    public void setActivities(java.util.Vector activities)
    {
        this.activities = activities;
    }    
    
    public String getMeasureFrom()
    {
        return measureFrom;
    }
    
    public String getActivitiesString()
    {
    	StringBuffer buffer = new StringBuffer();
    	Enumeration e = getActivities().elements();
    	while ( e.hasMoreElements() )
    	{
    		buffer.append(e.nextElement());
    		buffer.append(";");
    	}
    	return buffer.toString();
    }
    
    public java.util.Vector getActivities()
    {
        return activities;
    }
    
    public boolean hasTempProfile()
    {
        if ( tempProfile == null ) return false;
        
        else return true;
    }
    
    public boolean hasDensityProfile()
    {
        if ( densityProfile == null ) return false;
        
        else return true;
    }
    
    public boolean isSkiAreaPit()
    {
    	if (skiAreaPit==null) return false;
    	if ( skiAreaPit.equals("true") ) return true;
    	else return false;
    }
    
    public boolean isBCPit()
    {
    	if (bcPit==null) return false;
    	if ( bcPit.equals("true") ) return true;
    	else return false;
    }
    
    public boolean hasLayers()
    {
    	if (layers==null) return false;
        else if ( layers.size() > 0 ) return true;
        else return false;
    }
    
    public void setTempProfile(TempProfile tempProfile)
    {
        this.tempProfile = tempProfile;
    }
    
    public TempProfile getTempProfile()
    {
        return tempProfile;
    }
    
    public String getDepthUnits()
    {
        return tempProfile.getDepthUnits();
    }
    
    public void addLayer(String data)
    {
    	Layer layer = new Layer(data);
       	layers.addElement(layer);
    }
    
    public boolean getEdited()
    {
    	if ( edited==null) return false;
    	if ( edited.trim().equals("true")) return true;
    	else return false;
    }
    
    public void setEdited()
    {
    	edited = "true";
    }
    
    public int getCurrentLayerNumber()
    {
        int num = 0;
        Enumeration e = layers.elements();
        
        while ( e.hasMoreElements() )
        {
        	Layer l = (Layer) e.nextElement();
            if ( l.getLayerNumber() > num ) num=l.getLayerNumber();
        }
       
        return num+1;
    }
    
    public void removeLayer(String layerString)
    {
        Enumeration e = layers.elements();
        
        while ( e.hasMoreElements() )
        {
        	Layer l  = (Layer) e.nextElement();
        	if (l.getLString().equals(layerString)) layers.removeElement(l);
        	if (l.toString().equals(layerString)) layers.removeElement(l);
        }
    }
    
    
    public Layer getLayer(String layerString)
    {
        Enumeration e = layers.elements();
        
        while ( e.hasMoreElements() )
        {
        	Layer l = (Layer) e.nextElement();
        	if (l.getLString().equals(layerString)) return l;
        }
        return null;
    }
    
    public Layer getCurrentEditLayer()
    {
        return getLayer(currentEditLayer);
    }
    
    public void setTimestamp(long time)
    {
    	System.out.println("setTimestamp()");
    	this.timestamp = time+"";
    	System.out.println("timestamp: "+timestamp);
    }
    
    public long getTimestamp()
    {
    	System.out.println("getTimestamp():");
    	if (timestamp==null) return 0;
    	long ts=0;
    	if ( timestamp == null ) timestamp = "";
    	else
    	{
	      	if ( timestamp.length()>0 ) 
	      	{
	      		try
	      		{
	      			ts = new Long(timestamp).longValue();
	      		}
	      		catch(Throwable t){ts=0;}
	      	}
	    }
      	if ( ts < 1 )
	      	{
		      	boolean udate = true;
		      	
		      	String dt = getDate();
		      	if (dt.trim().length()<8) udate = false;
		      	String time = getTime();
		      	if ( udate )
		      	{
		      	
			      	String yr="0";
			      	String mnth="0";
			      	String dy="0";
			      	String hr = "0";
			      	String min = "0";
			      	if (!(dt.trim().length()<8)) 
			      	{
			      		yr = dt.substring(0, 4);
			      		mnth = dt.substring(4, 6);
			      		dy = dt.substring(6, 8);
			      	}
			      	
			      	if ( !(time.trim().length()<4))
			      	{
			      		hr = time.substring(0, 2);
			      		min = time.substring(2, 4);
			      	}
			      	
			      	int y = new Integer(yr).intValue();
			      	int m = new Integer(mnth).intValue()-1;
			      	int d = new Integer(dy).intValue();
			      	int h = new Integer(hr).intValue();
			      	int mn = new Integer(min).intValue();
			      	java.util.Calendar cal = java.util.Calendar.getInstance();
			      	cal.set(y, m, d, h, mn);
			      	ts = cal.getTimeInMillis();
			     }
			     
			}
			return ts;
    }
    
    public void addShearTestResult(String data)
    {
    	ShearTestResult res = new ShearTestResult(data);
        shearTests.addElement(res);
    }
    
    public void removeShearTestResult(String resultString)
    {
    	System.out.println("remove Test: "+resultString);
    	Enumeration e = shearTests.elements();
    	while ( e.hasMoreElements())
    	{
        	ShearTestResult res = (ShearTestResult) e.nextElement();
        	if ( res.toString().equals(resultString)) shearTests.removeElement(res);
        }
    }
    
    public void updateCurrentTestResult(ShearTestResult result)
    {
        removeShearTestResult(currentEditTest);
        addShearTestResult(result.dataString());
    }
    
    public ShearTestResult getShearTestResult(String testString)
    {
        ShearTestResult r = null;
        Enumeration e = shearTests.elements();
        while ( e.hasMoreElements() )
        {
        	r = (ShearTestResult) e.nextElement();
        	String s = r.toString();
        	if ( testString.equals(s) ) 
        	{ 
        		return r;
        	}
        }
        return r;
    }
    
    public void setCurrentEditLayer(String layerString)
    {
        currentEditLayer = layerString;
    }
    
    public void setCurrentEditTest(String testString)
    {
        currentEditTest = testString;
    }
    
    public String getCurrentEditTest() { return currentEditTest; }
    
    public void updateCurrentEditLayer(Layer layer)
    {
        removeLayer(layer.getLString());
        removeLayer(layer.toString());
        addLayer(layer.dataString());
    }
    
    public Layer getCriticalLayer()
    {
    	Enumeration lys = getLayers();
    	while ( lys.hasMoreElements() )
    	{
    		Layer l = (Layer) lys.nextElement();
    		if (layerIsCritical(l)) return l;
    	}
    	return null;
    }
    
    public boolean layerIsCritical(Layer l)
    {
    	boolean critical=false;
    	
    	if ( hasProblemInterface())
    	{
    		if ( iLayerNumber.equals(l.getLayerNumberString())) critical = true;
    	}
    	
    	return critical;
    }
    
    public boolean isAviPit()
    {
    	if ( aviPit==null ) return false;
    	if (aviPit.equals("true")) return true;
    	else return false;
    }
    
    public boolean hasProblemInterface()
    {
    	if ( iLayerNumber.trim().length()>0) return true;
    	else return false;
    }
    
    public void setProblemInterface(String iDepth, String iLayerNumber)
    {
    	this.iDepth=iDepth;
    	this.iLayerNumber=iLayerNumber;
    }
    
    public String[] getLayerStrings()
    {
    	String[] layerStrings = new String[layers.size()]; 
    	Enumeration e = layers.elements();
        int i = 0;
        while ( e.hasMoreElements() )
        {
        	Layer l = (Layer) e.nextElement();
        	
        	String s  = l.toString();
        	String lNum = l.getLayerNumber()+"";
        	if ( lNum.equals(iLayerNumber)) s = s+" PI";
        	layerStrings[i] = s;
        	i++;
        }
    	return layerStrings;
    }
    
    public String[] getTestResultStrings()
    {
        Enumeration tests = shearTests.elements();
        String[] resultStrings = new String[shearTests.size()]; 
        int i = 0;
        while ( tests.hasMoreElements() )
        {
            resultStrings[i] = tests.nextElement().toString();
            i++;
        }
        return resultStrings;
    }
    
    private java.util.Vector sortAscendingLayers(java.util.Vector layers)
    {
        boolean sorted = false;
        int length = layers.size();
        int i = 0;
        Layer layer;
        Layer layerInc;

        if (length > 0)
        {
            while (!sorted)
            {
                sorted = true;
                for(i=0; i<length - 1; i++)
                {
                	layer = (Layer) layers.elementAt(i);
                	int strt = layer.getStartDepthInt();
                	int end = layer.getEndDepthInt();
                    int n = strt+end;
                    layerInc = (Layer) layers.elementAt(i+1);
                    int istrt = layerInc.getStartDepthInt();
                    int iend = layerInc.getEndDepthInt();
                    int ninc = istrt+iend;
                  
                    if ( ninc < n )
                    {
                            layers.setElementAt(layerInc, i);
                            layers.setElementAt(layer, i+1);
                            sorted = false;
                    }
                }
            }
        }
        return layers;
    }
    
    public Vector getLayersVector()
    {
    	if ( layers==null ) layers = new Vector();
    	if ( layers.size()>1 ) layers = sortAscendingLayers(layers);
        return layers;
    }
    
    public Enumeration getLayers()
    {
    	if ( layers==null ) layers = new Vector();
        return layers.elements();
    }
    
    public Enumeration getShearTests()
    {
        if ( shearTests!=null) return shearTests.elements();
        else return new Vector().elements();
    }
}