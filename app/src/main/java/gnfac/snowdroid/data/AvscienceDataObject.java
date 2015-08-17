package gnfac.snowdroid.data;

import org.json.JSONObject;

/* Super class for all data objects.*/
public abstract class AvscienceDataObject
{
    JSONObject data;
	public AvscienceDataObject()
	{
        try
        {
            data = new JSONObject();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
	}
    
    public String dataString()
    {
        setAttributes();
        return data.toString();
    }
    
    public void popFromString(String s)
	{
        if (s==null) return;
        try
        {
            data = new JSONObject(s);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        getAttributes();
    }
    
    public abstract void getAttributes();
    public abstract void setAttributes();
}