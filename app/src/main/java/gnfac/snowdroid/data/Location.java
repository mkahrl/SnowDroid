 package gnfac.snowdroid.data;

  public class  Location extends AvscienceDataObject
  {
    private String name;
    private String state;
    private String range;
    private String lat;
    private String longitude;
    private String elv;
    private String ID;
    private String ew;
    private String ns;
    public String type;
    public String zone;
    public String east;
    public String north;
  
    public void setAttributes()
    {
        try
        {
            this.data.put("ew", this.ew);
            this.data.put("ns", this.ns);
            this.data.put("name", this.name);
            this.data.put("state", this.state);
            this.data.put("range", this.range);
            this.data.put("lat", this.lat);
            this.data.put("longitude", this.longitude);
            this.data.put("elv", this.elv);
            this.data.put("ID", this.ID);
            this.data.put("type", this.type);
            this.data.put("zone", this.zone);
            this.data.put("east", this.east);
            this.data.put("north", this.north);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }

    }
  
    public Location()
    {
        this.name = "";
        this.state = "";
        this.range = "";
        this.lat = "";
        this.longitude = "";
        this.elv = "";
        this.ID = "";
        this.ew = "W";
        this.ns = "N";
        this.type = "LATLON";
        this.zone = "17T";
        this.east = "0";
        this.north = "0";
    }
  
    public Location(User user)
    {
        this.ew = user.getLongType();
        this.ns = user.getLatType();
        if (!(user.coordType.equals("UTM"))) return;
        this.type = "UTM";
    }
  
    public Location(String data)
    {
        popFromString(data);
    }
  
    public Location(User user, String name, String state, String range, String lat, String longitude, String elv, String id)
    {
        this.name = "";
        this.state = "";
        this.range = "";
        this.lat = "";
        this.longitude = "";
        this.elv = "";
        this.ID = "";
        this.ew = "W";
        this.ns = "N";
        this.type = "LATLON";
        this.zone = "17T";
        this.east = "0";
        this.north = "0";
  
        this.name = name;
        this.state = state;
        this.range = range;
        this.lat = lat;
        this.longitude = longitude;
        this.elv = elv;
        this.ID = id;
        this.ew = user.getLongType();
        this.ns = user.getLatType();
        this.type = "LATLON";
    }
  
    public Location(User user, String name, String state, String range, String zone, String east, String north, String elv, String id)
    {
        this.name = "";
        this.state = "";
        this.range = "";
        this.lat = "";
        this.longitude = "";
        this.elv = "";
        this.ID = "";
        this.ew = "W";
        this.ns = "N";
        this.type = "LATLON";
        this.zone = "17T";
        this.east = "0";
        this.north = "0";
  
        this.name = name;
        this.state = state;
        this.range = range;
        this.zone = zone;
        this.east = east;
        this.north = north;
        this.elv = elv;
        this.ID = id;
        this.type = "UTM";
    }
  
    public void getAttributes()
    {
        try
        {
            this.ew = ((String)this. data.get("ew"));
            this.ns = ((String)this. data.get("ns"));
            this.name = ((String)this. data.get("name"));
            this.state = ((String)this. data.get("state"));
            this.lat = ((String)this. data.get("lat"));
            this.longitude = ((String)this. data.get("longitude"));
            this.elv = ((String)this. data.get("elv"));
            this.range = ((String)this. data.get("range"));
            this.ID = ((String)this. data.get("ID"));
            this.type = ((String)this. data.get("type"));
            this.zone = ((String)this.data.get("zone"));
            this.east = ((String)this.data.get("east"));
            this.north = ((String)this.data.get("north"));
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }
  
    public String getLocName()
    {
    return this.name;
    }
  
    public void setName(String name)
    {
     this.name = name;
    }
  
    public void setRange(String range)
    {
     this.range = range;
    }
  
    public void setState(String state)
    {
    this.state = state;
    }
  
    public void setLat(String lat)
    {
     this.lat = lat;
    }
  
    public void setLongitude(String longitude)
    {
     this.longitude = longitude;
    }
  
    public String getName()
    {
     return this.name;
    }
  
    public String getState()
    {
    return this.state;
    }
  
    public String getLat()
    {
     return this.lat;
    }
  
    public String getLongitude()
    {
     return this.longitude;
    }
  
    public String getElv()
    {
     return this.elv;
    }
  
    public String getRange()
    {
     return this.range;
    }
  
    public String getLongType()
    {
     return this.ew;
    }
  
    public String getLatType()
    {
     return this.ns;
    }
  
    public String getID()
    {
     return this.ID;
    }
  
    public String toString()
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append(this.name);
        buffer.append(", State/Prov: " + this.state);
        buffer.append(", Range: " + this.range);
        buffer.append(", Lat N: " + this.lat);
        buffer.append(", Long. W: " + this.longitude);
        buffer.append(", Elevation: " + this.elv + " ");
        return buffer.toString();
    }
  }