package prova.java.behavioural_patterns.iterator;

public class Main
{
    public static void main(String[] args) {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.add(new Channel(100.0, ChannelType.ENGLISH));
        channels.add(new Channel(120.0, ChannelType.ITALIAN));
        channels.add(new Channel(130.0, ChannelType.FRENCH));
        // Aggregato

        // Se voglio iterare solo su canali inglesi
        ChannelIterator it = channels.iterator(ChannelType.ENGLISH);
        while(it.hasNext()) {
            Channel c = it.next();
            System.out.println(c);
        }
    }
}
