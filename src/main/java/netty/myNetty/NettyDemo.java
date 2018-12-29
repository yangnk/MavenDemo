package netty.myNetty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.nio.charset.Charset;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-29 下午3:58
 **/
public class NettyDemo {
    ByteBuf byteBuf = Unpooled.unreleasableBuffer(Unpooled.copiedBuffer("Hi!\r\n", Charset.forName("UTF-8")));

    void server(int port) throws InterruptedException {
        //创建NIO线程组
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
        try {
            //创建Netty配置
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            //职责链调用
            serverBootstrap.group(eventLoopGroup)
                    .localAddress(port)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new ChannelInboundHandlerAdapter(){
                                @Override
                                public void channelActive(ChannelHandlerContext ctx) throws Exception {
                                    //塞值进去
                                    ctx.writeAndFlush(byteBuf.duplicate()).addListener(ChannelFutureListener.CLOSE);
                                }
                            });
                        }
                    });

            try {
                //绑定
                ChannelFuture channelFuture = serverBootstrap.bind().sync();
                //关闭
                channelFuture.channel().closeFuture().sync();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            eventLoopGroup.shutdownGracefully().sync();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        if (args.length > 0) {
            new NettyDemo().server(Integer.valueOf(args[0]));
        }
        new NettyDemo().server(8888);
    }
}
