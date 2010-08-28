package org.factor45.efflux.network;

import org.factor45.efflux.logging.Logger;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneDecoder;
import org.jboss.netty.logging.InternalLogger;
import org.jboss.netty.logging.InternalLoggerFactory;

/**
 * @author <a href="mailto:bruno.carvalho@wit-software.com">Bruno de Carvalho</a>
 */
public class ControlPacketDecoder extends OneToOneDecoder {

    // constants ------------------------------------------------------------------------------------------------------

    protected static final Logger LOG = Logger.getLogger(OneToOneDecoder.class);

    // OneToOneDecoder ------------------------------------------------------------------------------------------------

    @Override
    protected Object decode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {
        if (!(msg instanceof ChannelBuffer)) {
            return null;
        }

        try {
            //return RtcpPacket.decode((ChannelBuffer) msg);
            return null;
        } catch (Exception e) {
            LOG.debug("Failed to decode RTP packet.", e);
            return null;
        }
    }
}