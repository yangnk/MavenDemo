package netty.myNetty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.oio.OioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.oio.OioServerSocketChannel;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-29 下午3:02
 **/
public class NettyOioServer {

    public void server(int port) throws Exception {
        final ByteBuf buf = Unpooled.unreleasableBuffer(Unpooled.copiedBuffer("Hi!\r\n", Charset.forName("UTF-8")));
        //NIO线程组
        EventLoopGroup group = new OioEventLoopGroup();
        try {
            //创建netty配置
            ServerBootstrap b = new ServerBootstrap();        //1
            //通过指责链创建
            b.group(group)                                    //2
                    .channel(OioServerSocketChannel.class)
                    .localAddress(new InetSocketAddress(port))
                    .childHandler(new ChannelInitializer<SocketChannel>() {//3
                        @Override
                        public void initChannel(SocketChannel ch)
                                throws Exception {
                            //ChannelInboundHandlerAdapter负责真正处理
                            ch.pipeline().addLast(new ChannelInboundHandlerAdapter() {            //4
                                @Override
                                public void channelActive(ChannelHandlerContext ctx) throws Exception {
                                    ctx.writeAndFlush(buf.duplicate()).addListener(ChannelFutureListener.CLOSE);//5
                                }
                            });
                        }
                    });
            //绑定
            ChannelFuture f = b.bind().sync();  //6
            //关闭
            f.channel().closeFuture().sync();
        } finally {
            group.shutdownGracefully().sync();        //7
        }
    }

    public static void main(String[] args) {
        try {
            new NettyOioServer().server(8888);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
