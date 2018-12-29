package netty;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-29 上午10:59
 **/

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * handler 是由 Netty 生成用来处理 I/O 事件的。
 */
public class DiscardServerHandler extends ChannelInboundHandlerAdapter { // (1)
    /**
     * 这里我们覆盖了 chanelRead() 事件处理方法。
     * 每当从客户端收到新的数据时，这个方法会在收到消息时被调用。
     *((ByteBuf) msg).release()：丢弃数据
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) { // (2)
        ByteBuf in = (ByteBuf) msg;
        try {
            while (in.isReadable()) { // (1)
                System.out.print((char) in.readByte());
                System.out.flush();
            }
        } finally {
            ReferenceCountUtil.release(msg); // (2)
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { // (4)
        // 当出现异常就关闭连接
        cause.printStackTrace();
        ctx.close();
    }
}
