package gnfac.snowdroid.data;

public class AvOccurence extends AvscienceDataObject
{
    private String pitObs = "";
    private String estDate = "";
    private String estTime = "";
    private String elvStart = "";
    private String elvDeposit = "";
    private String aspect = "";
    private String aspect1 = "";
    private String aspect2 = "";
    private String type = "";
    private String wcStart = "";
    private String wcDeposit = "";
    private String triggerType = "";
    private String triggerCode = "";
    private String USSize = "";
    private String CASize = "";
    private String avgFractureDepth = "";
    private String maxFractureDepth = "";
    private String levelOfBedSurface = "";
    private String weakLayerType = "";
    private String weakLayerHardness = "";
    private String hardnessAbove = "";
    private String hardnessBelow = "";
    private String hsuffix = "";
    private String hsuffixAbove = "";
    private String hsuffixBelow = "";
    private String crystalTypeAbove = "";
    private String crystalTypeBelow = "";
    private String crystalSizeAbove = "";
    private String crystalSize = "";
    private String crystalSizeBelow = "";
    private String sizeSuffixAbove = "";
    private String sizeSuffixBelow = "";
    private String sizeSuffix = "";
    private String snowPackType = "";
    private String fractureWidth = "";
    private String fractureLength = "";
    private String lengthOfAvalanche = "";
    private String avgStartAngle = "";
    private String maxStartAngle = "";
    private String minStartAngle = "";
    private String alphaAngle = "";
    private String depthOfDeposit = "";
    private String lengthOfDeposit = "";
    private String widthOfDeposit = "";
    private String areaOfDeposit = "";
    private String densityOfDeposit = "";
    private String numPeopleCaught = "";
    private String numPeoplePartBuried = "";
    private String numPeopleTotalBuried = "";
    private String injury = "";
    private String fatality = "";
    private String estDamage = "";
    private String bldgDmg = "";
    private String eqDmg = "";
    private String vehDmg = "";
    private String miscDmg = "";
    private String totDmg = "";
    private String comments = "";
    private String causeOfRelease = "";
    private String sympathetic = "";
    private String sympDistance = "";
    private String serial = "";
    private String archname="";
    private String hasPit = "true";
    private String edited = "false";
    
    public void setAttributes()
    {
        try
        {
            data.put("pitObs", pitObs);
            data.put("estDate", estDate);
            data.put("estTime", estTime);
            data.put("elvStart", elvStart);
            data.put("elvDeposit", elvDeposit);
            data.put("aspect", aspect);
            data.put("aspect1", aspect1);
            data.put("aspect2", aspect2);
            data.put("type", type);
            data.put("wcStart", wcStart);
            data.put("wcDeposit", wcDeposit);
            data.put("triggerType", triggerType);
            data.put("triggerCode", triggerCode);
            data.put("USSize", USSize);
            data.put("CASize", CASize);
            data.put("avgFractureDepth", avgFractureDepth);
            data.put("maxFractureDepth", maxFractureDepth);
            data.put("levelOfBedSurface", levelOfBedSurface);
            data.put("weakLayerType", weakLayerType);
            data.put("weakLayerHardness", weakLayerHardness);
            data.put("hardnessAbove", hardnessAbove);
            data.put("hardnessBelow", hardnessBelow);
            data.put("fractureWidth", fractureWidth);
            data.put("fractureLength", fractureLength);
            data.put("lengthOfAvalanche", lengthOfAvalanche);
            data.put("avgStartAngle", avgStartAngle);
            data.put("maxStartAngle", maxStartAngle);
            data.put("minStartAngle", minStartAngle);
            data.put("alphaAngle", alphaAngle);
            data.put("depthOfDeposit", depthOfDeposit);
            data.put("lengthOfDeposit", lengthOfDeposit);
            data.put("widthOfDeposit", widthOfDeposit);
            data.put("areaOfDeposit", areaOfDeposit);
            data.put("densityOfDeposit", densityOfDeposit);
            data.put("injury", injury);
            data.put("fatality", fatality);
            data.put("estDamage", estDamage);
            data.put("comments", comments);
            data.put("hasPit", hasPit);
            data.put("hsuffix", hsuffix);
            data.put("hsuffixAbove", hsuffixAbove);
            data.put("hsuffixBelow", hsuffixBelow);
            data.put("crystalTypeAbove", crystalTypeAbove);
            data.put("crystalTypeBelow", crystalTypeBelow);
            data.put("crystalSizeAbove", crystalSizeAbove);
            data.put("crystalSize", crystalSize);
            data.put("crystalSizeBelow", crystalSizeBelow);
            data.put("sizeSuffixAbove", sizeSuffixAbove);
            data.put("sizeSuffixBelow", sizeSuffixBelow);
            data.put("sizeSuffix", sizeSuffix);
            data.put("numPeopleCaught", numPeopleCaught);
            data.put("numPeoplePartBuried", numPeoplePartBuried);
            data.put("numPeopleTotalBuried", numPeopleTotalBuried);
            data.put("bldgDmg", bldgDmg);
            data.put("eqDmg", eqDmg);
            data.put("vehDmg", vehDmg);
            data.put("miscDmg", miscDmg);
            data.put("totDmg", miscDmg);
            data.put("snowPackType", snowPackType);
            data.put("causeOfRelease", causeOfRelease);
            data.put("sympathetic", sympathetic);
            data.put("sympDistance", sympDistance);
            data.put("serial", serial);
            data.put("edited", edited);
            data.put("archname", archname);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
    public void getAttributes()
    {
    	//System.out.println("AvOcc getAttributes()");
    	pitObs = getAttString("pitObs");
    	estDate = getAttString("estDate");
    	estTime = getAttString("estTime");
    	elvStart = getAttString("elvStart");
    	elvDeposit = getAttString("elvDeposit");
    	aspect = getAttString("aspect");
    	aspect1 = getAttString("aspect1");
    	aspect2 = getAttString("aspect2");
    	type = getAttString("type");
    	wcStart = getAttString("wcStart");
    	wcDeposit = getAttString("wcDeposit");
    	triggerType = getAttString("triggerType");
    	triggerCode = getAttString("triggerCode");
    	USSize = getAttString("USSize");
    	CASize = getAttString("CASize");
    	avgFractureDepth = getAttString("avgFractureDepth");
    	maxFractureDepth = getAttString("maxFractureDepth");
    	levelOfBedSurface = getAttString("levelOfBedSurface");
    	weakLayerType = getAttString("weakLayerType");
    	weakLayerHardness = getAttString("weakLayerHardness");
    	hardnessAbove = getAttString("hardnessAbove");
    	hardnessBelow = getAttString("hardnessBelow");
    	fractureWidth = getAttString("fractureWidth");
    	fractureLength = getAttString("fractureLength");
    	lengthOfAvalanche = getAttString("lengthOfAvalanche");
    	avgStartAngle = getAttString("avgStartAngle");
		maxStartAngle = getAttString("maxStartAngle");
		minStartAngle = getAttString("minStartAngle");
		alphaAngle = getAttString("alphaAngle");
		depthOfDeposit = getAttString("depthOfDeposit");
        lengthOfDeposit = getAttString("lengthOfDeposit");
        widthOfDeposit = getAttString("widthOfDeposit");
		areaOfDeposit = getAttString("areaOfDeposit");
    	densityOfDeposit = getAttString("densityOfDeposit");
    	injury = getAttString("injury");
    	fatality = getAttString("fatality");
    	estDamage = getAttString("estDamage");
    	comments = getAttString("comments");
    	hasPit = getAttString("hasPit");
    	hsuffix = getAttString("hsuffix");
    	hsuffixBelow = getAttString("hsuffixBelow");
    	hsuffixAbove = getAttString("hsuffixAbove");
    	crystalTypeAbove = getAttString("crystalTypeAbove");
    	crystalTypeBelow = getAttString("crystalTypeBelow");
    	
    	crystalSizeAbove = getAttString("crystalSizeAbove");
    	crystalSizeBelow = getAttString("crystalSizeBelow");
        crystalSize = getAttString("crystalSize");
    	sizeSuffixAbove = getAttString("sizeSuffixAbove");
    	sizeSuffixBelow = getAttString("sizeSuffixBelow");
        sizeSuffix = getAttString("sizeSuffix");
    	numPeopleCaught = getAttString("numPeopleCaught");
    	numPeoplePartBuried = getAttString("numPeoplePartBuried");
    	numPeopleTotalBuried = getAttString("numPeopleTotalBuried");
    	bldgDmg = getAttString("bldgDmg");
    	eqDmg = getAttString("eqDmg");
    	vehDmg = getAttString("vehDmg");
    	miscDmg = getAttString("miscDmg");
        totDmg = getAttString("totDmg");
        snowPackType = getAttString("snowPackType");
        causeOfRelease = getAttString("causeOfRelease");
        sympathetic = getAttString("sympathetic");
        sympDistance = getAttString("sympDistance");
        serial = getAttString("serial");
        edited = getAttString("edited");
        archname = getAttString("archname");
    }
    
    private String getAttString(String key)
    {
    	String s = "";
        try
        {
            if (( key==null ) || ( key.trim().length()<1)) return s;
            Object o = data.get(key);
            if ( o!=null)
            {
                s = (String) o;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    	return s;
    }
    
    public AvOccurence(){super();}
    
    public AvOccurence(String data)
    {
    	this();
        popFromString(data);
    }
    
    public boolean hasPit()
    { 
    	if ( hasPit.equals("true") ) return true;
    	else return false;
    }
    
    
    public void setHasPit(boolean has)
    {
    	if ( has ) hasPit = "true";
    	else hasPit = "false";
    }
   
    public void setPitName(String name)
    {
    	this.pitObs = name;
    }
    public void setEstDate(String estDate){this.estDate = estDate;}
    public void setEstTime(String estTime) {this.estTime = estTime;}
    public void setElvStart(String elvStart) {this.elvStart = elvStart;}
    public void setElvDeposit(String elvDeposit) {this.elvDeposit = elvDeposit;}
    public void setAspect(String aspect){this.aspect = aspect;} 
    public void setAspect1(String aspect){this.aspect1 = aspect;} 
    public void setAspect2(String aspect){this.aspect2 = aspect;} 
    public void setType(String type){this.type = type;}
    public void setWcStart(String wcStart){this.wcStart = wcStart;}
    public void setWcDeposit(String wcDeposit){this.wcDeposit = wcDeposit;}
    public void setTriggerType(String triggerType){this.triggerType = triggerType;}
    public void setTriggerCode(String triggerCode) {this.triggerCode = triggerCode;}
    public void setUSSize(String USSize){this.USSize = USSize;}
    public void setCASize(String CASize){this.CASize = CASize;} 
    public void setAvgFractureDepth(String avgFractureDepth){this.avgFractureDepth = avgFractureDepth;}
    public void setMaxFractureDepth(String maxFractureDepth){this.maxFractureDepth = maxFractureDepth;}
    public void setLevelOfBedSurface(String levelOfBedSurface){this.levelOfBedSurface = levelOfBedSurface;}
    public void setWeakLayerType(String weakLayerType){this.weakLayerType = weakLayerType;}
    public void setWeakLayerHardness(String weakLayerHardness){this.weakLayerHardness = weakLayerHardness;}
    public void setHardnessAbove(String hardnessAbove){this.hardnessAbove = hardnessAbove;}
    public void setHardnessBelow(String hardnessBelow){this.hardnessBelow = hardnessBelow;}
    public void setFractureWidth(String fractureWidth){this.fractureWidth = fractureWidth;}
    public void setFractureLength(String fractureLength){this.fractureLength = fractureLength;}
    public void setLengthOfAvalanche(String lengthOfAvalanche){this.lengthOfAvalanche = lengthOfAvalanche;}
    public void setAvgStartAngle(String avgStartAngle){this.avgStartAngle = avgStartAngle;}
    public void setMaxStartAngle(String maxStartAngle){this.maxStartAngle = maxStartAngle;}    
    public void setMinStartAngle(String minStartAngle){this.minStartAngle = minStartAngle;}    
    public void setAlphaAngle(String alphaAngle){this.alphaAngle = alphaAngle;}  
    public void setDepthOfDeposit(String depthOfDeposit) {this.depthOfDeposit = depthOfDeposit;}
    public void setLengthOfDeposit(String s) {this.lengthOfDeposit = s;}
    public void setWidthOfDeposit(String s) {this.widthOfDeposit = s;}
    public void setAreaOfDeposit(String areaOfDeposit) {this.areaOfDeposit = areaOfDeposit;}
    public void setDensityOfDeposit(String densityOfDeposit) {this.densityOfDeposit = densityOfDeposit;}
    public void setInjury(String injury) {this.injury = injury;}
    public void setFatality(String fatality) {this.fatality = fatality;}
    public void setEstDamage(String estDamage) {this.estDamage = estDamage;}
    public void setComments(String comments) {this.comments = comments;}
    public void setHsuffix(String s) {this.hsuffix = s;}
    public void setHsuffixAbove(String s) {this.hsuffixAbove = s;}
    public void setHsuffixBelow(String s) {this.hsuffixBelow = s;}
    public void setCrystalTypeAbove(String s) {this.crystalTypeAbove = s;}
    public void setCrystalTypeBelow(String s) {this.crystalTypeBelow = s;}
    public void setCrystalSizeAbove(String s) {this.crystalSizeAbove = s;}
    public void setCrystalSize(String s) {this.crystalSize = s;}
    public void setCrystalSizeBelow(String s) {this.crystalSizeBelow = s;}
    public void setSizeSuffixBelow(String s) {this.sizeSuffixBelow = s;}
    public void setSizeSuffixAbove(String s) {this.sizeSuffixAbove = s;}
    public void setSizeSuffix(String s) {this.sizeSuffix = s;}
    public void setNumPeopleCaught(String s){this.numPeopleCaught = s;}
    public void setNumPeoplePartBuried(String s){this.numPeoplePartBuried = s;}
    public void setNumPeopleTotalBuried(String s){this.numPeopleTotalBuried = s;}
    public void setBldgDmg(String s){this.bldgDmg = s;}
    public void setEqDmg(String s){this.eqDmg = s;}
    public void setVehDmg(String s){this.vehDmg = s;}
    public void setMiscDmg(String s){this.miscDmg = s;}
    public void setTotalDmg(String s){this.totDmg = s;}
    public void setSnowPackType(String s){this.snowPackType = s;}
    public void setCauseOfRelease(String s){this.causeOfRelease = s;}
    public void setSympathetic(String s){this.sympathetic = s;}
    public void setSympDistance(String s){this.sympDistance = s;}
   	public void setSerial(String s){serial = s;}
   	public void setArchName(String s){archname = s;}
   	public void setEdited(boolean edited)
   	{
   		if (edited) this.edited = "true";
   		else this.edited="false";
   	}
   	
    public String getPitName(){ return pitObs; }
    public String getEstDate(){ return estDate; }
    public String getEstTime(){ return estTime; }
    public String getElvStart(){ return elvStart; }
    public String getElvDeposit(){ return elvDeposit; }
    public String getAspect(){ return aspect; }
    public String getAspect1(){ return aspect1; }
    public String getAspect2(){ return aspect2; }
    public String getType(){ return type; }
    public String getWcStart(){ return wcStart; }
    public String getWcDeposit(){ return wcDeposit; }
    public String getTriggerType(){ return triggerType; }
    public String getTriggerCode(){ return triggerCode; }
    public String getUSSize(){ return USSize; }
    public String getCASize(){ return CASize; }
    public String getAvgFractureDepth(){ return avgFractureDepth; }
    public String getMaxFractureDepth(){ return maxFractureDepth; }
    public String getLevelOfBedSurface(){ return levelOfBedSurface; }
    public String getWeakLayerType(){ return weakLayerType; }
    public String getWeakLayerHardness(){ return weakLayerHardness; }
    public String getHardnessAbove(){ return  hardnessAbove; }
    public String getHardnessBelow(){ return  hardnessBelow; }
    public String getFractureWidth(){ return  fractureWidth; }
    public String getFractureLength(){ return  fractureLength; }
    public String getLengthOfAvalanche(){ return lengthOfAvalanche; }
    public String getAvgStartAngle(){ return avgStartAngle; }
    public String getMinStartAngle(){ return minStartAngle; }
    public String getMaxStartAngle(){ return maxStartAngle; }
    public String getAlphaAngle(){ return alphaAngle; }
    public String getDepthOfDeposit(){ return depthOfDeposit; }
    public String getLengthOfDeposit(){ return lengthOfDeposit; }
    public String getWidthOfDeposit(){ return widthOfDeposit; }
    public String getAreaOfDeposit(){ return areaOfDeposit; }
    public String getDensityOfDeposit(){ return densityOfDeposit; }
    public String getInjury(){ return injury; }
    public String getFatality(){ return fatality; }
    public String getEstDamage(){ return estDamage; }
    public String getComments(){ return comments; }
    public String getHsuffix(){ return hsuffix; }
    public String getHsuffixAbove(){ return hsuffixAbove; }
    public String getHsuffixBelow(){ return hsuffixBelow; }
    public String getCrystalTypeAbove(){ return crystalTypeAbove; }
    public String getCrystalTypeBelow(){ return crystalTypeBelow; }
    public String getCrystalSizeAbove() {return crystalSizeAbove;}
    public String getCrystalSizeBelow() {return crystalSizeBelow;}
    public String getCrystalSize() {return crystalSize;}
    public String getSizeSuffixBelow() {return sizeSuffixBelow;}
    public String getSizeSuffixAbove() {return sizeSuffixAbove;}
    public String getSizeSuffix() {return sizeSuffix;}
    public String getNumPeopleCaught(){return numPeopleCaught;}
    public String getNumPeoplePartBuried(){return numPeoplePartBuried;}
    public String getNumPeopleTotalBuried(){return numPeopleTotalBuried;}
    public String getBldgDmg(){return bldgDmg;}
    public String getEqDmg(){return eqDmg;}
    public String getVehDmg(){return vehDmg;}
    public String getMiscDmg(){return miscDmg;}
    public String getTotalDmg(){return totDmg;}
    public String getSnowPackType(){return snowPackType;}
    public String getCauseOfRelease(){return causeOfRelease;}
    public String getSympathetic(){return sympathetic;}
    public String getSympDistance(){return sympDistance;}
    public String getSerial(){return serial;}
    public String getArchName(){return archname;}
    public boolean getEdited()
    {
    	if (edited.equals("true")) return true;
    	else return false;
    }
}