import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Benjarat Thongklao");
	groupMembers.add("YOUR NAME"); //PUT YOUR NAME HERE

    }

    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
