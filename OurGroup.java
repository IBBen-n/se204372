import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Benjarat Thongklao");
	groupMembers.add("Benjarat Chaitrak"); 
	groupMembers.add("Paranee Krutnid");//PUT YOUR NAME HERE

    }

    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
