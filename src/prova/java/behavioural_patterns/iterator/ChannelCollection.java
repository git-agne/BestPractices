package prova.java.behavioural_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public interface ChannelCollection
{
    void add(Channel c);
    void remove(Channel c);
    ChannelIterator iterator(ChannelType channelType);
}

class ChannelCollectionImpl implements ChannelCollection
{
    private List<Channel> channels = new ArrayList<>();

    @Override
    public void add(Channel c) {
        channels.add(c);
    }

    @Override
    public void remove(Channel c) {
        channels.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelType channelType) {
        return null;
    }

    private class ChannelIteratorImpl implements ChannelIterator
    {
        private ChannelType channelType;
        private List<Channel> channel;
        private int position;

        public ChannelIteratorImpl(ChannelType channelType, List<Channel> channel) {
            this.channelType = channelType;
            this.channel = channel;
        }

        @Override
        public boolean hasNext() {
            while(position < channel.size()) {
                Channel c = channels.get(position);
                if(c.getType().equals(channelType)) {
                    return true;
                }
                else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position += 1;
            return c;
        }
    }
}
