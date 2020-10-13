package uaslp.enginering.labs;

public class ListBox  extends  Control{
    private String[] labels;

    public ListBox (String label1,String label2){
        labels = new String[2];
        labels[0]=label1;
        labels[1]=label2;
    }

    public ListBox (String label1,String label2,String label3){
        labels = new String[3];
        labels[0]=label1;
        labels[1]=label2;
        labels[2]=label3;
    }

    public void draw(){
        for(int i=0;i<labels.length;i++) {
            System.out.print(labels[i] + " - ");
        }
    }
}
