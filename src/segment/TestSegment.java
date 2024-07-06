package segment;

public class TestSegment {

    public static void main(String[] args){

        Segment segment = new Segment(-35,44);
        segment.setExtr1(78);
        boolean belong=segment.appartient(7);
        System.out.println(belong);
        System.out.println(segment);
    }
}
