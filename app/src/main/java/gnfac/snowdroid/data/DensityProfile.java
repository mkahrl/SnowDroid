package gnfac.snowdroid.data;

import java.util.*;

public class DensityProfile extends AvscienceDataObject
{

    public DensityProfile()
    {
        densityUnits = "";
        depthUnits = "";
        depths = new Hashtable();
        profile = new Hashtable();
    }

    public DensityProfile(String s)
    {
        this();
        popFromString(s);
    }

    public void setAttributes()
    {
        try
        {
            data.put("densityUnits", densityUnits);
            data.put("depthUnits", depthUnits);
            data.put("depths", depths);
            data.put("profile", profile);
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
            densityUnits = (String)data.get("densityUnits");
            depthUnits = (String)data.get("depthUnits");
            depths = (Hashtable)data.get("depths");
            profile = (Hashtable)data.get("profile");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }

    public String[] getPoints()
    {
        String as[] = new String[profile.size()];
        Enumeration enumeration = getDepths().elements();
        for(int i = 0; enumeration.hasMoreElements(); i++)
        {
            Integer integer = (Integer)enumeration.nextElement();
            String s = "Depth " + integer.toString() + " Density " + (String)profile.get(integer) + " " + densityUnits;
            as[i] = s;
        }

        return as;
    }

    public DensityProfile(String s, String s1)
    {
        densityUnits = "";
        depthUnits = "";
        depths = new Hashtable();
        profile = new Hashtable();
        densityUnits = s;
        depthUnits = s1;
    }

    public boolean addPoint(int i, String s)
    {
        Integer integer = new Integer(i);
        depths.put(integer.toString(), integer);
        Object obj = profile.put(integer, s);
        return obj == null;
    }

    public String getDensity(Integer integer)
    {
        String s = (String)profile.get(integer);
        return s;
    }

    public Vector getDensities()
    {
        Vector vector = new Vector();
        Enumeration enumeration = profile.elements();
        do
        {
            if(!enumeration.hasMoreElements())
                break;
            String s = (String)enumeration.nextElement();
            if(s != null)
                vector.addElement(s);
        } while(true);
        return vector;
    }

    public Vector getDepths()
    {
        Vector vector = new Vector();
        Enumeration enumeration = profile.keys();
        if(enumeration != null)
        {
            Integer integer;
            for(; enumeration.hasMoreElements(); vector.addElement(integer))
                integer = (Integer)enumeration.nextElement();

        }
        return vector;
    }

    public void removePoint(String s)
    {
        Integer integer = (Integer)depths.get(s);
        profile.remove(integer);
    }

    public boolean hasPoints()
    {
        return profile.size() > 0;
    }

    public String getDensityUnits()
    {
        return densityUnits;
    }

    public String getDepthUnits()
    {
        return depthUnits;
    }

    private String densityUnits;
    private String depthUnits;
    private Hashtable depths;
    private Hashtable profile;
}
