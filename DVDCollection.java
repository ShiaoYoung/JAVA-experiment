import java.text.NumberFormat;

public class DVDCollection {
    private ArrayInList collection = new ArrayInList();
    private double totalCost;

    public DVDCollection(){}

    public void addDVD(String title, String director, int year,
                       double cost, boolean bluray){
        DVD temp = new DVD(title,director,year,cost,bluray);
        collection.Append(temp);
        totalCost += cost;
    }

    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String reprot = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        reprot += "My DVD Collection\n\n";

        reprot += "Number of DVDs:" + collection.length() + "\n";
        reprot += "Total cost:" + fmt.format(totalCost) + "\n";
        reprot += "Average cost:" + fmt.format(totalCost / collection.length());

        reprot += "\n\nDVD List:\n\n";

        for (int dvd = 0; dvd < collection.length(); dvd++){
            reprot += (collection.Find(dvd)).toString() + "\n";
        }
        return reprot;
    }
}
