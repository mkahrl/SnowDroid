package gnfac.snowdroid.data;

import java.util.*;

public final class TempList
{

    public static TempList getInstance()
    {
        return instance;
    }

    private TempList()
    {
        ClistInv = new Hashtable();
        clist = new Vector();
        flist = new Vector();
        FlistInv = new Hashtable();
        init();
    }

    private void init()
    {
        Clist = new Hashtable();
        Clist.put("0", new Integer(0));
        Clist.put("-0.5", new Integer(-5));
        Clist.put("-1", new Integer(-10));
        Clist.put("-1.5", new Integer(-15));
        Clist.put("-2", new Integer(-20));
        Clist.put("-2.5", new Integer(-25));
        Clist.put("-3", new Integer(-30));
        Clist.put("-3.5", new Integer(-35));
        Clist.put("-4", new Integer(-40));
        Clist.put("-4.5", new Integer(-45));
        Clist.put("-5", new Integer(-50));
        Clist.put("-5.5", new Integer(-55));
        Clist.put("-6", new Integer(-60));
        Clist.put("-6.5", new Integer(-65));
        Clist.put("-7", new Integer(-70));
        Clist.put("-7.5", new Integer(-75));
        Clist.put("-8", new Integer(-80));
        Clist.put("-8.5", new Integer(-85));
        Clist.put("-9", new Integer(-90));
        Clist.put("-9.5", new Integer(-95));
        Clist.put("-10", new Integer(-100));
        Clist.put("-10.5", new Integer(-105));
        Clist.put("-11", new Integer(-110));
        Clist.put("-11.5", new Integer(-115));
        Clist.put("-12", new Integer(-120));
        Clist.put("-12.5", new Integer(-125));
        Clist.put("-13", new Integer(-130));
        Clist.put("-13.5", new Integer(-135));
        Clist.put("-14", new Integer(-140));
        Clist.put("-14.5", new Integer(-145));
        Clist.put("-15", new Integer(-150));
        Clist.put("-16", new Integer(-160));
        Clist.put("-17", new Integer(-170));
        Clist.put("-18", new Integer(-180));
        Clist.put("-19", new Integer(-190));
        Clist.put("-20", new Integer(-200));
        Clist.put("-25", new Integer(-250));
        clist.addElement("0");
        clist.addElement("-0.5");
        clist.addElement("-1");
        clist.addElement("-1.5");
        clist.addElement("-2");
        clist.addElement("-2.5");
        clist.addElement("-3");
        clist.addElement("-3.5");
        clist.addElement("-4");
        clist.addElement("-4.5");
        clist.addElement("-5");
        clist.addElement("-5.5");
        clist.addElement("-6");
        clist.addElement("-6.5");
        clist.addElement("-7");
        clist.addElement("-7.5");
        clist.addElement("-8");
        clist.addElement("-8.5");
        clist.addElement("-9");
        clist.addElement("-9.5");
        clist.addElement("-10");
        clist.addElement("-10.5");
        clist.addElement("-11");
        clist.addElement("-11.5");
        clist.addElement("-12");
        clist.addElement("-12.5");
        clist.addElement("-13");
        clist.addElement("-13.5");
        clist.addElement("-14");
        clist.addElement("-14.5");
        clist.addElement("-15");
        clist.addElement("-16");
        clist.addElement("-17");
        clist.addElement("-18");
        clist.addElement("-19");
        clist.addElement("-20");
        clist.addElement("-25");
        Flist = new Hashtable();
        Flist.put("32", new Integer(32));
        Flist.put("31", new Integer(31));
        Flist.put("30", new Integer(30));
        Flist.put("29", new Integer(29));
        Flist.put("28", new Integer(28));
        Flist.put("27", new Integer(27));
        Flist.put("26", new Integer(26));
        Flist.put("25", new Integer(25));
        Flist.put("24", new Integer(24));
        Flist.put("23", new Integer(23));
        Flist.put("22", new Integer(22));
        Flist.put("21", new Integer(21));
        Flist.put("20", new Integer(20));
        Flist.put("19", new Integer(19));
        Flist.put("18", new Integer(18));
        Flist.put("17", new Integer(17));
        Flist.put("16", new Integer(16));
        Flist.put("15", new Integer(15));
        Flist.put("14", new Integer(14));
        Flist.put("13", new Integer(13));
        Flist.put("12", new Integer(12));
        Flist.put("11", new Integer(11));
        Flist.put("10", new Integer(10));
        Flist.put("9", new Integer(9));
        Flist.put("8", new Integer(8));
        Flist.put("7", new Integer(7));
        Flist.put("6", new Integer(6));
        Flist.put("5", new Integer(5));
        Flist.put("4", new Integer(4));
        Flist.put("3", new Integer(3));
        Flist.put("2", new Integer(2));
        Flist.put("1", new Integer(1));
        Flist.put("0", new Integer(0));
        Flist.put("-1", new Integer(-1));
        Flist.put("-2", new Integer(-2));
        Flist.put("-3", new Integer(-3));
        Flist.put("-4", new Integer(-4));
        Flist.put("-5", new Integer(-5));
        Flist.put("-6", new Integer(-6));
        Flist.put("-7", new Integer(-7));
        Flist.put("-8", new Integer(-8));
        Flist.put("-9", new Integer(-9));
        Flist.put("-10", new Integer(-10));
        Flist.put("-15", new Integer(-15));
        flist.addElement("32");
        flist.addElement("31");
        flist.addElement("30");
        flist.addElement("29");
        flist.addElement("28");
        flist.addElement("27");
        flist.addElement("26");
        flist.addElement("25");
        flist.addElement("24");
        flist.addElement("23");
        flist.addElement("22");
        flist.addElement("21");
        flist.addElement("20");
        flist.addElement("19");
        flist.addElement("18");
        flist.addElement("17");
        flist.addElement("16");
        flist.addElement("15");
        flist.addElement("14");
        flist.addElement("13");
        flist.addElement("12");
        flist.addElement("11");
        flist.addElement("10");
        flist.addElement("9");
        flist.addElement("8");
        flist.addElement("7");
        flist.addElement("6");
        flist.addElement("5");
        flist.addElement("4");
        flist.addElement("3");
        flist.addElement("2");
        flist.addElement("1");
        flist.addElement("0");
        flist.addElement("-1");
        flist.addElement("-2");
        flist.addElement("-3");
        flist.addElement("-4");
        flist.addElement("-5");
        flist.addElement("-6");
        flist.addElement("-7");
        flist.addElement("-8");
        flist.addElement("-9");
        flist.addElement("-10");
        flist.addElement("-15");
        Enumeration strings = Clist.keys();
        Integer I;
        String s;
        for(Enumeration temps = Clist.elements(); strings.hasMoreElements() && temps.hasMoreElements(); ClistInv.put(I, s))
        {
            I = (Integer)temps.nextElement();
            s = (String)strings.nextElement();
        }

        strings = Flist.keys();
        for(Enumeration temps = Flist.elements(); strings.hasMoreElements() && temps.hasMoreElements(); FlistInv.put(I, s))
        {
            I = (Integer)temps.nextElement();
            s = (String)strings.nextElement();
        }

    }

    public String getTempString(String units, int temp)
    {
        Integer I = new Integer(temp);
        Hashtable h = null;
        units = units.trim();
        if(units.equals("C"))
            h = ClistInv;
        if(units.equals("F"))
            h = FlistInv;
        String s = (String)h.get(I);
        return s;
    }

    public int getTemp(String units, String temp)
    {
        Integer I = null;
        int i = -1;
        Hashtable h = null;
        units = units.trim();
        if(units.equals("C"))
            h = Clist;
        if(units.equals("F"))
            h = Flist;
        if(h != null)
            I = (Integer)h.get(temp);
        if(I != null)
            i = I.intValue();
        return i;
    }

    public String[] getList(String units)
    {
        units = units.trim();
        Vector list = null;
        if(units.equals("F"))
            list = flist;
        else
            list = clist;
        String List[] = new String[list.size()];
        int i = 0;
        for(Enumeration temps = list.elements(); temps.hasMoreElements();)
        {
            List[i] = (String)temps.nextElement();
            i++;
        }

        return List;
    }

    private Hashtable Clist;
    private Hashtable ClistInv;
    private Vector clist;
    private Vector flist;
    private Hashtable Flist;
    private Hashtable FlistInv;
    private static final TempList instance = new TempList();

}
